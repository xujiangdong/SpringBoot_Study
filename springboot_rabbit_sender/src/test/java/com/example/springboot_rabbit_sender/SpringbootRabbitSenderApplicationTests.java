package com.example.springboot_rabbit_sender;

import com.example.springboot_rabbit_sender.Model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitSenderApplicationTests {
	@Autowired
	private MessageSender messageSender;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sendString(){
		messageSender.send("hello world");
	}
	@Test
	public void sendObject() throws JsonProcessingException {
		User user = new User();
		user.setName("张三");
		user.setAge(24);
		user.setSex("男");
		ObjectMapper mapper = new ObjectMapper();
		String message = mapper.writeValueAsString(user);
		messageSender.send(message);
	}
	@Test
	public void manyReciver(){
		for(int i=0;i<10;i++){
			messageSender.send("data--"+i);
		}
	}

}
