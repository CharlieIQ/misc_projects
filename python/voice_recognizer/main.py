import speech_recognition as sr
import pyttsx3

r = sr.Recognizer()
# Theoretically this will speak what has been said
# def SpeakText(command):

#     engine = pyttsx3.init()
#     engine.say(command)
#     engine.runAndWait()

with sr.Microphone() as source2:
    r.adjust_for_ambient_noise(source2, duration=0.2)

    audio2 = r.listen(source2)

    MyText = r.recognize_google(audio2)
    MyText = MyText.lower()
    # SpeakText(MyText)

statement = f"You said:\n{'*'*50}\n {MyText} \n{'*'*50}"

print(statement)