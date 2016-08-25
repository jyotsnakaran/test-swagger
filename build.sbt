name := """testswagger"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.iheart" %% "play-swagger" % "0.4.0",
  "org.webjars" % "swagger-ui" % "2.1.4",
  "com.github.tototoshi"     %% "play-json-naming"         % "1.1.0",
  "org.jvnet.mimepull"        % "mimepull"                 % "1.9.3",
  "com.sun.jersey" % "jersey-json" % "1.19.1"

)
