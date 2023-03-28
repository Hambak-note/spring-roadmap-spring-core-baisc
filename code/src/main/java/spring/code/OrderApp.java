package spring.code;

import spring.code.member.Grade;
import spring.code.member.Member;
import spring.code.member.MemberService;
import spring.code.member.MemberServiceImpl;
import spring.code.order.Order;
import spring.code.order.OrderService;
import spring.code.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
