import speech_recognition as sr
import pyttsx3

# Theoretically this will speak what has been said
# def SpeakText(command):

#     engine = pyttsx3.init()
#     engine.say(command)
#     engine.runAndWait()

def text():
    r = sr.Recognizer()
    print('Listening...')

    with sr.Microphone() as source2:
        r.adjust_for_ambient_noise(source2, duration=0.2)

        audio2 = r.listen(source2)

        spoken_text = r.recognize_google(audio2)

        spoken_text = spoken_text.lower()
    # SpeakText(MyText)
    return spoken_text


print(f"You said: \n{'*'*50}\n {text()} \n{'*'*50}")