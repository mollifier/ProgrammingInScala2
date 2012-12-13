
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

   /*
   val oneTwo = List(1, 2)
   val threeFour = List(3, 4)
   val oneTwoThreeFour = oneTwo ::: threeFour

   println(oneTwo + " and " + threeFour + " were not mutated.")
   println("Thus, " + oneTwoThreeFour + " is a new list")
   */

  
//  val pair = (99, "hoge")
//  println(pair._1)
//  println(pair._2)
  
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  jetSet += "Cessna"
  println(jetSet.contains("Cessna"))

  }
}

