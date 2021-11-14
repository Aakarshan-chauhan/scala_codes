trait engine{
    val desc : String = "AN engine for cars"
    val power : Float
}
trait wheels{
    val desc : String = "A wheel for a car"
    val grip : Float
}

trait chassis extends wheels with engine{
    override val desc : String = "A chassis for a car with wheels and engine"
}

class car(g : Float, p : Float) extends chassis{
    override val desc : String = f"A car with $g grip and $p power"
    override val grip = g
    override val power = p

}

object q3{
    def main(args : Array[String]):Unit = {
        val maruti800 = new car(300f, 200f)
        println(maruti800.grip)
        println(maruti800.power)
        println(maruti800.desc)
    }
}