package pl.edu.pjwstk.s8132.pjp.first

import static javax.swing.JOptionPane.*

def map = ["0":"zero", "1":"jeden", "2":"dwa", "3":"trzy", "4":"cztery", "5":"pięć", "6":"sześć", "7":"siedem", "8":"osiem", "9":"dziewięć"]
def num = showInputDialog("Wpisz numer:")
def li = []
(num=~/\d/).each { li << map[it as String]}

println li.join(" - ")