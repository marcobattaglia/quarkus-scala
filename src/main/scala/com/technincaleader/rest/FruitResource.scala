package com.technincaleader.rest

import java.util.Collections
import java.util.LinkedHashMap
import java.util.Set

import io.quarkus.runtime.annotations.RegisterForReflection
import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType



@RegisterForReflection
class Fruit(name:String, description:String){
  def getName()= this.name
  def getDescription()=this.description
}


@Path("/fruits")
@Produces(Array[String](MediaType.APPLICATION_JSON))
class FruitResource(){
  import collection.JavaConverters._

  private val fruits = Seq(
    new Fruit("Apple", "The snake's gift"),
    new Fruit("Orange", "What was born before: the fruit or the color?")
  )




  @GET def list = fruits.toList.asJava
}
