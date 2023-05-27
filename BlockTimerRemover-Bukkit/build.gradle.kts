dependencies {
    compileOnly(project(":BlockTimerRemover-API"))
    compileOnly("org.spigotmc:spigot-api:1.19-R0.1-SNAPSHOT")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly("org.yaml:snakeyaml:2.0")
    compileOnly("com.github.Carleslc.Simple-YAML:Simple-Yaml:1.8.3")
    compileOnly("net.byteflux:libby-bukkit:1.1.5")
    compileOnly("io.papermc:paperlib:1.0.7")
    compileOnly("com.github.ben-manes.caffeine:caffeine:2.9.2")
    compileOnly(project(":BlockTimerRemover-API"))
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand("version" to (parent?.version ?: project.version))
    }
}