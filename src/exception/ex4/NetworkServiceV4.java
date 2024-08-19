package exception.ex4;


import exception.ex3.ConnectionExceptionV3;
import exception.ex3.NetworkClientExceptionV3;
import exception.ex3.NetworkClientV3;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);
        try {
            client.connect();
            client.send(data);
            // 더 디테일 한 자식을 먼저 잡아야 한다.
        } finally {
            client.disconnect();
        }
    }
}
