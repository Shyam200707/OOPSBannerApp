public class OOPSBannerApp {

    public static void main(String[] args) {

        String O1 = "  ***  ";
        String O2 = " *     * ";
        String O3 = " *     * ";
        String O4 = " *     * ";
        String O5 = " *     * ";
        String O6 = " *     * ";
        String O7 = "  ***  ";

        String P1 = " **  ";
        String P2 = " *     * ";
        String P3 = " *     * ";
        String P4 = " **  ";
        String P5 = " *       ";
        String P6 = " *       ";
        String P7 = " *       ";

        String S1 = "  ** ";
        String S2 = " *       ";
        String S3 = " *       ";
        String S4 = "  ***  ";
        String S5 = "       * ";
        String S6 = "       * ";
        String S7 = " **  ";

        System.out.println(String.join(" ", O1, O1, P1, S1));
        System.out.println(String.join(" ", O2, O2, P2, S2));
        System.out.println(String.join(" ", O3, O3, P3, S3));
        System.out.println(String.join(" ", O4, O4, P4, S4));
        System.out.println(String.join(" ", O5, O5, P5, S5));
        System.out.println(String.join(" ", O6, O6, P6, S6));
        System.out.println(String.join(" ", O7, O7, P7, S7));

    }
}