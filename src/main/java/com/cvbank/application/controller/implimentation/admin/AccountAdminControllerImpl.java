package com.cvbank.application.controller.implimentation.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cvbank.application.controller.admin.AccountAdminController;
import com.cvbank.application.enteties.admin.AccountAdminEntety;

@RestController
public class AccountAdminControllerImpl implements AccountAdminController {

	@PostMapping(value="/createAccountAdmin")
	public boolean createAccountAdmin(@RequestBody AccountAdminEntety account) {
		return false;
	}

	@PostMapping(value= "/updateAccountAdmin")
	public boolean updateAccountAdmin(@RequestBody AccountAdminEntety account) {
		return false;
	}

	@PostMapping(value= "/deleteAccountAdmin")
	public boolean deleteAccountAdmin(@RequestParam(name="id") int id) {
		return false;
	}
}