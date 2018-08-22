import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._
import io.gatling.core.Predef._

import scala.language.postfixOps
import scala.concurrent.duration._

/**
  * Created by enny on 22.08.18.
  */
class CheckoutTests extends Simulation{
    val httpConf = http.baseURL(EnvConfig().getString("env.mainUrl"))

    val scn = scenario("Checkout")
      .exec(CheckoutRequests.getCheckout)

    setUp(scn.inject(constantUsersPerSec(
      EnvConfig().getInt("loading.usersCount")) during(
      EnvConfig().getInt("loading.duration") seconds))).protocols(httpConf)
}
