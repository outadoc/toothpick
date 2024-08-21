import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm")
    `maven-publish`
}

tasks.withType<KotlinCompile> {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    implementation(libs.ksp)
    implementation(projects.compilerFactory)
    implementation(projects.compilerMemberinjector)

    testImplementation(libs.junit4)
    testImplementation(libs.compiletesting.kt)
    testImplementation(projects.compilerTest)
}
