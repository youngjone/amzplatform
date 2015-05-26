/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.amz.plantform;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.amz.platform.start.StartRest;

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration  
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })  
public class StartRestTest {
	
	@Autowired  
    protected WebApplicationContext wac;  
    
//    private final MockHttpServletRequest request = new MockHttpServletRequest();  
//    private final MockHttpServletResponse response = new MockHttpServletResponse();  

	private static Logger logger = LoggerFactory.getLogger(StartRestTest.class);

	@Test
	public void testStartRest() throws Exception {
//		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new StartRest()).build();
		mockMvc
        .perform(MockMvcRequestBuilders.get("/start"))
        .andDo(MockMvcResultHandlers.print())
        .andReturn();
	}
}
