Quarkus Scala REST Quickstart
=============================

This project illustrates how to use scala lang  and kotlin to develop a quarkus REST service.
The [quarkus.io](https://quarkus.io) is a RedHat open source framework: a Kubernetes Native Java stack tailored for GraalVM & OpenJDK HotSpot, crafted from the best of breed Java libraries and standards

## json serialization
GraalVM doesn't fully support reflection, but json-B works using reflection.
In quarkus you can use @RegisterForReflection ...TODO

## Clean and compile
```
mvn clean compile
```

## Package
```
mvn package
```

## Package native
```
mvn package -Pnative
```

## Run
```
 java -jar ./target/rest-scala-kotlin-1.0-SNAPSHOT-runner.jar
```

##Test
It uses kotlin to test both the kotlin and the scala rest endpoint
```
mvn test
```

  
  