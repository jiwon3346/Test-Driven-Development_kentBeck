public class Dollar extends Money {

    /* amount 는 최초에 10이였고 5 * 2 이였고 이것은 중복이였다. */


    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }


}
