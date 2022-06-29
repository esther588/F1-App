package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/sign-up")
	String signUpPage() {
		return "sign-up";
	}

	@PostMapping("/sign-up")
	String signUp(User user) {
		userService.signUpUser(user);
		return "redirect:/log-in";
	}

	@GetMapping("/log-in")
	String logInPage() {
		return "log-in";
	}

	@PostMapping("/log-in")
	String signUp() {
		return "redirect:/homepage";
	}

}
