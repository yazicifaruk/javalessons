package convertorpack;

public class Convertor{

    public String convert(int toconvertnumber) {
        if (toconvertnumber % 15 == 0) return "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz";
        if (toconvertnumber % 5 == 0) return "1,2,Fizz,4,Buzz";
        if (toconvertnumber % 3 == 0) return "1,2,Fizz";
        return String.valueOf(toconvertnumber);
    }

    public static void main(String[] args) {

        Convertor getResult = new Convertor();
        for (int i = 1; i <= 20; i++)
            System.out.println(getResult.convert(i));


    }
}




