class Computer: BlackJackCardPlayer{
    override var mHand: MutableMap<String, Int> = mutableMapOf();

    override fun valueOfAs(){
        val cardAses: MutableList<String> = mutableListOf();
        mHand.forEach{ (card, value) -> if(value==11)cardAses.add(card) }
        if((getScore()>21)&&cardAses.isNotEmpty()){
            mHand[cardAses[0]]=1;
            valueOfAs();
        }
    }



}