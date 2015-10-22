package pl.edu.pjwstk.s8132.pjp.second

import static javax.swing.JOptionPane.*

def getInts(Boolean error = false, String listWithError = ""){
    list = []
    error ? (val = showInputDialog(null, "Podaj poprawną listę liczb:", listWithError)) : (val = showInputDialog("Podaj listę liczb:"))

    if(val!=null){
        val.tokenize(" ").each {
            it.isInteger() ? list << it.toInteger() : getInts(error = true, listWithError = val)
        }
    }

    list
}


println getInts()