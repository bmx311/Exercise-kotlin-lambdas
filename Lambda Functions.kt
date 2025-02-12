//Lambda Functions
fun main(){
    //function calls in main
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    println(calculateDepth(1500,800))
    println(diveMessage("deep sea"))
}

//part 1
val greetSeaCreatures: () -> Unit = { println("Hello, Deep sea Adventurers") }

//part 2
val findPearl: (Int) -> Int = { numPearl -> numPearl * numPearl }

//part 3
val divideTreasure: (Double, Double) -> Double = { treasureTotal, numExplorer -> treasureTotal / numExplorer }

//part 4
val calculateDepth: (Int, Int) -> Int = { loc1, loc2 -> loc1 - loc2 }

//part 5
fun String.loud(): String {
    return this.uppercase() + "!"
}

val diveMessage:(String) -> String= {message -> message.loud()}

