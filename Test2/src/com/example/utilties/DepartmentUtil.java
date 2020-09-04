package com.example.utilties;

import java.util.Properties;
/**
 * @author : KIMHEEJIN
 * @date 2020. 9. 04.
 * @objective ����_SalaryMgmt_CodeReview
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */
//�μ� �˾ƿ���
public class DepartmentUtil {
	public static String getDepartment(char code) {
		Properties deptInfo = new Properties();
		deptInfo.setProperty("A", "������");
		deptInfo.setProperty("B", "������");
		deptInfo.setProperty("C", "ȫ����");
		deptInfo.setProperty("D", "�λ��");
		deptInfo.setProperty("E", "�渮��");
		deptInfo.setProperty("F", "���˺�");
		deptInfo.setProperty("G", "�ѹ���");
		String key = String.valueOf(code); //code�� ���ڷ� ��ȯ�ؼ� key�� ����
		return deptInfo.getProperty(key);    //key�� �ش��ϴ� �μ��� ����
	}
}
