//import scala.collection.mutable.Map

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
  
/*
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  jetSet += "Cessna"
  println(jetSet.contains("Cessna"))
  //*/

  /*
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(3))
    //*/


    /*
    val romanNumerial = Map(
      1 -> "I", 2 -> "II", 3 -> "III",
      4 -> "IV", 5 -> "V"
    )
    println(romanNumerial(4))
//*/

    def printArgs(args: Array[String]): Unit = {
      var i = 0
      while (i < args.length) {
        println(args(i))
        i += 1
      }
    }

    def printArgs2(args: Array[String]): Unit = {
      for (arg <- args) {
        println(arg)
      }
    }

    def printArgs3(args: Array[String]): Unit = {
      //args.foreach(println)
      args.foreach(x => println(x))
    }

    printArgs(Array("1", "22", "333"))
    printArgs2(Array("x1", "x22", "x333"))
    printArgs3(Array("y1", "y22", "y333"))


  }
}

