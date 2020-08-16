package com.github.telemat.intellijcodilityplugin.services

import com.intellij.openapi.project.Project
import com.github.telemat.intellijcodilityplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
