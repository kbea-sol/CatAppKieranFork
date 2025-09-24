
fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)

    val flathead = Cat("Flathead", 7 , 10)
    val cupra = Cat("Cupra", 2, 7)
    val steven = Cat("Steven", 4, 15)

    flathead.eat()
    flathead.eat()
    println(flathead)

    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)

    val cat1 = catReproductionProgram(flathead, cupra)
    val cat2 = catReproductionProgram(cupra, clyde)
    val cat3 = catReproductionProgram(steven, cat1)
    val cat4 = catReproductionProgram(cat3, cat2)
    println(cat1)
    println(cat2)
    println(cat3)
    println(cat4)
}

fun catReproductionProgram(subject1 : Cat, subject2 : Cat) : Cat{
    var name = subject1.name.slice(0..(subject1.name.length/2).toInt())
    name += subject2.name.slice((subject2.name.length/2)..<subject2.name.length)
    return Cat(name, 0, 5 + kotlin.random.Random.nextInt(-3,3))
}