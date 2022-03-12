plugins{
    java
}
group = "org.example"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
    mavenLocal()
}
val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies{
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkiverse.mybatis:quarkus-mybatis:1.0.0")
    implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.3.1")
    testImplementation("org.mybatis.generator:mybatis-generator-core:1.4.0")
    testImplementation("io.quarkus:quarkus-junit5")
}
