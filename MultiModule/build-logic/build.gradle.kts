plugins {
    id("java-library")
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    //alias(libs.plugins.jetbrains.kotlin.jvm)
}


dependencies{
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "multimodule.android.hilt"
            implementationClass = "com.jayys.multimodule.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "multimodule.kotlin.hilt"
            implementationClass = "com.jayys.multimodule.HiltKotlinPlugin"
        }
        register("androidRoom") {
            id = "multimodule.android.room"
            implementationClass = "com.jayys.multimodule.AndroidRoomPlugin"
        }
    }
}