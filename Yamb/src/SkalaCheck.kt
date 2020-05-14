class SkalaCheck(override var dices: MutableList<Dice>) :CombinationCheck  {
    override fun check(): Boolean {
        var array: MutableList<Int> = mutableListOf<Int>()
        for (dice in this.dices) {
            array.add(dice.rolled!!)
        }
       if(array.distinct().size==6)return true;
       else return false;
    }
}