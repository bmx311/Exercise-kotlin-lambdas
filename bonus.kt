fun main() {
    exploreWaters(exampleLambdaFunction,3)
}

//lambda function
var exampleLambdaFunction:(Unit?)->Any = { _ -> println("Exploring the unknown depths...")}

//inline function that takes a lambda function as a parameter
fun exploreWaters(lamb: (Unit?)->Any, time:Int) {
    val unit1: Unit? = null
    lamb(unit1)
    println("Time taken: $time")
}