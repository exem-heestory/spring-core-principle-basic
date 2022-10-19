package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

// tip: ctrl shift t 로 Test 바로 생성 가능
public class RateDiscountPolicy implements DiscountPolicy{

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
