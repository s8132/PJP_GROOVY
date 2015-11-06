package pl.edu.pjwstk.s8132.pjp.third

//def String reverseChars(String s){
//    s.reverse()
//}


def String reverseChars(String s){
    if(s.size() <=1 ){
        s
    }else{
        reverseChars(s[1..-1]) + s[0]
    }
}

println reverseChars("piesek")