package pl.edu.pjwstk.s8132.pjp.fourth

def rateOfExchange = 4.12

// Przy założeniu, że liczby w tekście występują w formie przyjaznej dla komputera
def txt = '''
    Krzesło: 23.45 PLN
    Biurko: 123.34 PLN
    Komputer: 1234.34 PLN
    Fotel: 23 PLN
    Klawiatura: 25.00 PLN
    Myszka: 231.43 PLN
'''
txt = txt.replaceAll(/(\d+\.?,?\d+) PLN/){all, price ->
    String.format("%.2f", price.toBigDecimal()/rateOfExchange) + ' EUR'
}

println txt

// Przy założeniu, że występują przeciniki
def txt2 = '''
    Krzesło: 23,45 PLN
    Biurko: 123.34 PLN
    Komputer: 1234,34 PLN
    Fotel: 23 PLN
    Klawiatura: 25,00 PLN
    Myszka: 231.43 PLN
'''

txt2 = txt2.replaceAll(/(\d+\.?,?\d+) PLN/){all, price ->
    String.format("%.2f", price.replace(",", ".").toBigDecimal()/rateOfExchange) + ' EUR'
}

println txt2