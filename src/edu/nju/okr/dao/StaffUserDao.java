package edu.nju.okr.dao;

import edu.nju.okr.model.StaffUser;

public interface StaffUserDao
{
	/*
	 * �����ݿ��в���һ��user��¼
	 */
	public void save(StaffUser user);
	
	
	/*
	 * ���ݲ���������������ϵ�ֵ����user����,����ҵ��򷵻��������,���򷵻�null
	 * column ����
	 * value ��ֵ
	 */
	public StaffUser find(String column,String value);
	
	
	/*
	 * ����id����user���һ����¼
	 */
	public void updateByUserid(StaffUser user);
	
}
