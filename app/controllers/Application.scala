package controllers

import play.api.mvc.{Action, Controller}


class Application extends Controller {

  val index = Action {
    Ok(views.html.index("1"))
  }

  val swagger = Action {
    Ok(views.html.swagger())
  }
}
