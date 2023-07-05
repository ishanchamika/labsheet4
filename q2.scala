import scala.io.StdIn
object q2 {
  def main(args: Array[String]): Unit = {
    println("Enter value")
    val x = StdIn.readInt()
    println(pattern(x))
  }
  def pattern(n:Int):String = n match {
    case n if(n==0) => "Zero"
    case n if(n<0) => "Negative"
    case n if( (n>0)&&(n%2==0)) => "Even"
    case n if((n>0)&&(n%2!=0)) => "Odd"
  }
}
