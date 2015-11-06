package pl.edu.pjwstk.s8132.pjp.fivth

import groovy.io.FileType

def String startPath = "/Users/Marcin/PJWSTK/PJP/Cwiczenia/".replaceAll("/", File.separator)

File startDir = new File(startPath)

def count = 0;
println "Rozwiązanie nr1:"
startDir.eachFileRecurse(FileType.FILES){ File file ->
    if(file.name.endsWith(".html")){
        count++
        println "\t$count $file.path"
    }
}

List<File> li = []
startDir.eachFileRecurse(FileType.FILES){li<<it}
println "\nRozwiązanie nr2:"
//li.eachWithIndex { File entry, int i -> println "\t${i+1} $entry"}
li.findAll {it.name.endsWith(".html")}.eachWithIndex { File entry, int i -> println "\t${i+1} $entry"}