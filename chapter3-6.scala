import scala.io.Source

object Chapter3_6 {
  def main(args: Array[String]) = {
    
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines()) {
         println(line.length + " " + line)
      }
    } else {
      Console.err.println("Please enter filename")
    }




  }
}

