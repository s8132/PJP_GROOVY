package pl.edu.pjwstk.s8132.pjp.fourth

def list1 = ['a', 'b', 'c']
def list2 = [1, 8, 23]
def list11 = []
def list12 = []

println "a)"

println "\tlist1:"
list1.each {println "\t\t $it"}

println "\tlist2:"
list2.each {println "\t\t $it"}

println "b)"

list1.each {list11 << it*2}
list2.each {list12 << it*2}

println "\tlist11: $list11"
println "\tlist12: $list12"