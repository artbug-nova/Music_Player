package com.example.musicplayer.controllers

import com.example.musicplayer.models.User
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(description = "Manage Customer")
class HomeController{
    @ApiOperation(value = "Hello world")
    @GetMapping("/hello")
    fun hello(@ApiParam(value = "hello world", example = "Hello world") supers: String?): String {
        return User().gets()
    }
}