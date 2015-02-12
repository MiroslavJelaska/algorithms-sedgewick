package Ex01

class Algorithm(name: String) {
  assert(name != null, "FAIL: name != null")
  assert(name.length > 0, "FAIL: name.length > 0")

  def getLen = name.length
}

object Test{

  def RunAllTest(): Unit =
  {
    println("Running all tests")

    val a  = new Algorithm("Tim")

    println("Is it lengtn 5:" +  a.getLen)
  }
}
