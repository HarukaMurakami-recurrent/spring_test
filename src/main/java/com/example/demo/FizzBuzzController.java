package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {

	// form action="/apply" method="post"
	@RequestMapping(value="/apply" ,method=RequestMethod.POST)
	public ModelAndView apply(
			@RequestParam("num") int num,
			ModelAndView mv) {
		
		
		//Fizz Buzzの処理をここに記載
		String result = "";
		
		if(num == 0) {
			result = "aaa";
		}else if(num%3 == 0 && num % 5 == 0 && num % 7 == 0) {
			result = "Fizz Buzz Ass";
		}else if(num%3 == 0 && num % 5 == 0) {
			result = "Fizz Buzz";
		}else if(num%5 == 0 && num % 7 == 0) {
			result = "Buzz Ass";
		}else if(num%7 == 0 && num % 3 == 0) {
			result = "Ass Fizz";
		}else if(num%3 == 0) {
			result = "Fizz";
		}else if(num % 5 == 0) {
			result = "Buzz";
		}else if(num%7 == 0) {
			result = "Ass";
		}else{
			result = "中間淳太";
		}
		
		
		
		//結果を設定
		mv.addObject("result",result);
		mv.addObject("num",num);
		
		//表示するファイルを設定
		mv.setViewName("index");
		return mv;
	}

}
