package com.orng.loc;

import com.orng.pagexe.Exe_PIM;

public class Loc_AddEmp extends Exe_PIM{
	public static String empAdd = "menu_pim_addEmployee";
	public static String fstName = "//input[@id='firstName']";
	public static String midName = "//input[@id='firstName']/following::input[1]";
	public static String LastName = "//input[@id='firstName']/following::input[2]";
	public static String empId = "//input[@id='firstName']/following::input[3]";
	public static String chkBox = "//input[@id='firstName']/following::input[5]";
	public static String userName = "//input[@id='firstName']/following::input[6]";
	public static String pwd = "//input[@id='firstName']/following::input[7]";
	public static String confPwd = "//input[@id='firstName']/following::input[8]";
	public static String sel = "status";
	public static String saveDet = "btnSave";
}
