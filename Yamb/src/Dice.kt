import kotlin.random.Random

class Dice {
    var locked:Boolean=false
        private set;
    var rolled : Int = 1
        private set;

    fun roll():Unit{
        if(!locked) this.rolled= Random.nextInt(from=1,until=7);
    }
    fun lock(){
        this.locked=true;
    }
    fun unlock(){
        this.locked=false;
    }
}