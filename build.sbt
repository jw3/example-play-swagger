organization := "com.github.jw3"
name := "play-template"
version := "1.0"
scalaVersion := "2.11.7"

libraryDependencies ++= {
  Seq(
    "io.swagger" %% "swagger-play2" % "1.5.1",
    "com.typesafe" % "config" % "1.3.0",
    "org.scalatest" %% "scalatest" % "2.2.5" % Test
  )
}

// play configuration
enablePlugins(PlayScala)
routesGenerator := InjectedRoutesGenerator
sourceDirectories in TwirlKeys.compileTemplates := (unmanagedSourceDirectories in Compile).value
