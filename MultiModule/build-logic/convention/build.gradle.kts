plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"



dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.ksp.gradlePlugin)
}


gradlePlugin{
    plugins {
        register("androidApplication") {
            id = "multimodule.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose"){
            id = "multimodule.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary"){
            id = "multimodule.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        

        register("androidLibraryCompose") {
            id = "multimodule.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidComposeUI"){
            id = "multimodule.android.compose.ui"
            implementationClass = "AndroidComposeUIConventionPlugin"
        }
    }
}