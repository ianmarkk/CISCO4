package com.example.specialexam

import kotlin.random.Random

class SadQuoteHelper {
    companion object {
        private fun getNumber():Int {
            return Random.nextInt(1,11)
        }

        fun displaySadQuote():String{
            val malungQuotes = mapOf(
                Pair(1,"Do all the good you can, for all the people you can, in all the ways you can, as long as you can. \n- Hillary Clinton"),
                Pair(2,"Don’t settle for what life gives you; make life better and build something. \n- Ashton Kutcher"),
                Pair(3,"Everything negative – pressure, challenges – is all an opportunity for me to rise. \n- Kobe Bryant"),
                Pair(4,"I like criticism. It makes you strong. \n– Lebron James"),
                Pair(5,"You never really learn much from hearing yourself speak. \n – George Clooney"),
                Pair(6,"Life imposes things on you that you can’t control, but you still have the choice of how you’re going to live through this. \n– Celine Dion"),
                Pair(7,"Life is never easy. There is work to be done and obligations to be met – obligations to truth, to justice, and to liberty.  \n– John F. Kennedy"),
                Pair(8,"Live for each second without hesitation \n- John Elton"),
                Pair(9,"Life is like riding a bicycle. To keep your balance, you must keep moving. \n- Albert Einstein"),
                Pair(10,"Life is really simple, but men insist on making it complicated.  \n– Confucius")
            )
            return when (getNumber().toInt()) {
                (1) -> { malungQuotes[1].toString() }
                (2) -> { malungQuotes[2].toString() }
                (3) -> { malungQuotes[3].toString() }
                (4) -> { malungQuotes[4].toString() }
                (5) -> { malungQuotes[5].toString() }
                (6) -> { malungQuotes[6].toString() }
                (7) -> { malungQuotes[7].toString() }
                (8) -> { malungQuotes[8].toString() }
                (9) -> { malungQuotes[9].toString() }
                (10) -> { malungQuotes[10].toString() }
                else -> { malungQuotes[1].toString() }
            }
        }

    }
}