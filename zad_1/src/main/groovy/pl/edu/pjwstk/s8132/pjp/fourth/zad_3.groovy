package pl.edu.pjwstk.s8132.pjp.fourth

def Boolean validateDayInMonth(String format, String date){
    Date.parse(format, date).format(format).equals(date)
//    def Date d = Date.parse(format, date);
//    println d.format(format).toString()
//    (d.month+1).equals(date[format.indexOf("M")..format.lastIndexOf("M")].toInteger())
}

def txt = '''
Zjazd 1: 2015-09-26
Zjazd 2: 2015-10-10
Zjazd 3: 2015-10-24
Zjazd 4: 2015-11-14
Zjazd 5: 2015-11-31 (niepoprawna)
'''

//(txt=~/(\d{4}-\d{2}-\d{2})/).each {match, group -> println "match: $match, group: $group"}
//txt.eachMatch(/\d{4}-\d{2}-\d{2}/){println it}

//(txt=~/\d{4}-\d{2}-\d{2}/).each {
//    if(validateDayInMonth("yyyy-MM-dd", it.toString())) println it
//}

(txt=~/\d{4}-\d{2}-\d{2}/).findAll {validateDayInMonth("yyyy-MM-dd", it.toString())}.each {println it}