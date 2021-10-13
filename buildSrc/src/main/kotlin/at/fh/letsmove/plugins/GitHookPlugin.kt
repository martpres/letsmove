package at.fh.letsmove.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class GitHookPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("installGitHooks") {
            doLast {
                println("Install GitHook")
            }
        }
    }
}