package com.example.specialexam

import kotlin.random.Random

class MovieQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displayMovieQuote():String{
            val movieQuotes = mapOf(
                Pair(1,"If life were predictable it would cease to be life, and be without flavor. \n- Eleanor Roosevelt"),
                Pair(2,"The whole secret of a successful life is to find out what is one’s destiny to do, and then do it. \n- Henry Ford"),
                Pair(3,"In order to write about life first you must live it. \n- Ernest Hemingway"),
                Pair(4,"The big lesson in life, baby, is never be scared of anyone or anything. \n- Frank Sinatra"),
                Pair(5,"Sing like no one’s listening, love like you’ve never been hurt, dance like nobody’s watching, and live like it’s heaven on earth. \n- Various Sources"),
                Pair(6,"Curiosity about life in all of its aspects, I think, is still the secret of great creative people. \n- Leo Burnett"),
                Pair(7,"Life is not a problem to be solved, but a reality to be experienced. \n– Soren Kierkegaard"),
                Pair(8,"The unexamined life is not worth living. \n- Socrates"),
                Pair(9,"Turn your wounds into wisdom. \n- Oprah Winfrey"),
                Pair(10,"The way I see it, if you want the rainbow, you gotta put up with the rain. \n- Dolly Parton")
            )
            return when (getNumber()) {
                (1) -> { movieQuotes[1].toString() }
                (2) -> { movieQuotes[2].toString() }
                (3) -> { movieQuotes[3].toString() }
                (4) -> { movieQuotes[4].toString() }
                (5) -> { movieQuotes[5].toString() }
                (6) -> { movieQuotes[6].toString() }
                (7) -> { movieQuotes[7].toString() }
                (8) -> { movieQuotes[8].toString() }
                (9) -> { movieQuotes[9].toString() }
                (10) -> { movieQuotes[10].toString() }
                else -> { movieQuotes[1].toString() }
            }
        }

    }
}