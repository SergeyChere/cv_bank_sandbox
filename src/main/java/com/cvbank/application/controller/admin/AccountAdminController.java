package com.cvbank.application.controller.admin;

import com.cvbank.application.enteties.admin.AccountAdminEntety;

public interface AccountAdminController {
	
	public boolean createAccountAdmin(AccountAdminEntety account);
	public boolean updateAccountAdmin (AccountAdminEntety account);
	public boolean deleteAccountAdmin (int id);
}