import java.io.File

val Data = File("Day06.txt").readLines().joinToString()

fun solve(n: Int) {
    val Group = Data
        .windowed(n)
        .map{it.toList()}
        .map{it.groupBy{it}}
        .withIndex()
        .filter{it.value.size == n}
        .first()

    println(n + Group.index)
}

solve(4)
solve(14)
