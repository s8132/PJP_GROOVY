package pl.edu.pjwstk.s8132.pjp.fivth

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek', 'Marcin' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]

def init(Map map, File f){
    if(!f.exists()) f.createNewFile();
    f.write("")
    map.each {key, value -> f.append("$key\t${value.join("\t")}\n")}
}

File projects = new File("Projekty.txt");
File largeProjects = new File("ProjektyDuze.txt");
File developers = new File("Programisci.txt");

init(pmap, projects);
largeProjects.write("")
developers.write("")

map = [:].withDefault {[]}

projects.eachLine {projectsLine -> projectsLine.tokenize("\t")[1..-1].each {map[it]<<projectsLine.tokenize("\t")[0]}}
map.each {key, value -> developers.append("$key\t${value.join("\t")}\n")}
//println "\n\n$map\n\n"
println "Programisci.txt:"
developers.eachLine {println "\t$it"}


projects.filterLine {it.tokenize("\t")[1..-1].size()>3}.toString().eachLine {largeProjects.append("${it.tokenize("\t")[0]}\n")}
println "ProjektyDuze.txt:"
largeProjects.eachLine {println "\t$it"}