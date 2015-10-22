package pl.edu.pjwstk.s8132.pjp.first

import static javax.swing.JOptionPane.*

map = [:]

while(true){
    val = showInputDialog("Wpisz pozycję (produkt = cena):")

    if(val==null) break;

    val = val.tokenize("=")

    if(val.size()==2 && val[1].isNumber()){
        product = val[0].trim()
        price = val[1].toBigDecimal()
        (map[product]==null) ? map[product] = price : (map[product] +=  price)
    }
}

showMessageDialog(null, "Rezultat: $map")