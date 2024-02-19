import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
	kotlin("jvm")
	kotlin("plugin.spring")
}

kotlin {
	java.sourceCompatibility = Jvm.sourceCompatibilityVersion
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = Jvm.TARGET_VERSION
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}