import speech_recognition as sr

rec = sr.Recognizer()

with sr.Microphone() as source:
    print("Speak...")
    audio = rec.listen(source)

try:
    print("You said: " + rec.recognize_google(audio))
except:
    print("Sorry, couldn't recognize.")
