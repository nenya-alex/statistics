package com.tennis.statistics.service

import org.springframework.beans.factory.config.YamlProcessor
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.*
import javax.inject.Inject
import kotlin.collections.set

@Service
class ScheduledService {

    @Inject
    lateinit var restTemplate: RestTemplate

    private val UPCOMING_MATCHES_URL = ("https://bcdapi.itsfogo.com/v1/bettingoffer/grid/upcomingEventsBySport"
            + "?x-bwin-accessId=YjU5ZGYwOTMtOWRjNS00Y2M0LWJmZjktMDNhN2FhNGY3NDkw&sportId=5")

    fun saveUpcomingMatches() {
        val upcomingMatches: MutableMap<*, *>? = restTemplate.getForObject(UPCOMING_MATCHES_URL, MutableMap::class.java)
//        val result: MutableMap<YamlProcessor.MatchStatus, List<MatchDTO>> = java.util.HashMap<YamlProcessor.MatchStatus, List<MatchDTO>>()
//        result[YamlProcessor.MatchStatus.UPCOMING] = ArrayList<MatchDTO>()
//        scheduledRepository.fillResultByMatches(upcomingMatches, false, result)
//        saveUpcomingMatches(result[MatchStatus.UPCOMING])
    }
}
