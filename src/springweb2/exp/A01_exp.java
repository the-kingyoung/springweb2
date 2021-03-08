package springweb2.exp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A01_exp {
	
	@RequestMapping("/newSpring.do")
	public String newSpring() {
		return"WEB-INF\\views\\start.jsp";
	}

}
