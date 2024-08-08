package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 생성자로 또 만들어줘야 한다.
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
