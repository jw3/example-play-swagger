package doc

import io.swagger.annotations._
import play.api.mvc.{AnyContent, Action}

/**
 *
 */
trait PetsApiDocs {

    @ApiOperation(nickname = "getPetById", value = "Find pet by ID", notes = "Returns a pet", response = classOf[models.Pet], httpMethod = "GET")
    @ApiResponses(Array(
        new ApiResponse(code = 400, message = "Invalid ID supplied"),
        new ApiResponse(code = 404, message = "Pet not found")))
    def getPetById(@ApiParam(value = "ID of the pet to fetch") /*@PathParam("id")*/ id: String): Action[AnyContent]
}
