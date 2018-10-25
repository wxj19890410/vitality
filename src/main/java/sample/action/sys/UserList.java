package sample.action.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.service.SystemService;

@Controller
@RequestMapping(value = "/userList")
public class UserList {
	private static final long serialVersionUID = 1L;

	@Autowired
	private SystemService systemService;

	@RequestMapping(value = "/getUserList")
	public Object execute() {
		return "getUserList";
	}

	@RequestMapping(value = "/userDatagrid")
	public Object datagrid() {
		return "userDatagrid";
	}
}
