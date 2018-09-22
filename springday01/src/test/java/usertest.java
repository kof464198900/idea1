
import com.ipc.dao.Impl.userdaoImpl;
import com.ipc.domain.Mypojo;
import com.ipc.domain.Users;
import com.ipc.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class usertest {
    @Test
    public void sptest(){

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        userdaoImpl userdao = context.getBean("userdao", userdaoImpl.class);
        userdao.ms();

    }


    @Test
    public void spring2(){
        ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("springconfig.xml");
        UserServiceImpl userIm = cont.getBean("UserIm", UserServiceImpl.class);
        userIm.show();

    }

    @Test
    public void userstest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Users users = context.getBean("users", Users.class);
        System.out.println(users.getText());
    }

    @Test
    public void pojotest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        Mypojo mypojo = context.getBean("mypojo", Mypojo.class);
        String[] str = mypojo.getStr();
        String s = Arrays.toString(str);
        System.out.println(s);
        List ls = mypojo.getLs();
        System.out.println(ls);
        Map map = mypojo.getMap();
        System.out.println(map);
        Set set = mypojo.getSet();
        System.out.println(set);
        Properties prots = mypojo.getProts();
        System.out.println(prots);


    }






}
