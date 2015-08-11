/**
 * Created by pnagarjuna on 11/08/15.
 */
object TypeClasses {
  trait JsonConverter[A] {
    def toJson(a: A): String
  }
  def getJson[A](a: A)(implicit jsonConverter: JsonConverter[A]): String = jsonConverter.toJson(a)
}
