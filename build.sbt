ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "opencast-aoc-2023",
    idePackagePrefix := Some("com.opencast")
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"
libraryDependencies += "org.typelevel" %% "cats-mtl" % "1.3.0"
libraryDependencies +=  "com.lihaoyi" %% "fastparse" % "3.0.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
