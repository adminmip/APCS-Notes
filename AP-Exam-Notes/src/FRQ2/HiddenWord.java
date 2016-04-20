package FRQ2;

/*
 * 1) Do you know how to create a class from scratch?
 */
public class HiddenWord {
    // 2) attribute
    private String word;


    // part 3 - Constructor
    // Default, or non-default

    public HiddenWord(String word) {

        this.word = word;

    }


    /**
     * Part 4 - Method getHint:
     * <p>
     * <p>
     * Three possibilities exist:
     * 1) A letter within the guess is in the correct position and exists
     * 2) A letter within the guess is within the word but not in the right position
     * 3) A letter within the guess doesn't exist at all within the guess
     * Run this code if we've submitted a word,
     * Every time this code runs, we pass in the guess, then...
     */
    public String getHint(String g) {

        // Make the string variable called hint point to an empty string.
        // This will make sure we don't make a NullPointerException
        String hint = "";
        for (int x = 0; x < word.length(); x++) {
            System.out.println(word.length());

            System.out.println("Running FOR loop at char position '" + x + "'.");
            if ((g.substring(x, x + 1)).equals(word.substring(x, x + 1))) {

                hint += g.substring(x, x + 1);

            } else if ( contains(g.substring(x, x + 1)) ) {

                System.out.println("Exists in word, not in correct place.");
                hint += "+";

            } else {

                hint += "*";

            }

        }

        return hint;

    }


    // Returns true if the substring is contained anywhere within the string word
    public boolean contains(String c) {
        System.out.println( "Sending '" + c + "' to the contains() method."  );
        boolean doesContain = true;
        for (int x = 0; x < word.length(); x++) {
            System.out.println("Does '" + word.substring(x, x + 1) + "' match '" + c + "'?" );
            if(c.equals(word.substring(x, x + 1)))
            {
                System.out.println("Yes.");
                return true;
            }
            else
            {

                doesContain = false;
                System.out.println("No.");
            }

        }

        return doesContain;


    }
}