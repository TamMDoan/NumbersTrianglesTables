package io.zipcoder.microlabs.mastering_loops;


import java.io.StringBufferInputStream;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder result = new StringBuilder();

        while(start < stop){
          if(start % 2 == 0){
              result.append(start);
          }

          start++;
        }
        return result.toString();
    }


    public static String getOddNumbers(int start, int stop) {

        StringBuilder result = new StringBuilder();

        while(start < stop){
            if(start % 2 == 1){
                result.append(start);
            }

            start++;
        }

        return result.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        StringBuilder result = new StringBuilder();

        while(start < stop){
            result.append(start*start);
            start += step;
        }
        return result.toString();
    }

    public static String getRange(int start) {

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < start; i++){
            result.append(i);
        }
        return result.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder result = new StringBuilder();

        while(start < stop){
            result.append(start);
            start++;
        }

        return result.toString();
    }


    public static String getRange(int start, int stop, int step) {

        StringBuilder result = new StringBuilder();
        while(start < stop){
            result.append(start);
            start += step;
        }
        return result.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder result = new StringBuilder();

        while(start < stop){
            // Math.pow returns a double, casting it to int for the test
            result.append((int) Math.pow(start, exponent));
            start += step;
        }
        return result.toString();
    }
}
