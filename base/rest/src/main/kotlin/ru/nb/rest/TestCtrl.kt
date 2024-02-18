package ru.nb.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestCtrl {

	@GetMapping
	fun test() = "Test: OK"

}