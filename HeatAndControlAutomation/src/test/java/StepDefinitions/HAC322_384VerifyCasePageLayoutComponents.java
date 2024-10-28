package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import PageObjects.CaseDetailsTab;
import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcomponents.BaseTest;

public class HAC322_384VerifyCasePageLayoutComponents extends BaseTest {

	@Given("HAC322 user enters {string} and {string}")
	public void HAC322_user_enters_and(String userName, String password) throws IOException {
	  
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (userName, password); 
	  
	}

	@When("HAC322 select the applicaton")
	public void HAC322_select_the_applicaton() throws InterruptedException, IOException {
		SelectApplication selectApplication = new SelectApplication(driver);
		  selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	  
	}

	@When("HAC322 close all the open tabs")
	public void HAC322_close_all_the_open_tabs() throws InterruptedException {
	  
		closeAllTabs(); 
	}

	@When("HAC322 close the bottom bar")
	public void HAC322_close_the_bottom_bar() throws InterruptedException {
	  closeBottomeBar();
	  
	}

	@When("HAC322 user is on exsiting case record")
	public void HAC322_user_is_on_exsiting_case_record() throws InterruptedException {
	  GlobalSearch global = new GlobalSearch(driver);
	  global.selectcasefromglobalsearch("00001641");
	  
	}

	@Then("HAC322 verify case owner field")
	public void HAC322_verify_case_owner_field() throws InterruptedException {
	  
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCaseOwnerFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify account name field")
	public void HAC322_verify_account_name_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isAccountNameFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify contact name field")
	public void HAC322_verify_contact_name_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isContactNameFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify status field")
	public void HAC322_verify_status_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isStatusFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify priority field")
	public void HAC322_verify_priority_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isPriorityFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify contact phone field")
	public void HAC322_verify_contact_phone_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isContactPhoneFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify contact email field")
	public void HAC322_verify_contact_email_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isContactEmailFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify case origin field")
	public void HAC322_verify_case_origin_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCaseOriginFieldPresent();
		assertTrue(result);
	}

	@Then("HAC322 verify type field")
	public void HAC322_verify_type_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isTypeFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify subject field")
	public void HAC322_verify_subject_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isSubjecteFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify description field")
	public void HAC322_verify_description_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isDescriptionFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify internal comments field")
	public void HAC322_verify_internal_comments_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isInternalCommentsFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify created by field")
	public void HAC322_verify_created_by_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCreatedByFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify last modified by field")
	public void HAC322_verify_last_modified_by_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isLastModifiedByFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify web email field")
	public void HAC322_verify_web_email_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isWebEmailFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify web name field")
	public void HAC322_verify_web_name_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isWebNameFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify web company field")
	public void HAC322_verify_web_company_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isWebCompanyFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify web phone field")
	public void HAC322_verify_web_phone_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isWebPhoneFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify date\\/time opened field")
	public void HAC322_verify_date_time_opened_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isDateAndTimeOpenedFieldPresent();
		assertTrue(result);
	  
	}

	@Then("HAC322 verify date\\/time closed field")
	public void HAC322_verify_date_time_closed_field() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isDateAndTimeClosedFieldPresent();
		assertTrue(result);
	}
	
	@Then("HAC322 verify contact roles")
	public void HAC322_verify_contact_roles() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isContactRoleRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify case team")
	public void HAC322_verify_case_team() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCaseTeamRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify case comments")
	public void HAC322_verify_case_comments() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCaseCommentsRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify work orders")
	public void HAC322_verify_work_orders() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isWorkOrdersRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify open activities")
	public void HAC322_verify_open_activities() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isOpenActivitiesRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify activitiy history")
	public void HAC322_verify_activitiy_history() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isActivityHistoryRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify fiels")
	public void HAC322_verify_fiels() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isFilesRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify approval history")
	public void HAC322_verify_approval_history() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isApprovalHistoryRelatedListPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify case history")
	public void HAC322_verify_case_history() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCaseHistoryRelatedListPresent();
		assertTrue(result);
	   
	}
	
	@Then("HAC322 verify Details Tab")
	public void HAC322_verify_details_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isDetailsTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Feed Tab")
	public void HAC322_verify_feed_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isFeedTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Related List Quick Links Tab")
	public void HAC322_verify_related_list_quick_links_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isRelatedListQuickLinksTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Contact Details Tab")
	public void HAC322_verify_contact_details_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isContactDetailsTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Activity Panel Tab")
	public void HAC322_verify_activity_panel_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isActivityTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Related Knowlwdge Tab")
	public void HAC322_verify_related_knowlwdge_tab() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isKnowledgeTabPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Edit button")
	public void HAC322_verify_edit_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isEditButtonPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Create Work Order button")
	public void HAC322_verify_create_work_order_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCreateWorkOrderButtonPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify clone button")
	public void HAC322_verify_clone_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isCloneButtonPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify View Case Hierarchy button")
	public void HAC322_verify_view_case_hierarchy_button() throws InterruptedException {
	   
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isViewCaseHierarchyButtonPresent();
		assertTrue(result);
	}

	@Then("HAC322 verify change Owner button")
	public void HAC322_verify_change_owner_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isChangeOwnerButtonPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Merge Cases button")
	public void HAC322_verify_merge_cases_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isMergeCaseButtonPresent();
		assertTrue(result);
	   
	}

	@Then("HAC322 verify Printable View button")
	public void HAC322_verify_printable_view_button() throws InterruptedException {
		CaseDetailsTab CaseDetailsTab = new CaseDetailsTab(driver);
		boolean result = CaseDetailsTab.isPrientableButtonPresent();
		assertTrue(result);
	   
	}

	
}
