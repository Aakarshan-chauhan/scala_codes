object q7 {
  def main(args : Array[String]):Unit = {
      val l1 = List (99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
      val l2 = List(10.0, 20.0, 30.0 , 40.0 , 50.0)
      val l3 = l1:::l2
      println(f"Lowest : ${l3.min} \t Largest : ${l3.max}")
  }
}
