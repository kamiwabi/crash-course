import com.beust.kobalt.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*
import com.beust.kobalt.plugin.packaging.*
// /home/bpdp/kerjaan/git-repos/oldstager/current/github/kamiwabi/crash-course/kotlin/src/bab-06/kobalt/kobalt/src/Build.kt

val p = project {
    name = "hello"
    group = "id.kamiwabi"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-runtime:1.2.71")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.2.71")
    }

    dependenciesTest {
        compile("org.testng:testng:6.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "id.kamiwabi.MainKt"
    }
}