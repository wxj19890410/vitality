package sample.action.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/test")
public class HelloWorld {
	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/helloWorld")
	public Object execute() {
		return "helloWorld";
	}
}
