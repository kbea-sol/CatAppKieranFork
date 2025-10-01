
fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    println(binnie)
    println(clyde)

    val flathead = Cat("Flathead", 7 , 10)
    val cupra = Cat("Cupra", 2, 12)

    if(!cupra.eat(20))
    {
        println("Invalid food amount entered")
    }
    if(!cupra.walk(20))
    {
        println("Invalid distance entered")
    }
    if(!cupra.walk(5))
    {
        println("Invalid distance entered")
    }
    if(!cupra.eat(5))
    {
        println("Invalid distance entered")
    }

    println(cupra)

}
