import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose)
    alias(libs.plugins.detekt)
}

dependencies {
    detektPlugins(libs.plugins.detekt.rules.compose.get().toString())
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    @Suppress("UNUSED_VARIABLE") sourceSets {
        val jsMain by getting {
            kotlin.srcDir("src/main/kotlin")
            resources.srcDir("src/main/resources")

            dependencies {
                implementation(compose.html.core)
                implementation(compose.runtime)
            }
        }
    }
}

// a temporary workaround for a bug in jsRun invocation - see https://youtrack.jetbrains.com/issue/KT-48273
afterEvaluate {
    rootProject.extensions.configure<NodeJsRootExtension> {
        nodeVersion = "16.0.0"
        versions.webpackDevServer.version = "4.0.0"
        versions.webpackCli.version = "4.10.0"
    }
}
