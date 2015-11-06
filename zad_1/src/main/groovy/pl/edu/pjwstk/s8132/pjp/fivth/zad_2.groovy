package pl.edu.pjwstk.s8132.pjp.fivth

def exmapleMenu = ["Schabowy": 18.50, "Pizza": 21.823, "Hamburger": 12.40, "Zapiekanka": 8.30, "Hot-Dog": 6.70]
def rateOfExchange = 4.12

File menuPL = new File("MenuPL.txt")
File menuEUR = new File("MenuEUR.txt")

def void initFile(Map map, File f){
    f.write("")
    if(!f.exists()) f.createNewFile();
    map.each {key, value -> f.append("$key ${String.format("%.2f", value)}\n")}
}

if(!menuEUR.exists()) menuEUR.createNewFile();
menuEUR.write("")

initFile(exmapleMenu, menuPL)

println("MenuPL:")
menuPL.readLines().each {println "\t$it"}

menuPL.eachLine {
    menuEUR.append(it.replaceAll(/(\d+\.?,?\d+)/){ all, price ->
        String.format("%.2f", price.replace(",", ".").toBigDecimal()/rateOfExchange) + "\n"
    })
}

println("MenuEUR:")
menuEUR.readLines().each {println "\t$it"}