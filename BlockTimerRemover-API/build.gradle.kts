import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    id("java")
    id("net.kyori.blossom") version "1.3.1"
    id("org.ajoberstar.grgit") version "4.1.0"
}

dependencies {
    compileOnly(project(":BlockTimerRemover-API"))
    compileOnly("org.spigotmc:spigot-api:1.19-R0.1-SNAPSHOT")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly("org.yaml:snakeyaml:2.0")
    compileOnly("com.github.Carleslc.Simple-YAML:Simple-Yaml:1.8.3")
    compileOnly("net.byteflux:libby-bukkit:1.1.5")
    compileOnly("io.papermc:paperlib:1.0.7")
    compileOnly("com.github.ben-manes.caffeine:caffeine:2.9.2")
}

blossom {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    val current = LocalDateTime.now().format(formatter)

    val und = "undefined"

    replaceTokenIn("src/main/java/es/angelillo15/btr/api/Constants.java")
    replaceToken("{version}", project.version)
    replaceToken("{git-commit}",  grgit.head().abbreviatedId ?: und)
    replaceToken("{git-user}", grgit.head().committer.name ?: und)
    replaceToken("{git-date}", current ?: und)
    replaceToken("{git-branch}", grgit.branch.current().name ?: und)
}

