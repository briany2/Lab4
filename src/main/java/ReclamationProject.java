/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
 */

/**
 *
 */
public class ReclamationProject {
    /**
     * @param stringOne String
     * @param stringTwo String
     * @return String
     */
    public static String doit(final String stringOne, final String stringTwo) {
        String lString = stringOne;
        String sString = stringTwo;
        if (lString.length() > sString.length()) {
            String c = lString;
            lString = sString;
            sString = c;
        }
        String lSubstring = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < lString.length(); i++) {
            for (int j = lString.length() - i; j > 0; j--) {
                for (int k = 0; k < sString.length() - j; k++) {
                    if (lString.regionMatches(i, sString, k, j) && j > lSubstring.length()) {
                        lSubstring = lString.substring(i, i + j);
                    }
                }
            } // Ah yeah
        }
        return lSubstring;
    }
}
