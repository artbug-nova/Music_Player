package com.example.musicplayer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MusicplayerApplication

fun main(args: Array<String>) {
	runApplication<MusicplayerApplication>(*args)
}
