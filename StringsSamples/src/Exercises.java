/**
 * StringSamples
 */
public class Exercises {

    public static void main(String[] args) {
        
        /*
         * Ex. call String methods to modify provided variable to expected result 
         * "True" printed to console means that everything was fine.
         * There're many options to achive expected result
         */
        //Sample
        String sampleOne="  It's really BORING to play with STRINGS  ";
        System.out.println("  IT'S REALLY BORING TO PLAY WITH STRINGS  ".equals(sampleOne.toUpperCase()));

        //ex.1 
        System.out.println(sampleOne.toLowerCase());
        System.out.println("  it's really boring to play with strings  ".equals(sampleOne.toLowerCase()));

        // ex.2
        System.out.println(sampleOne.trim());
        System.out.println("It's really BORING to play with STRINGS".equals(sampleOne.trim()));

        // ex.3 
        System.out.println(sampleOne.trim().split("\\s")[2]);
        System.out.println("BORING".equals(sampleOne.trim().split("\\s")[2]));

        // ex.4 - print position of "to"
        System.out.println(sampleOne.indexOf("to"));
        
        // ex.5
        int start = sampleOne.indexOf("STRINGS");
        int end = sampleOne.length();
        System.out.println("STRINGS  ".equals(sampleOne.substring(start, end)));

    }
}