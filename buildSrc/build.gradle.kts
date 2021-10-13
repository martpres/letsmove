plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        create("gitHookPlugin") {
            id = "at.fh.letsmove.plugins.gitHook"
            implementationClass = "at.fh.letsmove.plugins.GitHookPlugin"
        }
    }
}