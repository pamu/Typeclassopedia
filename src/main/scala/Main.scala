import TypeClasses.JsonConverter

/**
 * Created by pnagarjuna on 11/08/15.
 */
object Main {
  def main(args: Array[String]): Unit = {
    println("Main Application")
    case class Cat(name: String, color: String)
    implicit val catJsonConverter = new JsonConverter[Cat] {
      override def toJson(a: Cat): String = s"""{"name":"${a.name}", "color":"${a.color}"}"""
    }
    val jsonString = TypeClasses.getJson(Cat(name = "pamu", color = "black"))
    println(jsonString)
  }
}
