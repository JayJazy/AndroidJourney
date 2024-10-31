plugins {
    alias(libs.plugins.multimodule.android.library.compose)
}

android {
    namespace = "com.example.design_system"

}

dependencies {
    implementation(libs.androidx.material3)
    implementation(libs.androidx.compose.foundation)
}