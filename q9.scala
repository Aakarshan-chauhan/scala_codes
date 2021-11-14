object q9 {
    def main(args:Array[String]):Unit = {
        val employees = Map("Bill" -> 56,"Jonny" -> 87, "Tommy" -> 1,"Cheena"->13)
        println(employees.toList.sortWith((x, y) => x._1 > y._1).toMap)
    }
}
