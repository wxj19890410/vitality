package sample.action.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.service.SystemService;


@Controller
@RequestMapping(value = "/userEdit")
public class UserEdit{
	private static final long serialVersionUID = 1L;

	@Autowired
	private SystemService systemService;


	@RequestMapping(value = "/userSave")
	public Object save() {
		return "userSave";
	}

	@RequestMapping(value = "/userDelete")
	public Object delete() {
		return "userDelete";
	}
}
