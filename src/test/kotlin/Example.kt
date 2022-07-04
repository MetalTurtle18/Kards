import com.dekolis.kards.Deck

fun main() {
    val deck = Deck()
    println(deck)
    deck.shuffle()
    println(deck)
    println(deck.draw())
    println(deck.isFull)
}