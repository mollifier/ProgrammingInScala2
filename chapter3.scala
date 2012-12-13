
object Chapter3 {
  def main(args: Array[String]) = {
    //println("Hello, world!")
    
    //val big = new java.math.BigInteger("12345")
    /*
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!"
    */
    
    val greetStrings = Array("zero, ", "one, ", "two")
    for (i <- 0 to 2) {
      print(greetStrings(i))
    }
  }
}

