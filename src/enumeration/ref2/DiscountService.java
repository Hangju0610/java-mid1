package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPrecent() / 100;
    }
}
