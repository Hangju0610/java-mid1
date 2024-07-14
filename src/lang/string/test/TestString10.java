package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] result = fruits.split(",");
        for (String fruit : result) {
            System.out.println(fruit);
        }

        String result2 = String.join("->", result);
        System.out.println(result2);
    }
}
