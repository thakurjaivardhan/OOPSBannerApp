/**
 * UC6 - OOPS Banner using Static Helper Methods
 * Modular design using reusable character builders.
 */
public class uc6 {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] banner = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds one full line of "OOPS"
    public static String buildLine(int row) {
        return String.join("  ",
                letterO(row),
                letterO(row),
                letterP(row),
                letterS(row));
    }

    // Letter O pattern
    public static String letterO(int row) {
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return O[row];
    }

    // Letter P pattern
    public static String letterP(int row) {
        String[] P = {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
        return P[row];
    }

    // Letter S pattern
    public static String letterS(int row) {
        String[] S = {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
        return S[row];
    }
}
