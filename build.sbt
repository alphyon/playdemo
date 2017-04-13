name := """example-app"""

version := "1.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

enablePlugins(DebianPlugin)
maintainer := "Jose A Chavarria <alphyon21@gmail.com>"
packageSummary := "packageCIDevops"
packageDescription := "Paquete de prueba de uso de CI"
