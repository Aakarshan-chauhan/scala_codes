object q2{
    def main(args:Array[String]):Unit= {
        var a = io.StdIn.readInt()
        var op:Char = io.StdIn.readChar()
        var b = io.StdIn.readInt()
        
        val add = (_:Float) + (_:Float)
        val sub = (_:Float) - (_:Float)
        val mul = (_:Float) * (_:Float)
        val div = (_:Float) / (_:Float)
        op match {
            case '+'=> println(add(a, b))
            case '-'=> println(sub(a , b))
            case '*'=>println(mul(a, b))
            case '/'=>println(div(a, b))
            case _ => println("Not found")
        }
    }
}