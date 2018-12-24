name := "Finagle"

version := "0.1"

scalaVersion := "2.12.8"

organization := "com.sheffmachine.finagle"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "18.12.0",
  "com.twitter" %% "scrooge-core" % "18.12.0"
)
