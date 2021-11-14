object q8 {
    def main(args:Array[String]):Unit = {
        println("Enter the age: ")
        val age : Int = io.StdIn.readInt()
        def voting_check()={if(age < 18) println("Not eligible") else println("Eligible") }
        voting_check
    }
}
