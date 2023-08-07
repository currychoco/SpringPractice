package service;

import config.JavaConfig;
import entity.TestUser;
import entity.contants.UserGender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);

        TestUser user1 = new TestUser(null, "홍길동", LocalDate.parse("1997-09-03", DateTimeFormatter.ofPattern("yyyy-MM-dd")), UserGender.MALE);

        TestService testService = ac.getBean(TestService.class);

        TestUser newUser = testService.save(user1);
        System.out.println(newUser.toString());

        TestUser userById = testService.findById(newUser.getId());
        System.out.println(userById.toString());

        TestUser user2 = new TestUser(null, "박완규", LocalDate.parse("1999-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd")), UserGender.MALE);
        testService.save(user2);

        List<TestUser> userList = testService.findAll();
        System.out.println(userList.toString());

        testService.deleteById(newUser.getId());
        List<TestUser> userListAfterDelete = testService.findAll();
        System.out.println(userListAfterDelete.toString());
    }
}
