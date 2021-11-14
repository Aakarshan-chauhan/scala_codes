class Student(n : String, r : Long){
    val name : String = n;
    val roll_number : Long = r;
}
object q5 {
    def main(args : Array[String]): Unit = {
        println("Enter number of students ");
        val t : Int = io.StdIn.readInt()
        var sList : List[Student]  = Nil
        for(i <- 1 to t){
            println("Enter name and roll")
            var name = io.StdIn.readLine()
            var roll = io.StdIn.readLong()

            val temp : Student = new Student(name, roll)
            sList = temp :: sList
        }
        sList.foreach((x) => println(x.name))

        println(f"\n\nIs the list empty ? ${sList.isEmpty}")
        println(f"\n\nThe last student entered : ${sList.head.name}")
        println(f"\n\nThe first student entered : ${sList.last.name}")
        println(f"\n\nNumber of students in the list : ${sList.length}")
        print("\n\nReversed List : "); sList.reverse.foreach((x)=> println(f"${x.name} "));
        
        var temp = sList filter (_.name.length <5)

        print("\n\n\nStudents with name length < 5 : "); temp.foreach((x) => println(f"${x.name} "))
        
        println("\n\n\nEnter a rollnumber you want to find : ")
        val r = io.StdIn.readLong()

        val s = sList find (_.roll_number == r)
        s.foreach((x)=>println(f"${x.name} -> ${x.roll_number}"))

        val anotherList : List[Student] = List(new Student("test1", 12), new Student("test2", 13))
        println(f"\n\nMerging 2 lists : ")
        (sList ::: anotherList).foreach((x)=>println(f"${x.name} "))

    }
}
