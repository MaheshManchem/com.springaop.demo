package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MydemoLoginAspect {
	
//	@Before("execution(public void com.luv2code.aopdemo.dao.AccountDao.addAccount())")
	@Before("execution(public void add*(..))")
	public void beforeaddAccount() {
		System.out.println("Running in the Aspect class");
	}
	
}
