package controllers

import doc.PetsApiDocs
import io.swagger.annotations.{Api, ApiParam}
import play.api.mvc.Action


/**
 *
 */
@Api(value = "/pet", description = "Operations about pets")
class PetsController extends SwaggerBaseApiController with PetsApiDocs {

  def getPetById(id: String) = Action {
    Ok("!")
  }
}
