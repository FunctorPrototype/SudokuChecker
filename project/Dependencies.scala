import sbt._
object Dependencies {

  private val scalaTestVersion = "3.1.0"

  lazy val testLibs = List(
    "org.scalatest" %% "scalatest" % scalaTestVersion
  ).map(_ % Test)

}
