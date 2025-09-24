fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)

    val flathead = Cat("Flathead", 8 , 7)
    val other = Cat("Other", 16, 23)

    flathead.eat()
    flathead.eat()
    println(flathead)

    other.walk()
    other.walk()
    other.walk()
    other.walk()
    println(other)

}