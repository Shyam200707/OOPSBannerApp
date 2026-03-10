import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    static class BannerCharacter {
        private char character;
        private String[] pattern;

        public BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static Map<Character, BannerCharacter> buildBannerMap() {
        Map<Character, BannerCharacter> map = new HashMap<>();

        map.put('O', new BannerCharacter('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new BannerCharacter('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new BannerCharacter('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        return map;
    }

    public static void displayBanner(String word, Map<Character, BannerCharacter> map) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                BannerCharacter bc = map.get(ch);
                if (bc != null) {
                    line.append(bc.getPattern()[i]).append("   ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, BannerCharacter> bannerMap = buildBannerMap();
        String word = "OOPS";
        displayBanner(word, bannerMap);
    }
}