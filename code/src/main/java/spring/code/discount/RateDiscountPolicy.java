package spring.code.discount;

import spring.code.member.Grade;
import spring.code.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {

            return price * discountPercent / 100;
        } else{
            return 0;
        }
    }
}
