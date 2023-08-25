package com.loan.loanapp.service;

import com.loan.loanapp.entity.Admin;
import com.loan.loanapp.exception.AdminException;


//import java.util.Collection;
//
//import com.loan.loanapp.entity.Admin;
//import com.loan.loanapp.entity.Customer;
//import com.loan.loanapp.entity.Loans;

public interface AdminService {
	Admin addAdmin(Admin newAdmin) throws AdminException;
	
	Admin deleteAdminById(Integer id) throws AdminException;
	
	Admin updateAdmin(Admin newAdmin) throws AdminException;
	
	Admin getAdminById(Integer id) throws AdminException;

	
	

}
