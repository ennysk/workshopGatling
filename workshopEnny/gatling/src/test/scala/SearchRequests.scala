import io.gatling.core.Predef._
import io.gatling.http.Predef._
/**
  * Created by enny on 22.08.18.
  */
object SearchRequests {
  val requestName = EnvConfig.env + "-Search-"

  //Get
  val getSearch = http (requestName + "index")
    .get("templates.php?keywords=tea")
    .check(status.is(200))
}
