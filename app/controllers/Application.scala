package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def example2 = Action { implicit request =>
    Ok(views.html.example2())
  }
}