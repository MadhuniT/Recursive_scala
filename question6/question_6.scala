

object question_6 {
  def main(args : Array[String]){
     print("Enter number(n) :");
     val a = scala.io.StdIn.readInt()
     print("Get first n fibonacci series:\n");
     fsq(a)
    
  }
  def f(n:Int):Int = n match{
    case n if n==0 => 0
    case n if n==1 => 1
    case n => f(n-1) + f(n-2)
  }
  def fsq(n:Int):Any ={
    if(n>0) fsq(n-1)
    println(f(n))
    
  }
}