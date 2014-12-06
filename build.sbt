
organization in ThisBuild := "org.freehep"

name := "vectorgraphics"

version in ThisBuild := "2.1.1.1"


crossPaths in ThisBuild := false

autoScalaLibrary in ThisBuild := false

resolvers in ThisBuild += "freehep" at "http://java.freehep.org/maven2"


javacOptions in compile in ThisBuild := Seq("-source", "1.6", "-target", "1.6")


publishTo in ThisBuild := Some("lib-releases-local" at "http://pellucid.artifactoryonline.com/pellucid/libs-releases-local")

publishMavenStyle in ThisBuild := true

lazy val root =
  project.
  in(file(".")).
  aggregate(
    freehepGraphics2d,
    freehepGraphicsIoSvg
  ).settings(
    publish := (),
    publishLocal := ()
  )

lazy val freehepGraphics2d =
  project.
  in(file("freehep-graphics2d"))

lazy val freehepGraphicsIoSvg =
  project.
  in(file("freehep-graphicsio-svg"))
