import com.twitter.app.{App, Flaggable}

object MyApp extends App {
  // parses an integer from the "-port" flag.
  // Finagle already provides an implicit Flaggable typeclass for Int
  // usage: -port 9000
  val port = flag[Int]("port", 8080, "port this server should use")

  sealed trait Env
  case object Prod extends Env
  case object Dev extends Env
  implicit val flaggableEnv = new Flaggable[Env] {
    override def parse(env: String): Env = env match {
      case "prod" => Prod
      case "dev" => Dev
    }
  }

  // parses an Env trait. See typeclass below
  val env = flag[Env]("env", Dev, "environment this server runs")

  // best practice to turn this on.
  // The app won't start if parameters are wrong or missing
  override def failfastOnFlagsNotParsed: Boolean = true

  def main(): Unit = {
    //access the port simply with apply method
    // there are also other ways (get, getWithDefault)

    println(s"Hello world, port is $port and environment is $env")

  }
}
