package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 문자열은 너무 자주 다루어지기 때문에 편의상 특별히 + 연산 제공
        System.out.println(result1);
        System.out.println(result2);
    }
}
