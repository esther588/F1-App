package com.esther588.F1App.user;

import com.esther588.F1App.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/sign-up")
	String getSignUp(User user) {
		return "sign-up";
	}

	@PostMapping("/sign-up")
	public String signUp(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "sign-up";
		} else {
			userService.signUpUser(user);
			return "redirect:/log-in";
		}
	}

	@GetMapping("/log-in")
	String getLogIn() {
		return "log-in";
	}

	@PostMapping("/log-in")
	public String logIn(@Valid BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "log-in";
		} else {
			return "redirect:/homepage";
		}
	}

	@GetMapping("/homepage")
	String getHomepage() {
		return "homepage";
	}

}
