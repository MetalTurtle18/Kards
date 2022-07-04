package com.dekolis.kards

infix fun Rank.of(that: Suit) = Kard(that, this)

class Kard(val suit: Suit, val rank: Rank) {
    override fun toString() = "${
        when (rank) {
            Ace -> "Ace"
            Two -> "Two"
            Three -> "Three"
            Four -> "Four"
            Five -> "Five"
            Six -> "Six"
            Seven -> "Seven"
            Eight -> "Eight"
            Nine -> "Nine"
            Ten -> "Ten"
            Jack -> "Jack"
            Queen -> "Queen"
            King -> "King"
        }
    } of ${
        when (suit) {
            Clubs -> "Clubs"
            Diamonds -> "Diamonds"
            Hearts -> "Hearts"
            Spades -> "Spades"
        }
    }"
}

sealed interface Suit
object Clubs : Suit
object Hearts : Suit
object Spades : Suit
object Diamonds : Suit

val suits = listOf(Clubs, Hearts, Spades, Diamonds)

sealed interface Rank
object Ace : Rank
object Two : Rank
object Three : Rank
object Four : Rank
object Five : Rank
object Six : Rank
object Seven : Rank
object Eight : Rank
object Nine : Rank
object Ten : Rank
object Jack : Rank
object Queen : Rank
object King : Rank

val ranks = listOf(Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King)