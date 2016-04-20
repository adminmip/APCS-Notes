package FRQ2;

import FRQ2.HiddenWord;

/**
 * Created by mip on 4/19/16.
 */
public class HiddenWordTester
{

    public static void main(String[] args)
    {


        HiddenWord test1 = new HiddenWord( "stuff" );
        HiddenWord test2 = new HiddenWord( "things" );
        HiddenWord test3 = new HiddenWord( "beans");


        // Test all the chars being correct, except for one.
        //System.out.println("Your hint for number one is: " + test1.getHint("stufz"));
        //System.out.println("Your second hint for number one is: " + test1.getHint("beans"));

         System.out.println("Your hint for number two is: " + test2.getHint("sthing"));
        // System.out.println(test3.getHint("baens"));


    }



}
