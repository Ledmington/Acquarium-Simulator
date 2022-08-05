name := "ScalaFX Hello World"

ThisBuild / scalaVersion := "3.1.3"

libraryDependencies += "org.scalafx" %% "scalafx" % "18.0.1-R28"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

mainClass := Some("hello.ScalaFXHelloWorld")

fork := true

ThisBuild / wartremoverWarnings ++= Warts.all
ThisBuild / wartremoverErrors += Wart.Nothing

lazy val startupTransition: State => State = "writeHooks" :: _

lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .settings(
    name := "ScalaFX Hello World",
    assembly / assemblyJarName := "scalafx-hello.jar",
    Global / onLoad := {
      val old = (Global / onLoad).value
      startupTransition compose old
    },
    // add XML report for sonarcloud
    jacocoReportSettings := JacocoReportSettings(
      "Jacoco Coverage Report",
      None,
      JacocoThresholds(),
      Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML),
      "utf-8"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.13" % Test,
      "io.monix" %%% "monix" % "3.4.1",
      "dev.optics" %%% "monocle-core" % "3.1.0",
      "dev.optics" %%% "monocle-macro" % "3.1.0"
    )
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-swing" % "3.0.0"
    )
  )

lazy val aggregate = (project in file("."))
  .enablePlugins(ScalaUnidocPlugin)
  .enablePlugins(GitHubPagesPlugin)
  .enablePlugins(SiteScaladocPlugin)
  .aggregate(root.jvm)
  .settings(
    name := "ScalaFX Hello World",
    ScalaUnidoc / siteSubdirName := "latest/api/",
    addMappingsToSiteDir(ScalaUnidoc / packageDoc / mappings, ScalaUnidoc / siteSubdirName)
  )

gitHubPagesSiteDir := baseDirectory.value / "target/site"