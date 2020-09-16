package com.tennis.statistics.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DummyController {
    private val log: Logger = LoggerFactory.getLogger(DummyController::class.java)

    @GetMapping("/sayHello")
    fun sayHello(): ResponseEntity<String>? {
        log.info("REST request to get fake data!")
        return ResponseEntity.ok("Hello! Shalom! Dobryi Den! Hola! Alloha! Hallo! Bonjour! Salam! Ciao! Hej!")
    }
}
