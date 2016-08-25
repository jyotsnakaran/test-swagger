package controllers

import javax.inject._

import com.github.tototoshi.play.json.JsonNaming
import models.{Name, Test}
import play.api.libs.json.Json
import play.api.mvc._
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {


  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index(fName: String) = Action {

    implicit val fnl = JsonNaming.snakecase(Json.format[Name])
    implicit val a = JsonNaming.snakecase(Json.format[Test])
    val test = Test(Name(s"Hello ${fName}"))
    Ok(Json.toJson(test))
  }


  def formData = Action { implicit request =>
    implicit val fnl = JsonNaming.snakecase(Json.format[Name])
    implicit val x = JsonNaming.snakecase(Json.format[Test])
    val a = request.body.asFormUrlEncoded

    val test = Test(Name(s"Hello ${a.toString}"))
    Ok(Json.toJson(test))
  }

}
