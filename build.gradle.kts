import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
    id("com.diffplug.spotless") version "5.7.0"
    id("org.springframework.boot") version "2.4.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("info.solidsoft.pitest") version "1.7.0"
    kotlin("plugin.spring") version "1.4.32"
    application
}

group = "com.codely"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-mustache")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("junit:junit:4.13.1")
    implementation("junit:junit:4.13.1")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.mockito:mockito-core:3.3.3")
}

pitest {
    setProperty("junit5PluginVersion", "0.12")
    setProperty("testPlugin", "junit5")
    setProperty("outputFormats", listOf("HTML"))
}

application {
    mainClass.set("com.codely.demo.CodelyberKt")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

spotless {
    kotlin {
        ktlint()
            .userData(
                mapOf(
                    "insert_final_newline" to "true"
                )
            )
    }
    kotlinGradle {
        ktlint()
    }
}

tasks.check {
    dependsOn(tasks.spotlessCheck)
}
