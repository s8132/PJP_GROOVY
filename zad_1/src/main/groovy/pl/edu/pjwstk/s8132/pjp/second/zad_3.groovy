package pl.edu.pjwstk.s8132.pjp.second

def apply(List list, Closure c){
    list.collect {c(it)}
}

li = 1..6

println "Wynik działania funkcji apply na liście: $li, z domkęciem zwiększający każdy element o 1: ${apply(li, {it+1})}"
println "Wynik działania funkcji apply na liście: $li, z domkęciem mnożącym każdy element razy 2: ${apply(li, {it*2})}"
println "Wynik działania funkcji apply na liście: $li, z domkęciem zmniejszającym każdy element o 1: ${apply(li, {it-1})}"
println "Wynik działania funkcji apply na liście: $li, z domkęciem dzielącym każdy element przez 2: ${apply(li, {it/2})}"