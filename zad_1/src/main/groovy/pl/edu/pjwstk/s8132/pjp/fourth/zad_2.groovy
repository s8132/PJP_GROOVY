package pl.edu.pjwstk.s8132.pjp.fourth

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]


println "a)"

pmap.each {println "\t${it.key}: ${it.value.size()}"}

println "b)"

pmap.findAll {it.value.size()>2}.each {println "\t${it.key}"}

println "c)"

pmap.each {
    key, value ->
        println "\t$key: ";
        value.each {println "\t\t$it"}
}