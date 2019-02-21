package com.hjp.sbm.service.user.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjp.sbm.entity.SysUser;
import com.hjp.sbm.mapper.SysUserMapper;
import com.hjp.sbm.service.user.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
    private SysUserMapper sysUserMapper;
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		SysUser user = new SysUser();
		user.setId("5");
		user.setBranchId("1");
		user.setUsername("username");
		user.setPassword("password");
		user.setStaffName("staffName");
		user.setStatus("1");
		user.setCreateTime(new Date());
		sysUserMapper.insert(user);
	}
	
}
