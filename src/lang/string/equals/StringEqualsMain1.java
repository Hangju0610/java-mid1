package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x004

        // 왜 리터럴로 하면 True가 나오는가?
        // 리터럴로 선언하면 같은 문자열이 있는지 먼저 확인하고 있으면 같은 주소를 참조하게 한다.
        // 문자열 리터럴, 문자열 풀을 사용한다.
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
