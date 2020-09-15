package com.tennis.statistics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class StatisticsApplication

fun main(args: Array<String>) {
    runApplication<StatisticsApplication>(*args)
}
