package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SafetyCheckController {
	
	@GetMapping("/safetyCheck")
	public String safetyCheck(Model model) {
		model.addAttribute("title", "안전점검 내역조회");
		return "safe/safetyCheck";
	}
	
	@GetMapping("/safetyCheckAdd")
	public String safetyCheckAdd(Model model) {
		model.addAttribute("title", "안전점검등록");
		return "safe/safetyCheckAdd";
	}
	
	@PostMapping("/safetyCheckAdd")
	public String safetyCheckAdd() {
		return "redirect:/safetyCheck";
	}
	
	@GetMapping("/modifySafetyCheck")
	public String modifySafetyCheck(Model model) {
		model.addAttribute("title", "안전점검수정");
		return "safe/modifySafetyCheck";
	}
}
