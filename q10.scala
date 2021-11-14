object q10 {
    def main(args:Array[String]): Unit = {
        val s = io.StdIn.readLine()
        if(s.length >= 4)
            println(s.takeRight(4).toUpperCase)
        else 
            println(s.toUpperCase)
    }
}
