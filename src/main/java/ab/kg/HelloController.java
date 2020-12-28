package ab.kg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	MyService service;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		service.save();
		List l = service.getAllEntities();
		model.addAttribute("message", l);
		return "hello";
	}
}