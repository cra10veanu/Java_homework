package Double_Exercises;

import static java.lang.Math.sqrt;

public class HypotenuseRightAngledTriangle {
    public static void main(String[] args) {

        int a = 6;
        int b = 3;

        double c = sqrt ( Math.pow(a,2) + Math.pow(b,2) );

        System.out.println (c);
    }
}
