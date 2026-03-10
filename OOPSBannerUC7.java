public class OOPSBannerUC7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char character, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == character) {
                return cp.getPattern();
            }
        }

        return new String[7];
    }

    public static void displayBanner(String word, CharacterPatternMap[] patterns) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPatternMap[] patterns = {oPattern, pPattern, sPattern};

        String word = "OOPS";

        displayBanner(word, patterns);
    }
}