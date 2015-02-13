package com.gtr.studyproject.modle;

/**
 * 
 * @author xiaotian
 * @information ���������ݶ���
 */
public class DataApplicationUnique {
	private static DataApplicationUnique dau;

	/**
	 * �������ƹ�����
	 */
	private DataApplicationUnique() {

	}

	/**
	 * 
	 * @return ����ʵ������
	 */
	public static synchronized DataApplicationUnique getInstance() {
		if (dau == null)
			dau = new DataApplicationUnique();
		return dau;
	}
}
