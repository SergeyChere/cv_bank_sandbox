package com.cvbank.application.controller.implimentation.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cvbank.application.controller.admin.UserAdminController;

public class UserAdminControllerImpl implements UserAdminController {

	@PostMapping(value="/blockUser")
	public boolean blockUser(@RequestParam(name="id") int id) {
		return false;
	}

	@PostMapping(value="/unblockUser")
	public boolean unblockUser(@RequestParam(name="id") int id) {
		return false;
	}
}