import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by enny on 22.08.18.
  */
object ChatPresalesRequests {
  val requestName = EnvConfig.env + "-Chat-"

  //Get
  val getChat = http (requestName + "chat")
    .get("connect.jsp?action=chat_login&aff=&email=enny%40templatemonster.me&emptyOrderText=&nick=enny&offerText=&orderId=&orderId_room2Id=&orderId_room3Id=&orderId_room4Id=&productType=Joomla+Templates+&productTypeText=&question=&referer=https%3A%2F%2Fwww.templatemonsterdev.com%2Fcart.php&refererProject=tm&room=pre-sales&selectProductType_room1Id=Joomla+Templates+&selectProductType_room2Id=&selectRoom=pre-sales&templateId=&key=dbde1b47621a80dafd3e672c2773cc19")
    .check(status.is(200))
}
