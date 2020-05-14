class YambCheck(override var dices: MutableList<Dice>) :CombinationCheck {

    override fun check():Boolean {
        var array: MutableList<Int> = mutableListOf<Int>()
        for (dice in this.dices) {
            array.add(dice.rolled!!)
        }
        if(array.distinct().size==1) return true; else return false;
    }
}