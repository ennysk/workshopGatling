import com.typesafe.config._

/**
  * Created by enny on 22.08.18.
  */
object EnvConfig {
    val env = System.getProperty("mainEnv", "test")
    println("env: " + env)

    val conf = ConfigFactory.load(env)
    def apply() = conf.getConfig("conf")
}
