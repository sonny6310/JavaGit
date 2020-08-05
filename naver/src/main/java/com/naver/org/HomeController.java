package com.naver.org;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/main.ws", method = RequestMethod.GET)
	public String main(Locale locale, Model model, HttpSession session) {
//		UserVO userVO = (UserVO)session.getAttribute("login");
//		if (userVO == null) {
//			model.addAttribute("log", "로그인 안됨");
//		} else {
//			model.addAttribute("log", "로그인 성공!!");
//			model.addAttribute("logininfo", "로그인 한 정보 : ");
//			model.addAttribute("loginemail", userVO);
//		}

		return "site/main";
	}

	@RequestMapping(value = "/Kids.ws", method = RequestMethod.GET)
	public String Kids(Locale locale, Model model, HttpSession session) {

		return "Kids/Kids";
	}

	@RequestMapping(value = "/man2.ws", method = RequestMethod.GET)
	public String man2(Locale locale, Model model, HttpSession session) {

		return "man/man2";
	}

	@RequestMapping(value = "/off.ws", method = RequestMethod.GET)
	public String off(Locale locale, Model model, HttpSession session) {

		return "off_season/off";
	}

	@RequestMapping(value = "/포퍼먼스.ws", method = RequestMethod.GET)
	public String 포퍼먼스(Locale locale, Model model, HttpSession session) {

		return "performance/포퍼먼스";
	}

	@RequestMapping(value = "/women.ws", method = RequestMethod.GET)
	public String women(Locale locale, Model model, HttpSession session) {

		return "women/women";
	}

	@RequestMapping(value = "/login.ws", method = RequestMethod.GET)
	public String login(Locale locale, Model model, HttpSession session) {

		return "login/login";
	}

	@RequestMapping(value = "/logout.ws", method = RequestMethod.GET)
	public String logout(Locale locale, Model model, HttpSession session) {

		session.invalidate();

		return "login/logout";
	}
}
