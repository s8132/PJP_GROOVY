package pl.edu.pjwstk.s8132.pjp.second

a = 'asia ma kota i psa'
println a.substring(2)
println a.substring(2)

def eachTuple(Object iter, Closure c){
    println iter instanceof Iterable
    iter.collate(c.maximumNumberOfParameters).each{c(it)}
}

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
    println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a,b ->
    out << b << a
}
println out
