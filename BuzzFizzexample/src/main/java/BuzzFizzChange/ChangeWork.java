package BuzzFizzChange;

public class ChangeWork{

    public String change(int toChangeNumber) {
        if(toChangeNumber%3==0) return "Buzz";
        if(toChangeNumber%5==0) return "Fizz";
        if(toChangeNumber%15==0)return "BuzzFizz";

        return String.valueOf(toChangeNumber);
    }
}
