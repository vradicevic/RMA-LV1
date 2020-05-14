class Deck {
    var cards = mutableMapOf<String,Int>();
    var deck= mutableListOf<String>()
    val faces = "23456789TJQKA"
    val colors= "HDCS"
    init{
        faces.forEach { face -> colors.forEach { color ->
            cards.put(
                "$face$color",
                when(face){
                    '2'-> 2
                    '3'-> 3
                    '4'-> 4
                    '5'-> 5
                    '6'-> 6
                    '7'-> 7
                    '8'->8
                    '9'->9
                    'T'->10
                    'J'-> 10
                    'Q'-> 10
                    'A'-> 11
                    else -> 10
                }
            ) }

        }
        cards.keys.forEach{key-> deck.add(key)};
        shuffle()
    }
    fun dealCard():Pair<String,Int>{
        var key= deck.component1();
        deck.remove(key)
        //key=key.trim('[',']')
        var pair:Pair<String, Int>;
        pair = Pair(key,cards.get(key)!!);
        return pair;

    }
    fun shuffle() = deck.shuffle();
}