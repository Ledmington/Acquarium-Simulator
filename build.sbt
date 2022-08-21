name := "Aquarium Simulator"

ThisBuild / scalaVersion := "3.1.3"

libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "18.0.1-R28",
  "org.scalatest" %% "scalatest" % "3.2.13" % Test//,
  //"io.monix" %% "monix" % "3.4.1",
  //"dev.optics" %% "monocle-core" % "3.1.0",
  //"dev.optics" %% "monocle-macro" % "3.1.0"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-encoding", "utf8",
  "-feature",
  "-Werror",
  "-explain",
  //"-new-syntax", "-rewrite",
  "-indent", "-rewrite"
)

mainClass := Some("sim.Simulator")

fork := true

//ThisBuild / wartremoverWarnings ++= Warts.all
//ThisBuild / wartremoverErrors += Wart.Nothing
