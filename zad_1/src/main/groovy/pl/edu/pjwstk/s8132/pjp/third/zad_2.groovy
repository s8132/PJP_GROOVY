package pl.edu.pjwstk.s8132.pjp.third

def String reverseWords(String s){
    s.reverse().tokenize(" ").collect {it.reverse()}.join(" ")
}

println reverseWords("ala ma kota")