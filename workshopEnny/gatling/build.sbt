name := "gatling"

version := "1.0"

scalaVersion := "2.12.1"

//для запуска в самой идеи
enablePlugins(GatlingPlugin)
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.3.1"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.3.1"