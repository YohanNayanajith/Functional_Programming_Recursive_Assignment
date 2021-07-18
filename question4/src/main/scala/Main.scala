object Main extends App {
  find_even_or_odd (12)
  find_even_or_odd (15)

  def find_even_or_odd (n:Int): Unit = {
    if(n==0) println("even")
    else if(n==1) println("odd")
    else find_even_or_odd (n-2)
  }
}