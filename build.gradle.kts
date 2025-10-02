plugins {
    id("java")
}

group = "edu.estatuas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.18")
    implementation ("com.fasterxml.jackson.core:jackson-core:2.18")
    implementation ("com.fasterxml.jackson.core:jackson-annotations:2.18")
}

tasks.test {
    useJUnitPlatform()
}