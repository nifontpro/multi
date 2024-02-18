plugins {
	`kotlin-dsl`
}

val kotlinVersion: String by project
val springBootVersion: String by project

dependencies {
// Kotlin
	implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")

	// Spring Boot
	implementation("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")

}