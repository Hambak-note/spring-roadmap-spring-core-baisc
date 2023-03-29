package spring.code;

import spring.code.discount.DiscountPolicy;
import spring.code.discount.FixDiscountPolicy;
import spring.code.member.MemberRepository;
import spring.code.member.MemberService;
import spring.code.member.MemberServiceImpl;
import spring.code.member.MemoryMemberRepository;
import spring.code.order.OrderService;
import spring.code.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
