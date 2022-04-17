package com.orng.pagexe;

import com.orng.loc.Loc_Login;

public class Exe_Login extends Loc_Login{
		public static void userName(String data) {
			sendData(findElementById(userName), data);
		}
		public static void passWord(String data) {
			sendData(findElementById(passWord), data);
		}
		public static void logIn() {
			click(findElementById(login));
		}
}
