package com.tennis.statistics

import org.apache.commons.lang3.StringUtils
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class StatisticsApplication

private val log: Logger = LoggerFactory.getLogger(StatisticsApplication::class.java)

fun main(args: Array<String>) {
    val env : Environment = runApplication<StatisticsApplication>(*args).environment
    logApplicationStartup(env)
}

private fun logApplicationStartup(env: Environment) {
    var protocol = "http"
    val serverPort = env.getProperty("server.port")
    var contextPath = env.getProperty("server.servlet.context-path")
    if (StringUtils.isBlank(contextPath)) {
        contextPath = "/"
    }
    log.info("""
    ----------------------------------------------------------
        Application '${env.getProperty("spring.application.name")}' is running! 
        Access URLs:
        Local: 		$protocol://localhost:$serverPort${contextPath}api/sayHello
        Swagger: 	$protocol://localhost:$serverPort${contextPath}swagger-ui.html
    ----------------------------------------------------------""")
}
