/**
 * Created by pnagarjuna on 12/08/15.
 */
trait Functor[F[_]] {
  def map[A, B](a: F[A])(f: A => B): F[B]
}
