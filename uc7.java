import java.util.HashMap;
import java.util.Map;

public class uc7 {

    /* ------------------------------
       Static Inner Class
       ------------------------------ */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    /* ------------------------------
       Character Pattern Map
       ------------------------------ */
    static class CharacterPatternMap {

        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            // Letter O
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            // Letter P
            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      "
            }));

            // Letter S
            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            }));
        }

        public static CharacterPattern getPattern(char ch) {
            return patternMap.get(ch);
        }
    }

    /* ------------------------------
       Banner Printer
       ------------------------------ */
    public static void printBanner(String text) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                CharacterPattern cp =
                        CharacterPatternMap.getPattern(Character.toUpperCase(ch));

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /* ------------------------------
       MAIN METHOD
       ------------------------------ */
    public static void main(String[] args) {

        printBanner("OOPS");
    }
}