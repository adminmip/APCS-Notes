package Notes;

/**
 * Created by mip on 4/14/16.
 */
public class ReferencesNotes {

    public static void main(String[] args)
    {
        /* ==== INTEGER ==== */
        int myNum = 7;
        changeNum(myNum);
            /* Pass-by-value */
            /*  A copy of the argument is made and sent to the method */
        System.out.println( myNum );

        /* ==== STRING ==== */

        String myStr = "Hello";
        changeString( myStr );

        System.out.println( myStr );

        /* ==== INTEGER ARRAY ==== */

        int[] myNums = { 1, 2, 3, 4 };
        changeNum( myNums );
        for(int el: myNums)
        {

            System.out.println(el + " ");

        }

        /* ==== PERSONAL CLASSES ==== */

        testClass  myObject = new testClass( 123 );
        changeNum( myObject );
        System.out.print( "Object Attribute:  " + myObject.num);


        /* ==== COPIES ==== */

        /* Shallow Copy */

        testClass copy = myObject;
        copy.num = -1; // Try to alter only the copy
        // Original should be untouched if it's a proper copy
        System.out.println(myObject.num);

        /* Deep Copy */

        testClass realCopy = new testClass(myObject.num);
        System.out.println("Before number change in realCopy:  " +   realCopy.num);

        changeNum( realCopy );

        System.out.println("After number change in realCopy:  " +   realCopy.num);
    }


    public static void changeNum( int n )
    {

        n = 4 * n;


    }


    /* Triple the values of each element within the array */
    public static void changeNum( int[] nums )
    {

        for(int x = 0; x < nums.length; x++)
        {

            nums[x] *= 3;

        }



    }

    /** Use this to change the number within testClass
     *
     * @param o
     */
    public static void changeNum( testClass o )
    {

        o.num = 777;

    }




    public static void changeString( String str )
    {

        str = "world";

    }


}
