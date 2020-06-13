package easy.t709;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("new Main().toLowerCase() = " + new Main().toLowerCase(str));
    }

    public String toLowerCase(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            // if (c >= 'A' && c<='Z'){
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            sb.append(c);
        }


        return sb.toString();
    }
}
