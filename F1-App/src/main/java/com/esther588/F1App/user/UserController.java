package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/log-in")
	String logInPage() {
		return "log-in";
	}

	@PostMapping("/sign-up")
	public String logIn() {
		return "redirect:/homepage";
	}

	@GetMapping("/sign-up")
	String signUpPage(User user) {
		return "sign-up";
	}

	@PostMapping("/sign-up")
	public String signUp(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "sign-up";
		} else {
			userService.signUpUser(user);
			return "redirect:/log-in";
		}
	}

}
