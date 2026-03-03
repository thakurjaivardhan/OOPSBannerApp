import java.util.HashMap;
import java.util.Map;

public class uc8 {

    /* -----------------------------------
       Character Pattern Storage (MODEL)
       ----------------------------------- */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /* -----------------------------------
       HashMap for Pattern Management
       ----------------------------------- */
    static class PatternRepository {

        private static final Map<Character, CharacterPattern> patternMap =
                new HashMap<>();

        // Static block initializes patterns
        static {

            // O
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            // P
            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "****** ",
                    "*     *",
                    "****** ",
                    "*      ",
                    "*      "
            }));

            // S
            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            }));
        }

        // Lookup function (HashMap retrieval)
        public static CharacterPattern getPattern(char ch) {
            return patternMap.get(Character.toUpperCase(ch));
        }
    }

    /* -----------------------------------
       Banner Rendering Logic (VIEW)
       ----------------------------------- */
    public static void renderBanner(String text) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                CharacterPattern cp =
                        PatternRepository.getPattern(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    /* -----------------------------------
       MAIN METHOD
       ----------------------------------- */
    public static void main(String[] args) {

        String bannerText = "OOPS";

        renderBanner(bannerText);
    }
}


