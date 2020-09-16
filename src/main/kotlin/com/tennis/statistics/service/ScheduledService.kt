package com.tennis.statistics.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.time.Instant
import java.time.temporal.ChronoUnit
import javax.inject.Inject

@Service
class ScheduledService {

    @Inject
    lateinit var restTemplate: RestTemplate

    private val UPCOMING_MATCHES_URL = ("https://cds-api.bwin.com/bettingoffer/fixtures?" +
            "x-bwin-accessid=NTZiMjk3OGMtNjU5Mi00NjA5LWI2MWItZmU4MDRhN2QxZmEz&" +
            "lang=en&country=RU&offerMapping=Filtered&sportIds=5&skip=0&take=1&sortBy=StartDate")

    fun saveUpcomingMatches(now: Instant) {
        val inFuture = now.plus(15, ChronoUnit.MINUTES)
        var url: String = "$UPCOMING_MATCHES_URL&from=$now&to=$inFuture"
        val upcomingMatches: MutableMap<*, *>? = restTemplate.getForObject(url, MutableMap::class.java)
//        val result: MutableMap<YamlProcessor.MatchStatus, List<MatchDTO>> = java.util.HashMap<YamlProcessor.MatchStatus, List<MatchDTO>>()
//        result[YamlProcessor.MatchStatus.UPCOMING] = ArrayList<MatchDTO>()
//        scheduledRepository.fillResultByMatches(upcomingMatches, false, result)
//        saveUpcomingMatches(result[MatchStatus.UPCOMING])
    }
}
