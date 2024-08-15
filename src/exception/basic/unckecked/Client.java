package exception.basic.unckecked;

public class Client {
    public void call() {
        // 문제 상황
        throw new MyUncheckedException("ex");
    }
}
