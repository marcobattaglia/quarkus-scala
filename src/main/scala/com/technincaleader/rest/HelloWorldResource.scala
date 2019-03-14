package com.technincaleader.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloWorldResource {
  @GET
  @Produces(Array[String](MediaType.TEXT_PLAIN))
  def hello() = "hello_world_scala"

}
