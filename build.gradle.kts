plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}
tasks.shadowJar {
    relocate("es.angelillo15.configmanager", "es.angelillo15.btr.libs.config.manager")
    relocate("org.yaml.snakeyaml", "es.angelillo15.btr.libs.snakeyaml")
    relocate("org.simpleyaml", "es.angelillo15.btr.libs.simpleyaml")
    relocate("com.google.common", "es.angelillo15.btr.libs.google.common")
    relocate("com.google.gson", "es.angelillo15.btr.libs.google.gson")
    relocate("com.google.thirdparty", "es.angelillo15.btr.libs.google.thirdparty")
    relocate("com.google.errorprone", "es.angelillo15.btr.libs.google.errorprone")
    relocate("com.google.j2objc", "es.angelillo15.btr.libs.google.j2objc")
    relocate("javax.annotation", "es.angelillo15.btr.libs.javax.annotation")
    relocate("org.checkerframework", "es.angelillo15.btr.libs.checkerframework")
    relocate("net.byteflux.libby", "es.angelillo15.btr.libs.libby")
    relocate("ru.vyarus.yaml.updater", "es.angelillo15.btr.libs.yaml-config-updater")
    relocate("io.papermc.lib", "es.angelillo15.btr.libs.paperlib")
    relocate("com.github.benmanes.caffeine", "es.angelillo15.btr.libs.caffeine")
}

dependencies {
    implementation(project(":BlockTimerRemover-API"))
    implementation(project(":BlockTimerRemover-Bukkit"))
    implementation("com.github.Carleslc.Simple-YAML:Simple-Yaml:1.8.3")
    implementation("com.github.Angelillo15:ConfigManager:1.4")
    implementation("net.byteflux:libby-bukkit:1.1.5")
    implementation("io.papermc:paperlib:1.0.7")
}

val javaVersion = JavaVersion.VERSION_1_8
version = "1.0.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")

    version = rootProject.version

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://oss.sonatype.org/content/repositories/central")
        maven("https://repo.dmulloy2.net/repository/public/")
        maven("https://repo.alessiodp.com/releases/")
        maven("https://papermc.io/repo/repository/maven-releases/")
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
        maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    java {
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }

    dependencies {
        compileOnly("org.projectlombok:lombok:1.18.24")
        annotationProcessor("org.projectlombok:lombok:1.18.24")
    }
}