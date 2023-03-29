import java.lang.Math;

public class Kaninchen {
    public static void main(String[] args) {
        double pop = 2;

        System.out.println();
        for(int jahr = 1; jahr <= 16; jahr++) {
            pop = 2*Math.exp(Math.log(15)*jahr);
            System.out.println(" Nach " + jahr + ".Jahr:"
                                +(long) pop + " Tiere");
        }
    }
}

