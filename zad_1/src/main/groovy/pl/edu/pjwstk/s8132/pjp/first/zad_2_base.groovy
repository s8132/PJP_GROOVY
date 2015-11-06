package pl.edu.pjwstk.s8132.pjp.first

import static javax.swing.JOptionPane.*

map = [:].withDefault {0}

while(true){
    val = showInputDialog("Wpisz pozycję (produkt = cena):")

    if(val==null) break;

    val = val.tokenize("=")

    if(val.size()==2 && val[1].isNumber()){
        map[val[0].trim()] += val[1].toBigDecimal()
    }
}

showMessageDialog(null, "Rezultat: $map")