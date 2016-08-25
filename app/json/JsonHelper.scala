package json

import com.github.tototoshi.play.json.JsonNaming
import models.{Name, Test}
import play.api.libs.json.Json

/**
  * Created by knoldus on 25/8/16.
  */


object JsonHelper {
  implicit val fnl = JsonNaming.snakecase(Json.format[Name])
  implicit val a = JsonNaming.snakecase(Json.format[Test])
}
