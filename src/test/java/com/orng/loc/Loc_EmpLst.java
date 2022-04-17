package com.orng.loc;

public class Loc_EmpLst {
	public static String empLst = "menu_pim_viewEmployeeList";
	public static String empName = "//input[@id='empsearch_employee_name_empName']";
	public static String empId = "//input[@id='empsearch_employee_name_empName']/following::input[2]";
	public static String empStat = "//select[@id='empsearch_employee_status']";
	public static String include = "//select[@id='empsearch_employee_status']/following::select[1]";
	public static String supName = "//input[@id='empsearch_employee_name_empName']/following::input[3]";
	public static String jobTitle = "//select[@id='empsearch_employee_status']/following::select[2]";
	public static String subUnit = "//select[@id='empsearch_employee_status']/following::select[3]";
	public static String search ="searchBtn";
	public static String reset ="resetBtn";
	public static String add ="btnAdd";
	public static String delete ="btnDelete";
}
