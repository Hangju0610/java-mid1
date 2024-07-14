package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // 가변적이다. 문자열을 추가, 삭제, 수정할 수 있으며, 이때마다 새로운 객체를 생성하지 않는다.
        // 이로인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다.

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); // 특정 인덱스에 문자열 삽입
        System.out.println("insert = " + sb);

        sb.delete(4, 8); // 특정 인덱스 범위 삭제
        System.out.println("delete = " + sb);

        sb.reverse(); // 문자열 뒤집기
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
