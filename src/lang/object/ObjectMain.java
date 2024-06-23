package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // toString() 메서드는 Object 클래스의 메서드이다.
        String string = child.toString();

        // 객체의 정보에 대해 문자열로 반환한다.
        System.out.println(string);
    }
}
