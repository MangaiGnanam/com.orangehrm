package com.orng.pagexe;

import com.orng.loc.Loc_AddEmp;

public class Exe_AddEmp extends Loc_AddEmp{
	public static void addEmployee() {
		click(findElementById(empAdd));
	}
	public static void firstName(String data) {
		sendData(findElementByxpath(fstName), data);
	}
	public static void middleName(String data) {
		sendData(findElementByxpath(midName), data);
	}
	public static void lastName(String data) {
		sendData(findElementByxpath(LastName), data);
	}
	public static void empId(String data) {
		sendData(findElementByxpath(empId), data);
	}
	public static void checkBox() {
		click(findElementByxpath(chkBox));
	}
	public static void userName(String data) {
		sendData(findElementByxpath(userName), data);
	}
	public static void passWord(String data) {
		sendData(findElementByxpath(passWord), data);
	}
	public static void confirmPwd(String data) {
		sendData(findElementByxpath(confPwd), data);
	}
	public static void select(String data) {
		selectValue(findElementById(sel), data);
	}
	public static void save() {
		click(findElementById(saveDet));
	}

}
