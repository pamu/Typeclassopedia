/**
 * Created by pnagarjuna on 11/08/15.
 */
object Typeclasses {
  trait JsonConverter[A] {
    def toJson: String
  }
}
