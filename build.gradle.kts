plugins {
    id("java")
}

group = "com.optloader"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.jar {
    archiveBaseName.set("OptiLoader-Proof")
    archiveVersion.set("1.0.0")
    from(sourceSets.main.get().output)
    manifest {
        attributes["Main-Class"] = "com.optloader.core.OptiLoaderCore"
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
