import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by enny on 22.08.18.
  */
object GoogleSearchRequests {
  val requestName = EnvConfig.env + "-GoogleSearch-"

  //Get
  val getGoogleSearch = http (requestName + "google")
    .get("search?q=tea&oq=tea&aqs=chrome..69i57j0l5.2535j0j8&sourceid=chrome&ie=UTF-8&safe=active&ssui=on")
    .check(status.is(200))
}
