import scala.io.Source
import scala.collection.mutable.Map
import breeze.linalg._ 
import breeze.plot._ 
import breeze.numerics._ 

trait TcsvReader{
    def readCsv(): List[Line]  }

case class Line(
Rank: Long, Name:String, Platform:String, Year:Long, Genre:String, Publisher:String,
NA_Sales: Double, EU_Sales:Double, JP_Sales: Double, Other_Sales:Double, Global_Sales:Double)

class csvReader(val fileName : String) extends TcsvReader{

    override def readCsv():List[Line] = {

        val f = Source.fromFile(fileName).getLines().toArray
        val header = f(0).split(",").map(_.trim).toArray
        var Dataset : List[Line] = Nil
        for(rawline <- f.drop(1)){
            var r = rawline.replace(", ", "#")
            val splitline = r.split(",").map(_.trim).toArray
            try{
                val temp = new Line(
                    splitline(0).toLong,
                    splitline(1),
                    splitline(2),
                    splitline(3).toLong,
                    splitline(4),
                    splitline(5),
                    splitline(6).toDouble,
                    splitline(7).toDouble,
                    splitline(8).toDouble,
                    splitline(9).toDouble,
                    splitline(10).toDouble
                )
                Dataset = temp :: Dataset
            }
            catch{
                case e : Throwable => println("Skipping ... ")
            }
        }

        return Dataset
    }
}
object main{
    def main(args:Array[String]):Unit = {
        val filepath = "vgsales.csv"
        val file = new csvReader(filepath).readCsv()
        var eu_sales : List[Double] = Nil
        var jp_sales:List[Double]= Nil
        var na_sales:List[Double]= Nil
        var global_sales:List[Double]= Nil
        var other_sales:List[Double]= Nil
        var ranks : List[Double]= Nil
        var year : List[Double] = Nil
        var genre : List[String] = Nil
        for (i <- file){
            eu_sales = i.EU_Sales :: eu_sales
            jp_sales = i.JP_Sales :: jp_sales
            na_sales = i.NA_Sales :: na_sales
            global_sales = i.Global_Sales :: global_sales
            other_sales = i.Other_Sales :: other_sales
            ranks = i.Rank.toDouble :: ranks
            year = i.Year.toDouble :: year
            genre = i.Genre :: genre
        }

        
        val f = Figure()
        val p = f.subplot(0)
        var x = year.toArray
        p += plot(x, eu_sales.toArray, '.', name="EU")
        p += plot(x, jp_sales.toArray, '.', name="JP")
        p += plot(x, na_sales.toArray, '.', name="NA")
        p += plot(x, other_sales.toArray, '.', name="Other")
        p += plot(x, global_sales.toArray, '.', name="Global")
        p.title = "Year vs Sales"
        p.xlabel = "Year"
        p.ylabel = "Sales"
        p.legend = true
        
        f.saveas("image1.png")
        val f2 = Figure()
        
        val p2 = f2.subplot(0)
        p2 += hist(x, 30)
        p2.title = "Number of game releases"
        p2.xlabel = "Year"
        p2.ylabel = "Number of games"
        
        f2.saveas("image2.png")

    }
}