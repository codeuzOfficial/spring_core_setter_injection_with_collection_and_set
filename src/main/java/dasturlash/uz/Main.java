package dasturlash.uz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = (Book) context.getBean("book");
        Order order = (Order) context.getBean("order");

        System.out.println(book);
        System.out.println(order);
    }
}