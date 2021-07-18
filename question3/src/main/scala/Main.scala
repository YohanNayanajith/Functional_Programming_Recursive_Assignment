object Main extends App {
  
  print(addnum(5))

  def addnum (a:Int): Int={
    if (a==1) a
    else a + addnum(a-1)
  }
}