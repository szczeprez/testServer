/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch04.dao;

import com.springinpractice.ch04.domain.Role;

public interface RoleDao{
	
	Role findByName(String name);
}
