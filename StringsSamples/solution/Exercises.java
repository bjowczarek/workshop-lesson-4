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
        System.out.println("  it's really boring to play with strings  ".equals(sampleOne.toLowerCase()));

        // ex.2
        System.out.println("It's really BORING to play with STRINGS".equals(sampleOne.trim()));

        // ex.3 
        System.out.println("BORING".equals(sampleOne.trim().split("\\s")[2]));

        // ex.4 - print position of "to"
        System.out.println(sampleOne.indexOf("to"));
        
        // ex.5
        int start = sampleOne.indexOf("STRINGS");
        int end = sampleOne.length();
        System.out.println("STRINGS  ".equals(sampleOne.substring(start, end)));

        // ex.5
        System.out.println("It's really NOT BORING to play with STRINGS".equals(sampleOne.replaceAll("BORING", "NOT BORING").trim()));

        // ex.6 - observe output. Why both if's produce different output?
        String myName = "Tom";
        String hisName = "Tomas".substring(0, 3);
        System.out.println("hisName: " + hisName);

        System.out.println("myName == hisName => " + (myName == hisName));
        System.out.println("myName.equals(hisName) => " + (myName.equals(hisName)));

        hisName = myName;

        System.out.println("myName == hisName => " + (myName == hisName));
        System.out.println("myName.equals(hisName) => " + (myName.equals(hisName)));

        /*
         * == and equals don't mean the same. 
         * "Tomas".substring(0, 3); -> created new object in String pool with hisName referencing to it.
         * == compares references to String objects in String pool.
         * equals() compares literals -> what is written.
         */
    }
}