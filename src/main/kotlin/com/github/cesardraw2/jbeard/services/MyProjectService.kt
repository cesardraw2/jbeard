package com.github.cesardraw2.jbeard.services

import com.intellij.openapi.project.Project
import com.github.cesardraw2.jbeard.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
