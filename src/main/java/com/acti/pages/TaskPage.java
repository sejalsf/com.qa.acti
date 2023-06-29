package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskPage extends DriverScript{
// ***********************Page Locators***********************//
	
	@FindBy(xpath = "//div[text()='Add New']") WebElement Addnewcustomer;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newcustomeroption;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement CustomerNametextbox;
	@FindBy(xpath  = "//textarea[@placeholder='Enter Customer Description']") WebElement customerdescriptiontextBox;
	@FindBy(xpath = "//div[@class='components_button withPlusIcon']") WebElement CreatcustomerButton;
	@FindBy(xpath = "//span[@class = 'innerHtml']") WebElement successmsg;
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]") WebElement SearchButton;
	@FindBy(xpath = "//div[@class = 'editButton']") WebElement EditButton;
	@FindBy(xpath = "//div[@class='actionButtonWrapper pressed']//div[@class='actionButton']") WebElement Actionbutton;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']") WebElement DeleteButton;
	@FindBy(xpath = "//span[normalize-space()='Delete permanently']") WebElement DeletepermenentlyButton;
	@FindBy(xpath = "//span[@class = 'innerHtml']") WebElement SuccessDeletemsg;
	
	
// ***********************Page Initialization***********************//
	
	
	public TaskPage() {
		PageFactory.initElements(driver, this);

	}
	
// ***********************Page Methods***********************//
public void clickAddnewButton() {
	Addnewcustomer.click();
}

public void ClickNewcustomer() {
	newcustomeroption.click();
}


public void CustomerNameBox(String CustomerName) 
{
	CustomerNametextbox.sendKeys(CustomerName);
}

public void EntercustomerDescription(String Description) {
	customerdescriptiontextBox.sendKeys(Description);
	
}

public void clickcutomerbutton() {
	CreatcustomerButton.click();
}

public String getsuccessmsg() {
	return successmsg.getText();
	
}

public void ClickSearchButton(String Name) {
	SearchButton.sendKeys(Name);
}


public void clickEditButton() {
	EditButton.click();
}

public void ClickActionButton() {
	Actionbutton.click();
}

public void ClickDeleteButton() {
	DeleteButton.click();
}

public void ClickDeletePermenently() {
	DeletepermenentlyButton.click();
	
}
public String getsuccessdeletemsg() {
	return SuccessDeletemsg.getText();
}

}
	

