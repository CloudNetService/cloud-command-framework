plugins {
    id("ca.stellardrift.gitpatcher") version "1.1.0"
}

gitPatcher.patchedRepos {
    register("cloud") {
        submodule = "cloud"
        patches = file("patches")
        target = file("patched-cloud")
    }
}

tasks.register("rebuildPatches") {
    dependsOn(tasks.makePatches)
}
