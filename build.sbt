val commonSettings = Seq(
  scalaVersion := "2.12.1"
)
lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.13.4"

lazy val root = (project in file("."))
  .aggregate(exercises, answers)
  .settings(commonSettings)
  .settings(
    name := "fpinscala",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",
    libraryDependencies += "junit" % "junit" % "4.10" % "test",
    libraryDependencies += scalacheck % Test

  )

lazy val exercises = (project in file("exercises"))
  .settings(commonSettings)
  .settings(
    name := "exercises",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",
    libraryDependencies += "junit" % "junit" % "4.10" % "test",
    libraryDependencies += scalacheck % Test

  )

lazy val answers = (project in file("answers"))
  .settings(commonSettings)
  .settings(
    name := "answers",
    resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",
    libraryDependencies += "junit" % "junit" % "4.10" % "test",
    libraryDependencies += scalacheck % Test
  )
