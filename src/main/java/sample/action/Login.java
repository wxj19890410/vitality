package sample.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.service.SystemService;


@Controller
@RequestMapping(value = "/")
public class Login {
	private static final long serialVersionUID = 1L;

	@Autowired
	private SystemService systemService;

	@RequestMapping(value = "/login")
	public Object login(String username, String password1) {
		return "1";
	}

}
