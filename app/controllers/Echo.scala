package controllers

import play.api._
import play.api.mvc._

object Echo extends Controller {
  
  // simple echo-response
  def echo(message: String) = Action {
    Ok(message)
  }
  
}