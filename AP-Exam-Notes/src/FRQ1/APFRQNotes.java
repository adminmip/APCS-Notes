package FRQ1;

/**
 * Created by mip on 4/18/16.
 */
public class APFRQNotes {


    /** Returns the sum of the entries in the one-dimensional array arr.
     *
     */
    public static int arraySum(int[] arr)
    {

        int sum = 0;

        for(int x = 0; x < arr.length; x++)
        {

            sum += arr[x];

        }

        return sum;
    }

    public static int[] rowSums(int[][] arr2D)
    {

        int[] sums = new int[arr2D.length];
        for(int x = 0; x < arr2D[1].length; x++)
        {
            // Tp grab an element, you need [row][column].
            // To grab a row, you need [row].
            sums[x] = arraySum(arr2D[x]);

        }

        return sums;

    }

    public static boolean isDiverse(int[][] arr2D)
    {
        // Get the row sums!!  Use your rowSums method.

        int[] sums = rowSums(arr2D);

        for(int x = 0; x < sums.length; x++) {
            for (int y = 0; x < sums.length; y++)

            {
                if(x != y)
                {

                    return false;

                }
            }
        }
        return true;

    }
}
