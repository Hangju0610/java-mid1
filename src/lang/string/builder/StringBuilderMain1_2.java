package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        // 가변적이다. 문자열을 추가, 삭제, 수정할 수 있으며, 이때마다 새로운 객체를 생성하지 않는다.
        // 이로인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다.

        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);
    }
}
