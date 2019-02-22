package com.cvbank.application.controller.implimentation.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cvbank.application.controller.admin.CVAdminController;

public class CVAdminControllerImpl implements CVAdminController {

	  @PostMapping(value="/approvedCV")
	  public boolean approvedCV(@RequestParam(name="id") int id) {
		  return false;
	  }
	    
	  @PostMapping(value="/refusedCV")
	  public boolean refusedCV(@RequestParam(name="id") int id) {
		  return false;
	  }
	    
	  @PostMapping(value="/approvedAlreadyRefusedCV")
	  public boolean approvedAlreadyRefusedCV(@RequestParam(name="id") int id) {
		  return false;
	  }
}