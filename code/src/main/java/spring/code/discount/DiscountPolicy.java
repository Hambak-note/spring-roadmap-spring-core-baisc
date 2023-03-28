package spring.code.discount;

import spring.code.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
