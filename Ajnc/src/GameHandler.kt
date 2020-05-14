class GameHandler {

    var deck:Deck;
    var computer:Computer;
    var player: Player;
    //var players:MutableList<BlackJackCardPlayer> = mutableListOf(computer,player) // moguća buduća implementacija s više igrača
    init {
        deck=Deck();
        computer=Computer();
        player= Player();
    }


    fun game(){
        deck.shuffle();
        print("Players turn! ")
        player.addToHand(deck.dealCard())
        do{
            player.showHand()
            println("")
            println("Your score is: "+player.getScore())
            player.valueOfAs()
            println("Pull another or done? enter: pull/done")
            val input= readLine()
            if(input=="pull") player.addToHand(deck.dealCard());
            if (input=="done") player.done=true;
        }while (player.done==false)
        computer.addToHand(deck.dealCard())
        do{
            computer.addToHand(deck.dealCard())
            computer.valueOfAs()
            
        }while(computer.getScore()<18)
        println("Computer:"+computer.getScore().toString()+" Player:"+player.getScore().toString())
    }

}