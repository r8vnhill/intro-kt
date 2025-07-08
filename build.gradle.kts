plugins {
    id("jvm.conventions") apply false
}

subprojects {
    plugins.apply("jvm.conventions")
}