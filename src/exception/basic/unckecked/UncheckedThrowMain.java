package exception.basic.unckecked;

public class UncheckedThrowMain {

    // Exception으로 던져도 된다.
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
