package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1); //seed가 같으면 Random의 결과가 같다.
        // 랜덤은 내부에서 Seed값을 사용해서 랜덤 값을 구한다.
        // Seed 값이 같으면 항상 같은 결과를 출력한다.

        int randomInt = random.nextInt(); // 랜덤 `int` 값을 반환한다.
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; //1 ~ 10까지 출력
        System.out.println("1 ~ 10: " + randomRange2);
    }
}
