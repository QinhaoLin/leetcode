package easy.t520;

public class Main {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println("new Main().detectCapitalUse() = " + new Main().detectCapitalUse(word));

    }

    public boolean detectCapitalUse(String word) {
        if (word == null || "".equals(word)) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (c < 65 || c > 90) {
                return false;
            }
        }

        return true;
    }

}
