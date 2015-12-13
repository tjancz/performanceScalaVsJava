import scala.util.Random

/**
  * Created by Tomek on 13.12.2015.
  */
object Ptester {

  def main(args: Array[String]): Unit ={
    println("Scala performance test")
    val arraySizeValues = List[Int] (200, 2000, 20000, 200000, 2000000, 20000000)
    arraySizeValues.foreach( size => {
      val startTime =  java.lang.System.currentTimeMillis()
      val array = Seq.fill(size)(Random.nextInt)
      array.foreach( item => if(item == 2) print("|") )
      val endTime = java.lang.System.currentTimeMillis()
      println(s"Array size: $size time for simple count operation: ${endTime - startTime} in ms")
    })
  }
}
class Ptester {

}
