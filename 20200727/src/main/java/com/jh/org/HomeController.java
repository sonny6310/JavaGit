package com.jh.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private AA a;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

//		기존 방법
//		AA a = new AA();
//		a.doA();

//		spring 방법: servlet-context.xml에서 <beans:bean class="com.jh.org.AA"></beans:bean> 추가하고,
//		여기(HomeController)에서 @Autowired private 클래스명 클래스인스턴스; 선언한 후 사용
		a.setA("3");
		a.doA();
		
		return "home";
	}

	@RequestMapping(value = "/a.ws", method = RequestMethod.GET)
	public String a(Locale locale, Model model) {
		logger.info("Welcome a.ws! The client locale is {}.", locale);

		model.addAttribute("aa", "this is aa");
		model.addAttribute("bb", "this is bb");

		return "a";
	}

}
