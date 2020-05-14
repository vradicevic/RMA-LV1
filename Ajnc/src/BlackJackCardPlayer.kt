interface BlackJackCardPlayer {
    var mHand:MutableMap<String,Int>;

    fun getScore():Int{
        var sum=0;
        mHand.keys.forEach { key-> sum+= mHand.getValue(key) }
        return sum;
    }
    fun valueOfAs(){
    }
    fun showHand(){
        print("Your cards are:")
        mHand.forEach{card -> print("${card.key}->${card.value.toString()} ")};
    }
    fun addToHand(card:Pair<String,Int>){
        mHand.put(card.first,card.second)
        valueOfAs()
    }


}