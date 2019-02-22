package com.cvbank.application.controller.admin;

public interface CVAdminController {
	
    public boolean approvedCV(int id);
    public boolean refusedCV(int id);
    public boolean approvedAlreadyRefusedCV(int id);
}