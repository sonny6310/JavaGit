package com.jh.org;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jh.dao.AADAO;
import com.jh.dto.AADTO;
import com.jh.service.AAService;

@Controller
public class HomeController {

	@Autowired
	AAService aaService;

	@Autowired
	AADAO aaDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		model.addAttribute("here", "홈입니다");

		return "home";
	}

	@RequestMapping(value = "/aajoin", method = RequestMethod.GET)
	public String aajoinget(Locale locale, Model model) {

		model.addAttribute("here", "insert 하는중");

		return "joinform";
	}

	@RequestMapping(value = "/aajoin", method = RequestMethod.POST)
	public String aajoinpost(Locale locale, Model model, @RequestParam String bb) {

		aaService.insert(bb);

		return "redirect:aaselectall";
	}

	@RequestMapping(value = "/aaselectall", method = RequestMethod.GET)
	public String aaselectall(Locale locale, Model model) {

		model.addAttribute("here", "select 완료");

		List<AADTO> list = aaService.selectAll();
		model.addAttribute("list", list);

		return "aaselectall";
	}

	@RequestMapping(value = "/aaupdate", method = RequestMethod.GET)
	public String aaupdateget(Locale locale, Model model) {

		model.addAttribute("here", "update 하는중");

		return "updateform";
	}

	@RequestMapping(value = "/aaupdate", method = RequestMethod.POST)
	public String aaupdatepost(Locale locale, Model model, AADTO aaDTO) {

		aaService.update(aaDTO);

		return "redirect:aaselectall";
	}

	@RequestMapping(value = "/aadeleteall", method = RequestMethod.GET)
	public String aadelete(Locale locale, Model model) {

		aaDAO.deleteall();

		return "redirect:aaselectall";
	}
}
