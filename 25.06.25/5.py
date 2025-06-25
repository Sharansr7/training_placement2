import face_recognition
import cv2
import os
from datetime import datetime

path = 'faces'
images = []
names = []
for file in os.listdir(path):
    img = face_recognition.load_image_file(f'{path}/{file}')
    images.append(face_recognition.face_encodings(img)[0])
    names.append(os.path.splitext(file)[0])

cap = cv2.VideoCapture(0)

while True:
    ret, frame = cap.read()
    faces = face_recognition.face_locations(frame)
    encodings = face_recognition.face_encodings(frame, faces)

    for enc, loc in zip(encodings, faces):
        matches = face_recognition.compare_faces(images, enc)
        name = "Unknown"
        if True in matches:
            name = names[matches.index(True)]
            with open("attendance.csv", "a") as f:
                f.write(f"{name},{datetime.now()}\n")

        cv2.rectangle(frame, (loc[3], loc[0]), (loc[1], loc[2]), (255, 0, 0), 2)
        cv2.putText(frame, name, (loc[3], loc[0] - 10), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)

    cv2.imshow("Attendance", frame)
    if cv2.waitKey(1) == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()
