package ch.bbw.spring.springFormular;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		return "personform";
	}

	@PostMapping("/")
	public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "personform";
		}
		System.out.println("PersonController:checkPersonInfo(): " + person.toString());
		
		return "redirect:/";
	}

}
