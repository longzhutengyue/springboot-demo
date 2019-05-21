package com.neo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neo.mapper.test1.User1Mapper;
import com.neo.mapper.test2.User2Mapper;
import com.neo.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api")
@Api("GreetingController相关的api")
public class GreetingController {
	private static final Logger logger= LoggerFactory.getLogger(GreetingController.class);
	
    @Autowired
    private User1Mapper user1Mapper;

	@Autowired
	private User2Mapper user2Mapper;
	
	@ApiOperation(value = "根据id查询用户信息", notes = "根据id查询用户信息")
	@ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getStudent(@PathVariable Long id) {
        logger.info("开始查询某个学生信息");
    	User user=user1Mapper.getOne(id);
        return user;
    }
}
