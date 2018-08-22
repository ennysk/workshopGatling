import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by enny on 22.08.18.
  */
object CheckoutRequests {
  val requestName = EnvConfig.env + "-Checkout-"

  //Get
  val getCheckout = http (requestName + "checkout")
    .get("checkout.php?add=47925")
    .check(status.is(200))
}
