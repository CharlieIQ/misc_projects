"""
This is an attempt to make math easier...
(I'm bad at math)
"""
import functions

MENU_OPTIONS = f"""Press 'v' to view formulas
Press 'c' to use formula
Press 'q' to quit
"""
formulas = ['Pythagorean', 'Square']

def Menu():
    choice = input(MENU_OPTIONS)
    while choice != 'q':
        if choice == 'v':
            print(formulas)
        elif choice == 'c':
            formula_controller()
        elif choice != type(str):
            print('Not a string, please try again')

        choice = input(MENU_OPTIONS)

def formula_controller():
    print(formulas)
    choice = str(input('Choose formula: '))
    if choice == 'Pythagorean' or 'pythagorean':
        functions.py_theorem()
    elif choice == 'Square' or 'square':
        print(functions.square_list)
        square_choice = str(input('Calculate what for square? '))
        if square_choice == 'area':
            functions.square_area()


Menu()


