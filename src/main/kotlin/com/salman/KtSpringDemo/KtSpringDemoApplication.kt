package com.salman.KtSpringDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KtSpringDemoApplication

fun main(args: Array<String>) {
	runApplication<KtSpringDemoApplication>(*args)
}
