name := "lift-basic"
 
organization := "net.lift"
 
version := "0.1.0"
 
scalaVersion := "2.9.1"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

//Inject plugin settings into project
seq(webSettings: _*)

resolvers += "Java.net Maven2 Repo" at "http://download.java.net/maven/2/"

resolvers += "Sonatype OSS Snapshot Repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
 
libraryDependencies ++= {
  val liftVersion = "2.4"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default",
	"junit" % "junit" % "4.7" % "test->default",
	//"org.specs2" %% "specs2" % "1.9" % "test",
	"org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test", // For specs.org tests
	"org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container,test", // For Jetty 8
	"javax.servlet" % "servlet-api" % "2.5" % "provided->default",
	"com.h2database" % "h2" % "1.2.138",
	"ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default",
	"postgresql" % "postgresql" % "9.0-801.jdbc4" % "compile->default"
  )
}

// by default, it listens on port 8080; use the following to override
port in container.Configuration := 8081