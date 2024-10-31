plugins {
    alias(libs.plugins.multimodule.android.application)

}

android {
    namespace = "com.example.multimodule"


    defaultConfig {
        applicationId = "com.example.multimodule"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
}

dependencies {
    implementation(projects.feature.main)
    implementation(projects.core.designSystem)

}