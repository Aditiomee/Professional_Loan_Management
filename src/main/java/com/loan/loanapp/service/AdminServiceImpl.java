package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.entity.Admin;

//@Component
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin addAdmin(Admin newAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin deleteAdminById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin newAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
