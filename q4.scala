import scala.annotation.tailrec
object q4{
    
    @tailrec def factorial(n:Long, x:Long = 1): Long = {
        if(n <= 1)
            x
        else factorial(n-1 , x * n)
    }
    @tailrec def gcd(x:Int, y :Int):Int = {
        if (y == 0) x
        else
            gcd(y, x%y)
    }
    def main(args: Array[String]):Unit = {
        println(gcd(3120, 1899))
        println(factorial(5))
    }
}