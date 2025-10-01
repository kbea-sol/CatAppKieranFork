class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk(dist : Int) : Boolean{
        if((weight - dist) >= 5)
        {
            weight -= dist
            return true
        }
        return false
    }

    fun eat(food : Int) : Boolean{
        if((weight + food) <= 20)
        {
            weight += food
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }

    fun eat(){
        weight++
    }
}