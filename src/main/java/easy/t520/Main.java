package easy.t520;

public class Main {
    public static void main(String[] args) {
        String word = "g";
        System.out.println("new Main().detectCapitalUse() = " + new Main().detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        if (word == null || "".equals(word)) {
            return false;
        }
        int upper = 0;//大写字母个数
        for (char c : word.toCharArray()) {
            if (c >= 65 && c <= 90) {
                upper++;
            }
        }
        // 全大写或者全小写
        if (upper == word.length() || upper == 0) {
            return true;
        }
        if (upper == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {//首字母大写
            return true;
        }
        return false;
    }
}
