package com.orng.pagexe;

import com.orng.loc.Loc_PIM;

public class Exe_PIM extends Loc_PIM{
	public static void pim() {
		click(findElementById(pim));
	}
	public static void configuration() {
		//mvToElement(findElementById(conf));
		click(findElementById(conf));
	}
	public static void option() {
		click(findElementById(option));
	}
	public static void edit() {
		click(findElementById(edit));
	}
	public static void checkBox1() {
		click(findElementByxpath(check1));
	}
	public static void checkBox2() {
		click(findElementByxpath(check1));
	}
	public static void checkBox3() {
		click(findElementByxpath(check1));
	}
	public static void checkBox4() {
		click(findElementByxpath(check1));
	}
	public static void save() {
		click(findElementById(edit));
	}
}
