import java.io.File

val Data = File("Day02.txt").readLines()

val First_Scores = listOf(4,8,3,1,5,9,7,2,6) //Outcomes of all possible moves sorted, i.e. A X = 4, A Y = 8, A Z = 3...
val Second_Scores = listOf(3,4,8,1,5,9,2,6,7)//Same as above but for task 2

val Results = Data
    .sorted() //Sort List
    .groupBy{it} //Group Same Scores
    .map{it.value.count()} //Count amount
    .withIndex() //Index Values



//Task 1
println(Results
    .map{it.value*First_Scores[it.index]} //Multiply values by indexed of score
    .sum() //Sum values
)

//Task 2
println(Results
    .map{it.value*Second_Scores[it.index]}
    .sum()
)
