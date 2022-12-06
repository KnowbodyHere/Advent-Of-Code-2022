import java.io.File

val Data = File("Day04.txt").readLines()
    .map{it.replace("-",",").split(",")}
    .map{it.map{it.toInt()}}

val Covered = Data
    .map{(it[0]>=it[2] && it[1]<=it[3]) or (it[2]>=it[0] && it[3]<=it[1])}
    .filter{it == true}


val Overlap = Data
    .map{(it[3]>=it[0] && it[3]<=it[1]) or (it[2]>=it[0] && it[2]<=it[1]) or (it[0]>=it[2] && it[0]<=it[3] && it[1]>=it[2] && it[1]<=it[3])}
    .filter{it == true}

println(Covered.size)
println(Overlap.size)
