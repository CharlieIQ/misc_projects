import speech_recognition as sr
# import pyttsx3

f = open('logs.txt', 'w')

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


trigger = int(input("""Enter 1 to run once\nEnter 2 to run indefinitely\n0 to quit\n"""))

if trigger == 1:
    # Runs text function
    said_text = text()
    print(f"You said: \n{'*'*50}\n {said_text} \n{'*'*50}")
    f.write(str(said_text))
    trigger = int(input("""Enter 1 to run once\nEnter 2 to run indefinitely\n0 to quit\n"""))

elif trigger == 2:
    # Not working great still
    while trigger == 2:
        said_text = text()
        print(f"You said: \n{'*'*50}\n {said_text} \n{'*'*50}")
        f.write(said_text)
        f.close

else:
    print('Stopping:')
    f.close()
    quit()