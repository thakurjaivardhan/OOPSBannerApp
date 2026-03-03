/**
 * UC4 - OOPS Banner using String Array and Loop
 * Improves modularity by storing banner lines in an array.
 */
public class uc4  {

    public static void main(String[] args) {

        // Store banner lines using String.join()
        String[] banner = {

            String.join("", " *****    ", " *****   ", " ******   ", " *****  "),
            String.join("", "*     *  ", "*     *  ", "*     * ", "*     * "),
            String.join("", "*     *  ", "*     *  ", "*     * ", "*       "),
            String.join("", "*     *  ", "*     *  ", "******   ", " *****  "),
            String.join("", "*     *  ", "*     *  ", "*        ", "      * "),
            String.join("", "*     *  ", "*     *  ", "*        ", "*     * "),
            String.join("", " *****    ", " *****   ", "*        ", " *****  ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}