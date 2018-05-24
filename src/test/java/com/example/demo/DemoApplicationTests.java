package com.example.demo;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {
        User user = new User();
        user.setUsername("lxyheart2");
        user.setPassword("123456");
		userMapper.insert(user);
		List<User> users = userMapper.selectAllUser();
        System.out.println(users);
    }

}
