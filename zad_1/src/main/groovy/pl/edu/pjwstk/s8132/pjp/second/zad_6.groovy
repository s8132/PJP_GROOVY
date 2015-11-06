package pl.edu.pjwstk.s8132.pjp.second


def sizeList
sizeList = { list, counter = 0 ->
    if(list.size()==0){
        counter
    }else{
        sizeList.trampoline(list.tail(), counter+1)
    }
}

sizeList = sizeList.trampoline()

println sizeList(1..10000)

def sumList
sumList = {List list ->
    if(list.size()<=1){
        list.head()
    }else{
        sumList(list.tail())+list.head()
    }
}

sumList = sumList.memoize()

def lis = [1,2,3,4,5,5,4,3,2,44,4,3,2,12,42,23,4,1,23,4]
println sumList(lis)

/*
println "\nPrzykłady z wykładu:"
long start
long count = 0
def startTimer = { -> start = System.currentTimeMillis() }
def elapsed = { -> System.currentTimeMillis() - start }
def map = [:].withDefault {0}


def fib

fib = { n ->
    map[n]++
    count++
    if (n < 2) n
    else  fib(n - 1) + fib(n - 2)
}

startTimer()
println fib(24)
println 'Czas = ' + elapsed()/1000 + ' sek. Wolań: ' + count

map.sort {it.key}
println map
//map.each {key, value -> println "$key = $value"}

map = [:].withDefault {0}
fib = fib.memoize()
count = 0
startTimer()
println fib(24)
println 'Czas = ' + elapsed()/1000 + ' sek. Wolań: ' + count
map.sort {it.key}
println map
//map.each {key, value -> println "$key = $value"}

def factorial1
def factorial2

factorial1 = { int n, def accu = 1G ->
    if (n < 2) return accu
    factorial1(n - 1, n * accu)
}


factorial2 = { int n, def accu = 1G ->
    if (n < 2) return accu
    factorial2.trampoline(n - 1, n * accu)  // działa jak curry
}                                           // zwraca TrampolinedClos
factorial2 = factorial2.trampoline()

println factorial2(1000)
println factorial1(1000)
*/