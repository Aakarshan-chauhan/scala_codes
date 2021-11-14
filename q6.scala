import io.StdIn._
import javax.lang.model.`type`.NullType
object q6{
    def main(args: Array[String]): Unit = {
        val l1 = List(12, 32, 12 , 12 ,42, 53, 52)
        val l2 = l1.toSet.toList
        println("Part a: ")
        for(i <- l2)
            print(f"$i ")

        println("\n\n\nPart b:")
        println("Enter an index and element: ")
        val i = readInt()
        val x = readInt()

        val l3 = l2.dropWhile((a)=> l2.indexOf(a) < i)
        
        if(l3.indexOf(x) < 0)
            println("Not found")
        else
            println("Index = " + (l3.indexOf(x) + i).toString)

        println("\n\nPart c: ")
        println(f"Length of the list ${l2.length}")

        println("\n\nPart d: ")
        val l4= l2.sortWith((_:Int) > (_:Int))
        println(l4)

        println("\n\nPart e: ")
        println(l2.sum)

        println("\n\nPart f: ")
        println(l2.toString)
        
        println("\n\nPart g: ")
        println(l2.min)
        
        println("\n\nPart h: ")
        println(l2.max)

        println("\n\nPart i:")
        println("Enter an index and a number to find: ")
        val i2 = readInt()
        val x2 = readInt()

        val l5 = l2.takeWhile((a)=> l2.indexOf(a) < i2)
        println(l5)
        if(l5.indexOf(x2) < 0)
            println("Not found")
        else
            println("Index = " + l5.indexOf(x2))
        
        println("\n\nPart k: ")
        println(l2.zipWithIndex.toMap)

    }
}