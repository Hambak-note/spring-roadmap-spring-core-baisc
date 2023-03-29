package spring.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.code.discount.DiscountPolicy;
import spring.code.discount.FixDiscountPolicy;
import spring.code.member.MemberRepository;
import spring.code.member.MemberService;
import spring.code.member.MemberServiceImpl;
import spring.code.member.MemoryMemberRepository;
import spring.code.order.OrderService;
import spring.code.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
