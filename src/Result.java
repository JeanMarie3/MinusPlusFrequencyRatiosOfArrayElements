import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float RatioOfPositiveElements = 0;
        float RatioOfNegativeElements = 0;
        float RatioOfZeroElements = 0;

        for(int i = 0; i < arr.size(); i++) {

            if(arr.get(i)>0){
                RatioOfPositiveElements++;

            }
            else if(arr.get(i)<0){
                RatioOfNegativeElements++;

            }
            else{
                RatioOfZeroElements++;
            }
        }
        System.out.println("Frequency Ratio Of Positive Elements: " + String.format("%.6f",RatioOfPositiveElements/arr.size()));
        System.out.println("Frequency Ratio Of Negative Elements: " + String.format("%.6f",RatioOfNegativeElements/arr.size()));
        System.out.println("Frequency Ratio Of Zero Elements: " + String.format("%.6f",RatioOfZeroElements/arr.size()));
    }
}

/*
8
-4 3 -9 0 4 1 -5 -8
 */

