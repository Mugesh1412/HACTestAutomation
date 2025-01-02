package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class HomePage extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;
	WebElement caseorigin;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"));
		Thread.sleep(0, 3000);
		webele = driver.findElement(By.xpath("//a[@title='Cases']"));
		js.executeScript("arguments[0].click();", webele);
		Thread.sleep(0, 3000);
	}


	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"));                                                       
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//a//div[text()='New']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).sendKeys(contname);
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		Thread.sleep(0, 3000);
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 5000);

		driver.findElement(By.xpath("//*[@field-label='Type']//button[@aria-label='Type']")).click();   
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Billing']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//span[@title='Billing Dispute']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//button[@title='Move to Chosen']")).click();
		Thread.sleep(0, 3000);

		caseorigin = driver.findElement(By.xpath("(//button[@aria-label='Case Origin'])"));
		js.executeScript("arguments[0].click();", caseorigin);

		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Email']")).click();
		Thread.sleep(0, 4000);

		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).sendKeys(sub);

		driver.findElement(By.xpath("//label[text()='Description']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(0, 5000);
		waitForElementToAppear(By.xpath("//a[text()='Details']"));
		Thread.sleep(0, 2000);
	}


	public void clickNewButtonOnCaseTab() throws InterruptedException {
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//a//div[text()='New']")).click();
	}
	
	
	@FindBy(xpath = "//label[contains(.,'*Type')]/..//button")
	public WebElement TypeButton;
	
	@FindBy(xpath = "//span[@title='Billing']")
	public WebElement billingType;
	
	@FindBy(xpath = "//span[@title='Emergency']")
	public WebElement emergencyType;
	
	@FindBy(xpath = "//span[@title='Equipment']")
	public WebElement equipmentType;
	
	@FindBy(xpath = "//span[@title='Feedback']")
	public WebElement feedbackType;
	
	@FindBy(xpath = "//span[@title='General']")
	public WebElement generalType;
	
	@FindBy(xpath = "//span[@title='Junk/Spam']")
	public WebElement junkOrspamType;
	
	@FindBy(xpath = "//span[@title='New Project Scheduling']")
	public WebElement newProjectSchedulingType;
	
	@FindBy(xpath = "//span[@title='Parts']")
	public WebElement partsType;
	
	@FindBy(xpath = "//span[@title='Sales']")
	public WebElement salesType;
	
	@FindBy(xpath = "//span[@title='Scheduling']")
	public WebElement SchedulingType;
	
	@FindBy(xpath = "//span[@title='Training']")
	public WebElement TrainingType;
	
	public boolean verifyCaseTypes() {
		javaScriptClick(TypeButton);
		boolean billing = billingType.isEnabled();
		boolean emergency = emergencyType.isEnabled();
		boolean equipment = equipmentType.isEnabled();
		boolean feedback = feedbackType.isEnabled();
		boolean general = generalType.isEnabled();
		boolean junkOrspam = junkOrspamType.isEnabled();
		boolean newProjectScheduling = newProjectSchedulingType.isEnabled();
		boolean parts = partsType.isEnabled();
		boolean sales = salesType.isEnabled();
		boolean Scheduling = SchedulingType.isEnabled();
		boolean Training = TrainingType.isEnabled();
		return billing && emergency && equipment && feedback && general && junkOrspam && newProjectScheduling && parts && sales && Scheduling && Training;

		
	}
	
	@FindBy(xpath = "//span[@title='Billing Dispute']")
	public WebElement billingDisputeSubType;
	
	@FindBy(xpath = "//span[@title='Credit Application']")
	public WebElement CreditApplicationSubType;
	
	@FindBy(xpath = "//span[@title='Request for Backup Support']")
	public WebElement RequestforBackupSupportSubType;
	
	@FindBy(xpath = "//span[@title='Request for Invoice']")
	public WebElement RequestforInvoiceSubType;
	
	@FindBy(xpath = "//span[@title='Other']")
	public WebElement OtherSubType;
	
	
	
	public boolean verifybillingSupTyps() throws InterruptedException {
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		javaScriptClick(billingType);
		//billingType.click();
		Thread.sleep(2000);
		boolean billingDispute=billingDisputeSubType.isEnabled();
		boolean CreditApplication = CreditApplicationSubType.isEnabled();
		boolean RequestforBackupSupport = RequestforBackupSupportSubType.isEnabled();
		boolean RequestforInvoice = RequestforInvoiceSubType.isEnabled();
		boolean Other = OtherSubType.isEnabled();
		return billingDispute && CreditApplication && RequestforBackupSupport && RequestforInvoice && Other;
		
		
	}
	
	@FindBy(xpath = "//span[@title='Fire']")
	public WebElement FireSubType;
	
	@FindBy(xpath = "//span[@title='Injury']")
	public WebElement injurySubType;
	
	@FindBy(xpath = "//span[@title='Safety Issue']")
	public WebElement safetyIssueSubType;
	
	public boolean verifyEmergencySubTyps() throws InterruptedException {
		
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		emergencyType.click();
		Thread.sleep(2000);
		boolean Fire = FireSubType.isEnabled();
		boolean injury = injurySubType.isEnabled();
		boolean safetyIssue = safetyIssueSubType.isEnabled();
		return Fire && injury && safetyIssue;
		
	}
	
	@FindBy(xpath = "//span[@title='Information']")
	public WebElement informationsubType;
	
	@FindBy(xpath = "//span[@title='Safety Issue']")
	public WebElement EquipmentsafetyIssueSubType;
	
	@FindBy(xpath = "//span[@title='Troubleshooting']")
	public WebElement troubleshootingSubType;
	
	@FindBy(xpath = "//span[@title='Other']")
	public WebElement EquipmentOtherSubType;
	
	public boolean verifyEquipmentSubTyps() throws InterruptedException {
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		equipmentType.click();
		Thread.sleep(2000);
		boolean information = informationsubType.isEnabled();
		boolean EquipmentsafetyIssue = EquipmentsafetyIssueSubType.isEnabled();
		boolean troubleshooting = troubleshootingSubType.isEnabled();
		boolean EquipmentOther = EquipmentOtherSubType.isEnabled();
		return information && EquipmentsafetyIssue && troubleshooting && EquipmentOther ;
		
	}
	
	@FindBy(xpath = "//span[@title='Customer Service']")
	public WebElement CustomerServiceSubType;
	
	@FindBy(xpath = "//span[@title='Equipment']")
	public WebElement EquipmentSubType;
	
	@FindBy(xpath = "//span[@title='Feature Requests']")
	public WebElement FeatureRequestsSubType;
	
	@FindBy(xpath = "//span[@title='New Equipment']")
	public WebElement NewEquipmentSubType;
	
	@FindBy(xpath = "//span[@title='Other']")
	public WebElement FeedbackOtherSubType;
	
	public boolean verifyFeedbackSubTyps() throws InterruptedException {
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		feedbackType.click();
		Thread.sleep(2000);
		boolean CustomerService = CustomerServiceSubType.isEnabled();
		boolean Equipment = EquipmentSubType.isEnabled();
		boolean FeatureRequests = FeatureRequestsSubType.isEnabled();
		boolean NewEquipment = NewEquipmentSubType.isEnabled();
		boolean FeedbackOther = FeedbackOtherSubType.isEnabled();
		return CustomerService && Equipment && FeatureRequests && NewEquipment && FeedbackOther ;
		
	}
	
	@FindBy(xpath = "//span[@title='C&I']")
	public WebElement CandISubType;
	
	@FindBy(xpath = "//span[@title='Commissioning']")
	public WebElement CommissioningSubType;
	
	@FindBy(xpath = "//span[@title='Controls']")
	public WebElement controlsSubtype;
	
	@FindBy(xpath = "//span[@title='Courtesy Visit']")
	public WebElement CourtesyVisitSubType;
	
	@FindBy(xpath = "//span[@title='Demo / Customer Testing']")
	public WebElement DemoOrCustomerTestingSubType;
	
	@FindBy(xpath = "//span[@title='FAT']")
	public WebElement FATSubType;
	
	@FindBy(xpath = "//span[@title='Installation']")
	public WebElement InstallationSubType;
	
	@FindBy(xpath = "//span[@title='Installation Supervision']")
	public WebElement InstallationSupervisionSubType;
	
	@FindBy(xpath = "//span[@title='PDI']")
	public WebElement PDISubType;
	
	@FindBy(xpath = "//span[@title='Punch List']")
	public WebElement PunchListSubType;
	
	@FindBy(xpath = "//span[@title='SAT']")
	public WebElement SATSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Training']")
	public WebElement TrainingSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Warranty']")
	public WebElement WarrantySubType;
	
	public boolean verifynewProjectSchedulingSubTyps() throws InterruptedException {
		
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		newProjectSchedulingType.click();
		Thread.sleep(2000);
		boolean CandI = CandISubType.isEnabled();
		boolean Commissioning = CommissioningSubType.isEnabled();
		boolean controls = controlsSubtype.isEnabled();
		boolean CourtesyVisit = CourtesyVisitSubType.isEnabled();
		boolean DemoOrCustomerTesting = DemoOrCustomerTestingSubType.isEnabled();
		boolean FAT = FATSubType.isEnabled();
		boolean Installation = InstallationSubType.isEnabled();
		boolean InstallationSupervision = InstallationSupervisionSubType.isEnabled();
		boolean PDI = PDISubType.isEnabled();
		boolean PunchList = PunchListSubType.isEnabled();
		boolean SAT = SATSubType.isEnabled();
		boolean Training = TrainingSubType.isEnabled();
		boolean Warranty = WarrantySubType.isEnabled();
		return CandI && Commissioning && controls && CourtesyVisit && DemoOrCustomerTesting && FAT && Installation && InstallationSupervision && PDI && PunchList && SAT && Training && Warranty ;
		
	}
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Order Status']")
	public WebElement OrderStatussubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Parts Manual']")
	public WebElement PartsManualSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Quotes and Orders']")
	public WebElement QuotesandOrdersSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Recommended Parts List']")
	public WebElement RecommendedPartsListSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Other']")
	public WebElement PartsOtherSubType;
	
	public boolean verifypartsSubTypes() throws InterruptedException {
		
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		javaScriptClick(partsType);
		//partsType.click();
		Thread.sleep(2000);
		boolean OrderStatus = OrderStatussubType.isEnabled();
		boolean PartsManual = PartsManualSubType.isEnabled();
		boolean QuotesandOrders = QuotesandOrdersSubType.isEnabled();
		boolean RecommendedPartsList = RecommendedPartsListSubType.isEnabled();
		boolean PartsOther = PartsOtherSubType.isEnabled();
		return OrderStatus && PartsManual && QuotesandOrders && RecommendedPartsList && PartsOther;
		
	}
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Assessment']")
	public WebElement AssessmentSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Calibration']")
	public WebElement CalibrationSubtype;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Courtesy Visit']")
	public WebElement SchedulingCourtesyVisitSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Demo / Customer Testing']")
	public WebElement SchedulingDemoandCustomerTestingSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Estimate for Visit']")
	public WebElement EstimateforVisitSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='In-House Checkout']")
	public WebElement InHouseCheckoutSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Preventative Maintenance']")
	public WebElement PreventativeMaintenanceSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Repair']")
	public WebElement RepairSubtype;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Trade Show']")
	public WebElement TradeShowSubtype;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Training']")
	public WebElement SchedulingTrainingSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Other']")
	public WebElement SchedulingOtherSubType;
	
	public boolean verifySchedulingSubTyps() throws InterruptedException {
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		javaScriptClick(SchedulingType);
		//SchedulingType.click();
		Thread.sleep(2000);
		boolean Assessment = AssessmentSubType.isEnabled();
		boolean Calibration = CalibrationSubtype.isEnabled();
		boolean SchedulingCourtesyVisit = SchedulingCourtesyVisitSubType.isEnabled();
		boolean SchedulingDemoandCustomerTesting = SchedulingDemoandCustomerTestingSubType.isEnabled();
		boolean EstimateforVisit = EstimateforVisitSubType.isEnabled();
		boolean InHouseCheckout = InHouseCheckoutSubType.isEnabled();
		boolean PreventativeMaintenance = PreventativeMaintenanceSubType.isEnabled();
		boolean Repair = RepairSubtype.isEnabled();
		boolean TradeShow = TradeShowSubtype.isEnabled();
		boolean SchedulingTraining = SchedulingTrainingSubType.isEnabled();
		boolean SchedulingOther = SchedulingOtherSubType.isEnabled();
		return Assessment && Calibration && SchedulingCourtesyVisit && SchedulingDemoandCustomerTesting && EstimateforVisit && InHouseCheckout && PreventativeMaintenance && Repair && TradeShow && SchedulingTraining && SchedulingOther ;
		
	}
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Customized Training Plan']")
	public WebElement CustomizedTrainingPlanSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='Equipment']")
	public WebElement TrainingEquipmentSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='General']")
	public WebElement TrainingGeneralSubType;
	
	@FindBy(xpath = "//span[text()='Available']/..//span[text()='myTraining']")
	public WebElement myTrainingSubType;
	
	public boolean verifyTrainingSubTypes() throws InterruptedException {
		javaScriptClick(TypeButton);
		Thread.sleep(2000);
		javaScriptClick(TrainingType);
		//TrainingType.click();
		Thread.sleep(2000);
		boolean CustomizedTrainingPlan = CustomizedTrainingPlanSubType.isEnabled();
		boolean TrainingEquipment = TrainingEquipmentSubType.isEnabled();
		boolean TrainingGeneral = TrainingGeneralSubType.isEnabled();
		boolean myTraining = myTrainingSubType.isEnabled();
		return CustomizedTrainingPlan && TrainingEquipment && TrainingGeneral && myTraining ;
		
	}
	
	public boolean verifyAllSubTypes() throws InterruptedException {
		
		boolean billingSupTyps = verifybillingSupTyps();
		boolean EmergencySubTyps = verifyEmergencySubTyps();
		boolean EquipmentSubTypes = verifyEquipmentSubTyps();
		boolean FeedbackSubTyps = verifyFeedbackSubTyps();
		boolean newProjectSchedulingSubTyps = verifynewProjectSchedulingSubTyps();
		boolean partsSubTypes = verifypartsSubTypes();
		boolean SchedulingSubTyps = verifySchedulingSubTyps();
		boolean TrainingSubTypes = verifyTrainingSubTypes();
		return billingSupTyps && EmergencySubTyps && EquipmentSubTypes && FeedbackSubTyps && newProjectSchedulingSubTyps && partsSubTypes && SchedulingSubTyps && TrainingSubTypes ;
	}
	
	

	public void ClickcOnAccountTab() throws InterruptedException {

		Thread.sleep(0, 2000);
		WebElement AccountTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		javaScriptClick(AccountTab);
		Thread.sleep(2000);
	}

	public void createNewCustomerAccount(String Accountname, String Industry, String Address, String RegionalSetting)
			throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// NewButton.click();
		// NextButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).sendKeys(Accountname);
		// AccountnameInput.sendKeys(Accountname);
		WebElement industryWebelement = driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='" + Industry + "']"));
		javaScriptClick(industryWebelement);
		WebElement MoveSelectionToChosenButton = driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		javaScriptClick(MoveSelectionToChosenButton);

		driver.findElement(By.xpath("//label[text()='Regional Settings']/..//input")).click();
		driver.findElement(By.xpath("//span[@title='"+ RegionalSetting +"']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("(//legend[text()='Shipping Address']/..//input)[1]")).sendKeys(Address);
		//driver.findElement(By.xpath("//lightning-base-combobox-formatted-text")).click();
		// AddressSearchButton.sendKeys(Address);
		// selectAddress.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//li[3]")).click();
		// SaveButton.click();

	}


	public String verifyRegionalSettingRecordValue() throws InterruptedException {
		Thread.sleep(10000);
		scroolByPixelValue(0, 200);
		Thread.sleep(1000);
		String regionalValue = driver.findElement(By.xpath("//dt[contains(.,'Regional Settings')]/..//dd")).getText();
		return regionalValue;
	}

	public boolean verifyBillingAddressOnTheAccount() throws InterruptedException {

		Thread.sleep(10000);
		scroolByPixelValue(0, 600);
		Thread.sleep(1000);
		String BillingAddress = driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).getText();
		String shippingAddress = driver.findElement(By.xpath("//span[text()='Shipping Address']/../../..//a"))
				.getText();
		String formattedbillingaddress = BillingAddress.replace("\n", "").trim();
		String formattedshippingaddress = shippingAddress.replace("\n", "").trim();
		if (formattedshippingaddress.contains(formattedbillingaddress)) {
			return true;
		} else {
			return false;
		}

	}

	public void VerifyAbilityToSelectMultipleIndustriesValueOnTheAccount(String Accountname, String Industry1,String Industry2) throws InterruptedException, AWTException {



		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[text()='New']")).click(); 
		driver.findElement(By.xpath("//span[text()='Next']")).click(); 
		//NewButton.click();// NextButton.click(); 
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//label[text()='Account Name']/..//div")). sendKeys(Accountname); 
		//AccountnameInput.sendKeys(Accountname); 
		Robot robot= new Robot(); 
		WebElement industryWebelement = driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+ Industry1 +"']")); 
		WebElement industryWebelement2 =driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+Industry2 +"']")); 
		WebElement MoveSelectionToChosenButton=driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]")); 
		Thread.sleep(1000); 
		javaScriptClick(industryWebelement); 
		robot.keyPress(KeyEvent.VK_CONTROL);
		javaScriptClick(industryWebelement2); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		Thread.sleep(5000); 
		javaScriptClick(MoveSelectionToChosenButton); 
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//li[3]")).click();
		//SaveButton.click();



		/*
		 * // Click on 'New' button Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[text()='New']")).click();
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * 
		 * // Enter Account Name Thread.sleep(2000);
		 * driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).
		 * sendKeys(Accountname);
		 * 
		 * // Initialize Actions class for multiple selection Actions actions = new
		 * Actions(driver);
		 * 
		 * // First industry element WebElement industryWebElement1 = WebElement
		 * industryWebElement1=driver.findElement(By.xpath(
		 * "//div[text()='Industry']/..//li//span[text()='"+ Industry1 + "']"));
		 * actions.click(industryWebElement1).perform(); Thread.sleep(3000);
		 * 
		 * // Press CTRL key and select the second industry WebElement WebElement
		 * industryWebElement2 =
		 * driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+
		 * Industry2 + "']"));
		 * actions.keyDown(Keys.CONTROL).click(industryWebElement2).keyUp(Keys.CONTROL).
		 * perform(); // Hold CTRL to multi-select Thread.sleep(5000);
		 * 
		 * // Click the 'Move to Chosen' button WebElement moveSelectionToChosenButton =
		 * WebElement moveSelectionToChosenButton =
		 * driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		 * javaScriptClick(moveSelectionToChosenButton);
		 * 
		 * Thread.sleep(2000);   
		 */

	}            
}        
