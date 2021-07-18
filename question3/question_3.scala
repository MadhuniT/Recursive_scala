import scala.io.StdIn._
object question_3 {
  
  def main(args : Array[String]){
     print("Enter number(n) :");
    val a = scala.io.StdIn.readInt()
    print("Get addition of numbers from 1 to n\n");
    
    println(sum(a))
  }
  def sum(n:Int):Int=if (n==1) 1 else n+sum(n-1)
  
}