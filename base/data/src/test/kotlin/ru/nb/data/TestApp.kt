package ru.nb.data

import org.springframework.boot.fromApplication
import org.springframework.boot.with

fun main(args: Array<String>) {
	fromApplication<DataApplication>().with(TestBeans::class).run(*args)
}
