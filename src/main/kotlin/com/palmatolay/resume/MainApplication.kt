package com.palmatolay.resume

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
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

@EnableWebSecurity
@Configuration
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.antMatcher("/**").authorizeRequests().anyRequest().permitAll()
        http.headers().frameOptions().sameOrigin()
    }
}