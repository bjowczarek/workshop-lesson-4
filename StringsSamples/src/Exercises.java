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
        //System.out.println("  it's really boring to play with strings  ".equals(/* write here */));

        // ex.2
        //System.out.println("It's really BORING to play with STRINGS".equals(/* write here */));

        // ex.3 
        //System.out.println("BORING".equals(/* write here */);

        // ex.4 - print position of "to"
        //System.out.println(/* write here */);
        
        // ex.5
        //System.out.println("STRINGS  ".equals(/* write here */));

        // ex.5
        //System.out.println("It's really NOT BORING to play with STRINGS".equals(/* write here */));

        // ex.6 - observe output. Why both if's produce different output?
        String myName = "Tom";
        String hisName = "Tomas".substring(0, 3);
        System.out.println("hisName: "+ hisName );
        
        System.out.println("myName == hisName => "+(myName == hisName));
        System.out.println("myName.equals(hisName) => " + (myName.equals(hisName)));

        hisName=myName;

        System.out.println("myName == hisName => " + (myName == hisName));
        System.out.println("myName.equals(hisName) => " + (myName.equals(hisName)));

    }
}