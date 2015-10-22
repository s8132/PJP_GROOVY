package pl.edu.pjwstk.s8132.pjp.second

import static javax.swing.JOptionPane.*

def getData(Class<?> claz = String, Closure closure = {return true}, Boolean error = false, String listWithError = ""){
    list = []
    error ? (val = showInputDialog(null, "Podaj poprawną listę liczb:", listWithError)) : (val = showInputDialog("Podaj listę liczb:"))

    if(val!=null){
        val.tokenize(" ").each {
            try{
                newVal = it.asType(claz)
                if(closure(newVal)){
                    list << newVal
                }else{
                    getData(claz, closure, true, val)
                }
            }catch (Exception e){
                getData(claz, closure, true, val)
            }

        }
    }

    list
}

//println getData(Integer) { it > 0 }     // liczby całkowite większe od 0
//println getData(){ it.size() > 3 }  // słowa o długości większej od 3 (domyślny typ: String)
//println getData()                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby