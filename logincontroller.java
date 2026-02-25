package Login_Form.login_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logincontroller {

	@GetMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@GetMapping("/final")
	public String finalPage() 
	{
		return "final";
	}
	
}



