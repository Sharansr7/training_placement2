import cv2, pyautogui
import numpy as np

screen_size = (1920, 1080)
out = cv2.VideoWriter("record.avi", cv2.VideoWriter_fourcc(*"XVID"), 20, screen_size)

while True:
    img = pyautogui.screenshot()
    frame = np.array(img)
    frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
    out.write(frame)
    if cv2.waitKey(1) == ord('q'):
        break

out.release()
cv2.destroyAllWindows()
