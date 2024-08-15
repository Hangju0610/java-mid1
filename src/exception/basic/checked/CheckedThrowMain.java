package exception.basic.checked;

public class CheckedThrowMain {

    // Exception으로 던져도 된다.
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
