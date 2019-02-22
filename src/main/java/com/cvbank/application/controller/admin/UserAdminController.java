package com.cvbank.application.controller.admin;

public interface UserAdminController {
	
	public boolean blockUser(int id);
	public boolean unblockUser(int id);
}