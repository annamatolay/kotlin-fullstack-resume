package com.palmatolay.resume

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}

@Controller
class MainController {
    @GetMapping("/")
    fun index(): String {
//        model: Model
//        ModelAndView()
//        model.addAttribute("user", User())
//        th:text="${user.introduction}"
        return "index"
    }
}