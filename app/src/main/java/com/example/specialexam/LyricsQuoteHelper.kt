package com.example.specialexam

import kotlin.random.Random

class LyricsQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displayLyricsQuote():String{
            val lyricsQuote = mapOf(
                Pair(1,"The purpose of our lives is to be happy. \n— Dalai Lama"),
                Pair(2,"Life is what happens when you're busy making other plans. \n— John Lennon"),
                Pair(3,"Get busy living or get busy dying. \n— Stephen King"),
                Pair(4,"You only live once, but if you do it right, once is enough. \n— Mae West"),
                Pair(5,"Many of life’s failures are people who did not realize how close they were to success when they gave up. \n— Thomas Edison"),
                Pair(6,"If you want to live a happy life, tie it to a goal, not to people or things. \n— Albert Einstein"),
                Pair(7,"Never let the fear of striking out keep you from playing the game. \n— Babe Ruth"),
                Pair(8,"Money and success don’t change people; they merely amplify what is already there. \n— Will Smith"),
                Pair(9,"Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking. \n— Steve Jobs"),
                Pair(10,"Not how long, but how well you have lived is the main thing. \n— Seneca"),
            )
            return when (getNumber()) {
                (1) -> { lyricsQuote[1].toString() }
                (2) -> { lyricsQuote[2].toString() }
                (3) -> { lyricsQuote[3].toString() }
                (4) -> { lyricsQuote[4].toString() }
                (5) -> { lyricsQuote[5].toString() }
                (6) -> { lyricsQuote[6].toString() }
                (7) -> { lyricsQuote[7].toString() }
                (8) -> { lyricsQuote[8].toString() }
                (9) -> { lyricsQuote[9].toString() }
                (10) -> { lyricsQuote[10].toString() }
                else -> { lyricsQuote[1].toString() }
            }
        }
    }
}