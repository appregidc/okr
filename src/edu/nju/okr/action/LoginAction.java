package edu.nju.okr.action;

import edu.nju.okr.service.StaffUserManageService;

/** 
 * @author jianjun Chen 
 *
 * @version ����ʱ�䣺2016��3��6�� ����2:25:13 
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
