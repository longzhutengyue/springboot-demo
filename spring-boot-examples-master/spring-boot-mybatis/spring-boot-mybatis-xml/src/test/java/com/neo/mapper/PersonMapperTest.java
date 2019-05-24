package com.neo.mapper;

import com.neo.enums.UserSexEnum;
import com.neo.model.Person;
import com.neo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

	@Autowired
	private PersonMapper personMapper;

	@Test
	public void insertMaxIdTest() throws Exception {
		Person person=new Person();
		person.setName("潘金莲");
		person.setAddress("烧饼铺");
		person.setAge(18);
		personMapper.insertMaxId(person);
	}


}