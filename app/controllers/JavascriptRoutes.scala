package controllers

import play.api._
import play.api.mvc._

/**
 * utility javascript router
 */
object JavascriptRoutes extends Controller {

    /**
     * generate javascript routes
     */
    def all = Action { implicit request =>
      import routes.javascript._
      Ok(
        Routes.javascriptRouter("jsRoutes")(
          Echo.echo
        )
      ).as("text/javascript").withHeaders(VARY -> ACCEPT_ENCODING)
    }
}
