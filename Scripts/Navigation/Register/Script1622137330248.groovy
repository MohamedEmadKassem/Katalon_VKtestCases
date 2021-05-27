import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://vk.com/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Register/Page_Welcome  VK/input_Sign up for VK_ij_first_name'), 'mohamed')

WebUI.setText(findTestObject('Object Repository/Register/Page_Welcome  VK/input_Sign up for VK_ij_last_name'), 'kassem')

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/td_'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/div_First time here    Sign up for VK      _53221f'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/td__1'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/div_First time here    Sign up for VK      _53221f_1'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/td__1_2'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/div_First time here    Sign up for VK      _53221f_1_2'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/div_Male'))

WebUI.click(findTestObject('Object Repository/Register/Page_Welcome  VK/button_Continue registration'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Sign up  VK/input_Mobile number_join_phone'), '5656565656')

WebUI.click(findTestObject('Object Repository/Register/Page_Sign up  VK/button_Next'))

WebUI.verifyTextPresent('SMS', false)

