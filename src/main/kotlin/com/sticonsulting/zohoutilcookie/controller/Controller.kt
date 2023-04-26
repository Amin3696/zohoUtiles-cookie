package com.sticonsulting.zohoutilcookie.controller

import com.sticonsulting.zohoutilcookie.service.GreetingService
import mu.two.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class Controller(val greetingService: GreetingService) {

    companion object : KLogging()

    @GetMapping("/{name}")
    fun greeting(@PathVariable("name") name: String): String {
        logger.info("name: $name")
        return greetingService.retrieveGreeting(name)
    }
}