// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

private val versionMajor: Int = 1
private val versionMinor: Int = 1

val versionCode by extra(initialValue = 1)
val versionName by extra(initialValue = "$versionMajor.$versionMinor")