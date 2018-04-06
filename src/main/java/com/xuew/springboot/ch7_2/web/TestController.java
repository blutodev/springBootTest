/**
 * 
 */
package com.xuew.springboot.ch7_2.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 薛玮
 *
 */
@RestController
public class TestController {
	
	@RequestMapping(value="/test", produces="application/json;charset=utf-8")
	public Object index2(){
		Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", "hello world");
        return result;
	}
}
