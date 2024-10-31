import com.example.convention.addUILayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies


class AndroidComposeUIConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("multimodule.android.library.compose")
            }

            dependencies {
                addUILayerDependencies(target)
            }
        }
    }
}