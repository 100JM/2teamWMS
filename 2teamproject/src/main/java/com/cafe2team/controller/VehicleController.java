package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {
	
	@GetMapping("/vehicleList")
	public String vehicleList(Model model) {
		model.addAttribute("title", "차량목록 조회");
		return "vehicle/vehicleList";
	}
	
	@GetMapping("/vehicleAdd")
	public String vehicleAdd(Model model) {
		model.addAttribute("title", "차량등록");
		return "vehicle/vehicleAdd";
	}
	
	@PostMapping("/vehicleAdd")
	public String vehicleAdd() {
		return "redirect:/vehicleList";
	}
}
