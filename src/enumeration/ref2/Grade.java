package enumeration.ref2;

// 기본적으로 enum도 클래스를 상속받는다. 따라서 생성자, getter, setter를 사용할 수 있다.
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 기본적으로 생성자는 private로 생각하면 편하다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPrecent() {
        return discountPercent;
    }
}
