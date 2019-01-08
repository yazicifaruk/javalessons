package com.fizzbuzzexample;

public class FizzBuzzConvertor{

    public String convertor(int toconvertnumber) {

if(toconvertnumber%3==0) return "Fizz";
if(toconvertnumber%5==0) return "Buzz";
if(toconvertnumber%15==0) return"FizzBuzz";

        return String.valueOf(toconvertnumber);
    }
}
