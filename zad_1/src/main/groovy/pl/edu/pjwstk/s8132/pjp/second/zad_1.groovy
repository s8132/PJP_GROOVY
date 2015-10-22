package pl.edu.pjwstk.s8132.pjp.second

def maximum(List list = []){
    indexes = [:]

    list.eachWithIndex{ entry,index ->
        indexes[entry]==null ? indexes[entry]=[]<<index : indexes[entry]<<index
    }

    maxValue = indexes.keySet().max()
    return [maxValue, indexes[maxValue]]
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"