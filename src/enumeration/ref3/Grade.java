package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    // class처럼 내부 맴버를 가질 수 있다.
    private final int discountPercent;

    // 또한 생성자도 사용이 가능하다.
    // 단, 생성자에 접근이 불가능하도록 막혀있다. private이라고 생각하면 편하다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPrecent() {
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
