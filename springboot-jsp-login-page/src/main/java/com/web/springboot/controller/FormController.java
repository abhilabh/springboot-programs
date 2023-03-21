package com.web.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FormController {
	@GetMapping({
        "/",
        "/login"
    })
	public String login() {
		return "login";
	}
	
	@PostMapping("/details")
	public String viewDetails(@RequestParam("cid") String cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap modelMap) {
		modelMap.put("cid", cid);
		modelMap.put("cname", cname);
		modelMap.put("cemail", cemail);
		return "ViewCustomerDetails";

	}
}
