package com.dekolis.kards

class Deck {

    val isEmpty: Boolean
        get() = cards.isEmpty()
    val isFull: Boolean
        get() = cards.size == 52

    private val cards = mutableListOf<Kard>().apply {
        for (suit in suits) {
            for (rank in ranks) {
                add(rank of suit)
            }
        }
    }

    fun shuffle() = cards.shuffle()

    fun draw() = cards.removeAt(0)

    override fun toString() = cards.toString()
}