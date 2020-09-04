package com.example.utilties;

import java.util.Properties;
/**
 * @author : KIMHEEJIN
 * @date 2020. 9. 04.
 * @objective 과제_SalaryMgmt_CodeReview
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */
//부서 알아오기
public class DepartmentUtil {
	public static String getDepartment(char code) {
		Properties deptInfo = new Properties();
		deptInfo.setProperty("A", "영업부");
		deptInfo.setProperty("B", "업무부");
		deptInfo.setProperty("C", "홍보부");
		deptInfo.setProperty("D", "인사부");
		deptInfo.setProperty("E", "경리부");
		deptInfo.setProperty("F", "판촉부");
		deptInfo.setProperty("G", "총무부");
		String key = String.valueOf(code); //code값 문자로 변환해서 key에 대입
		return deptInfo.getProperty(key);    //key에 해당하는 부서명값 리턴
	}
}
