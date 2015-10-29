name := "Generador con Twirl"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.3",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

enablePlugins(SbtTwirl)