package edu.nju.okr.action;

import edu.nju.okr.service.StaffUserManageService;

/** 
 * @author jianjun Chen 
 *
 * @version 创建时间：2016年3月6日 下午2:25:13 
 * 
 * @declare
 */
public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StaffUserManageService userService;
	
	public String login(){
		
		return LOGIN;
	}
	
}
