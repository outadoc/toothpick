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
    api(libs.tp)
    api(libs.inject)

    implementation(libs.ksp)
    implementation(libs.kotlinpoet.core)
    implementation(libs.kotlinpoet.ksp)
    implementation(projects.compilerCore)

    testImplementation(libs.junit4)
    testImplementation(libs.compiletesting.kt)
    testImplementation(projects.compilerTest)
}
