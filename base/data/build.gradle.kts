plugins {
	id("spring-data")
}

dependencies {
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
}

extra["springCloudVersion"] = Spring.CLOUD_VERSION
dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${Spring.CLOUD_VERSION}")
	}
}