class PokerCheck(override var dices: MutableList<Dice>) :CombinationCheck {
    override fun check(): Boolean {
        var array: MutableList<Int> = mutableListOf<Int>()
        for (dice in this.dices) {
            array.add(dice.rolled!!)
        }
        if ((array.distinct().size == 2)
            &&
            ((array.filter { it -> it == array.distinct()[0] }.size == 4)||(array.filter { it -> it == array.distinct()[1] }.size == 4))) {
            return true;} else return false;
    }

}