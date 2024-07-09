package in.cdac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mview = new ModelAndView("welcome");
		mview.addObject("msg", "Welcome DAC to Spring MVC");
		return mview;
	}
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "userlogin";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String userlogin(HttpServletRequest request, Model m){
		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");
		if(email.equals("admin@cdac.in") && password.equals("admin")) {
			m.addAttribute("msg", "Welcome admin");
			return "welcome";
		}
		
		m.addAttribute("msg", "Unauthorized Access");
		return "errorpage";	
		
	}
	
	
	
	
}
