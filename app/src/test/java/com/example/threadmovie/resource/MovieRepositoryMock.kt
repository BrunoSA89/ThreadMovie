package com.example.threadmovie.resource

import com.example.threadmovie.model.Movie
import javax.security.auth.callback.Callback


class MovieRepositoryMock {
    fun getMovie(callback: (movies: List<Movie>) -> Unit {
        Thread(Runnable {
            Thread.sleep(1000)
            callback.invoke(listOf(
                    Movie(0, "Django Livre"),
                    Movie( 0, "Straiht Outta Comptom")
            ))
        }).start()

    }
}