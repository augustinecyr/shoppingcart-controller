package com.sg.shoppingcart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sg.shoppingcart.services.CartService;


@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartSvc;


    @PostMapping
	public String postCart(@RequestBody MultiValueMap<String, String> form
				, Model model) {

		String name = form.getFirst("name");
		if ((null == name) || (name.trim().length() <= 0))
			name = "anonymous";

		model.addAttribute("name", name);

		return "cart";
	}

}
