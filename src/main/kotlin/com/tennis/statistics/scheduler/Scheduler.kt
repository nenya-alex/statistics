package com.tennis.statistics.scheduler

import com.tennis.statistics.service.ScheduledService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import javax.inject.Inject

@Service
class Scheduler {

    @Inject
    lateinit var scheduledService: ScheduledService

    @Scheduled(cron = "0 0/1 * * * *") //every minute
    fun getUpcomingMatches() {
        scheduledService.saveUpcomingMatches()
    }
}
