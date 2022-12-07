import java.io.File

val Data = File("Day03.txt").readLines()

val Split = Data
    .map{it.chunked(it.length/2)}
    .map{it[0].toSet() intersect it[1].toSet()}
    .map{it.first()}
    .map{when{
        it.isLowerCase() -> it.code - 96
        else -> it.code - 38
    }}
    .sum()

val GroupSplit = Data
    .chunked(3)
    .map{it[0].toSet() intersect it[1].toSet() intersect it[2].toSet()}
    .map{it.first()}
    .map{when{
        it.isLowerCase() -> it.code - 96
        else -> it.code - 38
    }}
    .sum()


println(Split)
println(GroupSplit)

