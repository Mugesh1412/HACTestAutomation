package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class CaseDetailsTab extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public CaseDetailsTab(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void editCaseStatus() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//span[text()='Edit Status']/..")).click();
		Thread.sleep(2000);
	}

	public void updateCaseStatusNew() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//button[@aria-label='Status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Escalated']")).click();
		Thread.sleep(2000);
	}

	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
	}

	public String getValidationMessage() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualmessage = driver.findElement(By.xpath(
				"//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']"))
				.getText();
		Thread.sleep(1000);
		return actualmessage;
	}
	
	//  On the case details page verify stantard fields
	@FindBy(xpath = "//span[normalize-space(text())='Case Owner']")
	public WebElement CaseOwnerField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Account Name']")
	public WebElement AccountNameFiled;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Contact Name']")
	public WebElement ContactNameField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Status']")
	public WebElement StatusField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Priority']")
	public WebElement PriorityField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Contact Phone']")
	public WebElement ContactPhoneField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Case Information']/../../..//span[text()='Contact Email']")
	public WebElement ContactEmailField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Additional Information']/../../..//span[text()='Type']")
	public WebElement TypeField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Additional Information']/../../..//span[text()='Case Origin']")
	public WebElement CaseOriginField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Description Information']/../../..//span[text()='Subject']")
	public WebElement SubjectField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Description Information']/../../..//span[text()='Description']")
	public WebElement DescriptionField;
	
	@FindBy(xpath = "//span[normalize-space(text())='Description Information']/../../..//span[text()='Internal Comments']")
	public WebElement InternalCommentsField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Created By']")
	public WebElement createdByField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Last Modified By']")
	public WebElement LastModifiedByField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Date/Time Opened']")
	public WebElement DateAndTimeOpenedField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Date/Time Closed']")
	public WebElement DateAndTimeClosedField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Web Email']")
	public WebElement WebEmailField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Web Name']")
	public WebElement WebNameField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Web Company']")
	public WebElement WebCompanyField;
	
	@FindBy(xpath = "//span[normalize-space(text())='System Information']/../../..//span[text()='Web Phone']")
	public WebElement WebPhoneField;
	
	public boolean isCaseOwnerFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = CaseOriginField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isContactNameFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ContactNameField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isAccountNameFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = AccountNameFiled.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isStatusFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = StatusField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isPriorityFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = PriorityField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isContactPhoneFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ContactPhoneField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isContactEmailFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ContactEmailField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isTypeFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = TypeField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isCaseOriginFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		scroolByPixelValue(0, 550);
		Thread.sleep(1000);
		boolean result = CaseOriginField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isSubjecteFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = SubjectField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isDescriptionFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = DescriptionField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isInternalCommentsFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = InternalCommentsField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isCreatedByFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		scroolByPixelValue(0, 1000);
		Thread.sleep(1000);
		boolean result = createdByField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isLastModifiedByFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = LastModifiedByField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isDateAndTimeOpenedFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = DateAndTimeOpenedField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isDateAndTimeClosedFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = DateAndTimeClosedField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isWebEmailFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = WebEmailField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isWebNameFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = WebNameField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isWebCompanyFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = WebCompanyField.isDisplayed();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isWebPhoneFieldPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = WebPhoneField.isDisplayed();
		Thread.sleep(1000);    
		return result;
	}
	
	// On the Related List Quick Links verify listed related list items
	@FindBy(xpath = "//h2[text()='Related List Quick Links']/../..//a[contains(text(),'Show All')]")
	public WebElement ShowAllButton;
	
	@FindBy(xpath = "//img[@title='Contact Roles']/../../../..//a")
	public WebElement ContactRolesRL;
	
	@FindBy(xpath = "//img[@title='Case Team']/../../../..//a")
	public WebElement CaseTeamRL;
	
	@FindBy(xpath = "//img[@title='Case Comments']/../../../..//a")
	public WebElement CaseCommentsRL;
	
	@FindBy(xpath = "//img[@title='Work Orders']/../../../..//a")
	public WebElement WorkOrdersRL;
	
	@FindBy(xpath = "//img[@title='Open Activities']/../../../..//a")
	public WebElement OpenActivitiesRL;
	
	@FindBy(xpath = "//img[@title='Activity History']/../../../..//a")
	public WebElement ActivityHistoryRL;
	
	@FindBy(xpath = "//img[@title='Files']/../../../..//a")
	public WebElement FilesRL;
	
	@FindBy(xpath = "//img[@title='Approval History']/../../../..//a")
	public WebElement ApprovalHistoryRL;
	
	@FindBy(xpath = "//img[@title='Case History']/../../../..//a")
	public WebElement CaseHistoryRL;
	
	public boolean isContactRoleRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		scroolByPixelValue(0, -1000);
		Thread.sleep(1000);
		//javaScriptClick(ShowAllButton);
		ShowAllButton.click();
		boolean result = ContactRolesRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isCaseTeamRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = CaseTeamRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isCaseCommentsRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = CaseCommentsRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isWorkOrdersRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = WorkOrdersRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isOpenActivitiesRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = OpenActivitiesRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isActivityHistoryRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ActivityHistoryRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isFilesRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = FilesRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isApprovalHistoryRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ApprovalHistoryRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isCaseHistoryRelatedListPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = CaseHistoryRL.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	
	//On the case tab verify the Lightning Page Layout Components
	@FindBy(xpath = "//a[@data-label='Details']")
	public WebElement DetailsTab;
	
	@FindBy(xpath = "//a[@data-label='Feed']")
	public WebElement FeedTab;
	
	@FindBy(xpath = "//h2[contains(@id,'rlql-headerLabel')]")
	public WebElement RelatedListQuickLinksTab;
	
	@FindBy(xpath = "//a[normalize-space(text())='Contact Details']")
	public WebElement ContactDetailsTab;
	
	@FindBy(xpath = "//a[@title='Most Recent Activity']")
	public WebElement ActivityTab;
	
	@FindBy(xpath = "//a[@data-label='Knowledge']")
	public WebElement KnowledgeTab;
	
	@FindBy(xpath = "//button[normalize-space(text())='Edit']")
	public WebElement EditButton;
	
	@FindBy(xpath = "//button[normalize-space(text())='Create New Work Order']")
	public WebElement CreateWorkOrderButton;
	
	@FindBy(xpath = "//button[contains(@class,'slds-button slds-button_icon-border-filled')]//lightning-primitive-icon[1]")
	public WebElement DownArowButton;
	
	@FindBy(xpath = "//div[@part='overlay dropdown']//span[text()='Clone']")
	public WebElement CloneButton;
	
	@FindBy(xpath = "//div[@part='overlay dropdown']//span[text()='View Case Hierarchy']")
	public WebElement ViewCaseHierarchyButton;
	
	@FindBy(xpath = "//div[@part='overlay dropdown']//span[text()='Change Owner']")
	public WebElement ChangeOwnerButton;
	
	@FindBy(xpath = "//div[@part='overlay dropdown']//span[text()='Merge Cases']")
	public WebElement MergeCasesButton;
	
	@FindBy(xpath = "//div[@part='overlay dropdown']//span[text()='Printable View']")
	public WebElement PrintableViewButton;
	
	
	public boolean isDetailsTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = DetailsTab.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isFeedTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = FeedTab.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isRelatedListQuickLinksTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = RelatedListQuickLinksTab.isEnabled();
		Thread.sleep(1000);
		return result;
	}
	
	public boolean isContactDetailsTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ContactDetailsTab.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	      
	public boolean isActivityTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ActivityTab.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isKnowledgeTabPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		scroolByPixelValue(0,1000);
		Thread.sleep(3000);
		boolean result = KnowledgeTab.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isEditButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = EditButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isCreateWorkOrderButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = CreateWorkOrderButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isCloneButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		DownArowButton.click();
		boolean result = CloneButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isViewCaseHierarchyButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ViewCaseHierarchyButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isChangeOwnerButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = ChangeOwnerButton.isEnabled();
		Thread.sleep(1000);
		return result;  
	} 
	
	public boolean isMergeCaseButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = MergeCasesButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	
	public boolean isPrientableButtonPresent() throws InterruptedException {
		Thread.sleep(0, 1000);
		boolean result = PrintableViewButton.isEnabled();
		Thread.sleep(1000);
		return result;
	} 
	     
	     
	     
	     
	

}
        