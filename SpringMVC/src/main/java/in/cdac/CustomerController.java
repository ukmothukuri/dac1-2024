package in.cdac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping(value = "/customregistration", method = RequestMethod.GET)
	public ModelAndView customerRegistration() {
		ModelAndView mview = new ModelAndView("register", "command", new Customer());
		return mview;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String getCustomerDetails(@ModelAttribute("customer")Customer c, Model m) {
		m.addAttribute("name", c.getName());
		m.addAttribute("email", c.getEmail());
		m.addAttribute("mobile", c.getMobile());
		return "viewcustomer";
	}
}
