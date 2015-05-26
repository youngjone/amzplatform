package com.amz.platform.start;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/start")
public class StartRest {
	private static Logger logger = LoggerFactory.getLogger(StartRest.class);
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Map<String,String> list(Model model) {
		Map<String,String> p = new HashMap<String, String>();
		p.put("test1", "1");
		p.put("test2", "2");
		return p;
	}
}
