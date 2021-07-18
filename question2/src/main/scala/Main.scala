object Main extends App {

  def GCD (a:Int,b:Int): Int=b match {
    case 0=> a
    case x if x>a => GCD (x,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int, n:Int=2):Boolean = n match{
    case x if(p==x) => true
    case x if (GCD(p,x)>1) => false
    case x => prime(p,x+1)
  }

  def primeseq (n:Int): Unit = {
    if (prime(n)) println(n)
    if(n>0) primeseq(n-1)
  }

  primeseq(10)
}