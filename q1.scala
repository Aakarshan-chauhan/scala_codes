object q1{
    def farenheitToCelcius(temp: Float) : Float = {
        var cel : Float = (temp - 32) * 5 / 9;
        cel
    }

    def inchToMeter(inches : Float): Float = {
        return inches/39.37.asInstanceOf[Float]

    }

    def yearsToDays(year: Int): Int = {
        var days: Int = (year.toFloat * 365.25).toInt
        days
    }

    def main(args:Array[String]) : Unit = {
        val temp = io.StdIn.readFloat();
        val inches = io.StdIn.readFloat();
        val year = io.StdIn.readInt();

        println(farenheitToCelcius(temp))
        println(inchToMeter(inches))
        println(yearsToDays(year))

    }
}