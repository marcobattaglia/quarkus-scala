package com.technincaleader.rest

import io.quarkus.runtime.annotations.RegisterForReflection
import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

@RegisterForReflection
case class Animal(name:String, description: String)

@Path("/animals")
@Produces(Array[String](MediaType.APPLICATION_JSON))
class AnimalResource {
  import collection.JavaConverters._

  private val animals = Seq(
    new Fruit("Tiger", "it lives in Malesia"),
    new Fruit("Bird", "They fly in the sky")
  )




  @GET def list = animals.toList.asJava


}
