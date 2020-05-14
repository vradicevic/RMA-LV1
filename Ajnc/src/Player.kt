class Player: BlackJackCardPlayer {
    var done:Boolean=false;
    override var mHand: MutableMap<String, Int> = mutableMapOf();

    override fun valueOfAs() {

        mHand.forEach{ (card, value) ->
            if(value==11){ //razina 1
            println("Change value of As from 11 to 1? y/n")
            if(readLine()=="y") {
                mHand[card]=1;
            }
            }else if(value==1){ //razina 1 - nece se obje iste razine provjeravati u jednom prolasku kroz ovu funkciju
                println("Change value of As from 1 to 11? y/n")
                if(readLine()=="y")mHand[card]=11;}}


    }


}