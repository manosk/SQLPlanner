name := "SQLPlanner"

version := "0.1"

scalaVersion := "2.12.3"

// https://mvnrepository.com/artifact/org.json4s/json4s-jackson_2.10
val json4sJackson = "org.json4s" % "json4s-jackson_2.12" % "3.5.3"
// https://mvnrepository.com/artifact/org.apache.calcite/calcite-core
val calciteCore = "org.apache.calcite" % "calcite-core" % "1.14.0"
//val calciteCSV = "org.apache.calcite" % "calcite-example-csv" % "1.14.0"
val slf4j = "org.slf4j" % "slf4j-api" % "1.7.13"
val slf4j_simple = "org.slf4j" % "slf4j-simple" % "1.7.13"

// https://mvnrepository.com/artifact/au.com.bytecode/opencsv
libraryDependencies += "au.com.bytecode" % "opencsv" % "2.4"
// https://mvnrepository.com/artifact/commons-io/commons-io
libraryDependencies += "commons-io" % "commons-io" % "2.4"
// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.4"
libraryDependencies += calciteCore
//libraryDependencies += calciteCSV
libraryDependencies += slf4j
libraryDependencies += slf4j_simple
libraryDependencies += json4sJackson