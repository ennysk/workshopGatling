import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps

/**
  * Created by enny on 22.08.18.
  */
class ChatPresalesTests extends Simulation{
    val httpConf = http.baseURL(EnvConfig().getString("chat.url"))

    val scn = scenario("Chat")
      .exec(ChatPresalesRequests.getChat)

    setUp(scn.inject(constantUsersPerSec(
      EnvConfig().getInt("loading.usersCount")) during(
      EnvConfig().getInt("loading.duration") seconds))).protocols(httpConf)
}
