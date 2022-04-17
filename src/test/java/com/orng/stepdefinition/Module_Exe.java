package com.orng.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.orng.pagexe.Exe_AddEmp;
import com.orng.pagexe.Exe_Login;
import com.orng.pagexe.Exe_PIM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Module_Exe extends Exe_AddEmp{
	
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    userName(string);
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
	   passWord(string);
	}
	@When("Click Login")
	public void click_login() {
	   logIn();
	}
	@Then("Validate the home page title")
	public void validate_the_home_page_title() {
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	@When("Click PIM")
	public void click_pim() {
	    pim();
	}
	
	@When("Wait for some time")
	public void wait_for_some_time() {
	   impWait();
	}
	
	@When("Move to Configuration")
	public void move_to_configuration() {
	    configuration();
	}
	@When("Click Optional Fields")
	public void click_optional_fields() {
	    option();
	}
	@When("Click Edit button")
	public void click_edit_button() {
	    edit();
	}
	
	@When("Wait for some time more")
	public void wait_for_some_time_more() {
	   impWait();
	}
	@When("Click CheckBox1")
	public void click_check_box1() {
	    checkBox1();
	}
	@When("Click CheckBox2")
	public void click_check_box2() {
	    checkBox2();
	}
	@When("Click CheckBox3")
	public void click_check_box3() {
	    checkBox3();
	}
	@When("Click CheckBox4")
	public void click_check_box4() {
	   checkBox4();
	}
	@When("Click Save button")
	public void click_save_button() {
	   save();
	}
	
	@Given("Click Add Employee")
	public void click_add_employee() {
	    addEmployee();
	}
	@When("Enter the Employee Name")
	public void enter_the_employee_name(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		firstName(asList.get(0));
		lastName(asList.get(2));
	}
	@When("Enter Employee Id {string}")
	public void enter_employee_id(String string) {
	    empId(string);
	}
	@When("Click the check box")
	public void click_the_check_box() {
	   checkBox();
	}
	@When("Enter login details")
	public void enter_login_details(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		userName(asList.get(0));
		passWord(asList.get(1));
		confirmPwd(asList.get(2));
	}
	@When("select the status {string}")
	public void select_the_status(String string) {
	   select(string);
	}
	@When("save the details")
	public void save_the_details() {
	   save();
	}





	
	}




