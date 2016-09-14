package example.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
}
