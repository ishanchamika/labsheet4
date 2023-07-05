import scala.io.StdIn
object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter deposit value")
    val n = StdIn.readInt()
    println(interest(n))
  }

  def  interest(x:Double):Double=
    {
      if(x<=20000)
        {
          return x*0.02
        }
      else if(x<=200000)
        {
          return x*0.04
        }
      else if(x<=2000000)
        {
          return x*0.035
        }
      else
        {
          return x*0.065
        }
    }
}
