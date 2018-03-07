name := "test1"
 
version := "1.0" 
      
lazy val `test1` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs, javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.4.Final", guice)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )