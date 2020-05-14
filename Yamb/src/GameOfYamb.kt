class GameOfYamb {
    var dices: MutableList<Dice> = mutableListOf<Dice>();
    var turn=0;

    init {
        for (n in 1..6) {
            dices.add(Dice());
        }
    }

    fun startGame(){
        println("Press enter to start and roll.");
        val dummy=readLine();
        rollDices();
        do {
            checkForRoll();
            println(checkResult());
            println("Are you satisfied with result?(y/n)")
            val input= readLine();
            if(input=="y") turn==3;

        }while(turn<3)


    }

    fun showGameState() {
        for (dice in dices) {
            print("${dice.rolled} ")
        }
        println("");
    }

    fun lock(index: Int){
        dices[index-1].lock()
    }
    fun unlock(index : Int){
        dices[index-1].unlock()
    }

    fun rollDices() {
        for (dice in dices) {
            dice.roll();
        }
        turn++;
    }

    fun checkResult(): String {
        showGameState();
        if(YambCheck(dices).check()) return "Imaš YAMB";
        else if(PokerCheck(dices).check())return "Imaš POKER";
        else if(SkalaCheck(dices).check()) return " Imaš SKALU";
        else return "Nije ništa od 3 moguće kombinacije.";
    }

    fun checkForLock(){
        var input:String;
        do {
            println("If you want to lock dice enter its position (1..6) or enter 'n' ");
            input= readLine()!!;
            if(input!="n"){
                this.lock(input.toInt());
            }
        }while(input!="n")

    }

    fun checkForRoll(){
        var input:String;
        do {
            println(checkResult());
            checkForLock();
            println("Want to reroll unlocked dices?(y/n):");
            input= readLine()!!;
            if(input=="y"){
                this.rollDices();
            }
            if(this.turn==3) input="n";

        }while(input!="n");
    }


}