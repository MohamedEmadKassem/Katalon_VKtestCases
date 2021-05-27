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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('FindGroup/Page_Welcome  VK/input_m.vk.com_email'), '+905453221338')

WebUI.setEncryptedText(findTestObject('FindGroup/Page_Welcome  VK/input_m.vk.com_pass'), 'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.click(findTestObject('FindGroup/Page_Welcome  VK/button_Sign in'))

WebUI.click(findTestObject('FindGroup/Page_Haberler/span_Topluluk'))

WebUI.click(findTestObject('FindGroup/Page_Mohamed Kassem topluluklar/input_Topluluk olutur_groups_list_search'))

WebUI.setText(findTestObject('FindGroup/Page_Mohamed Kassem topluluklar/input_Topluluk olutur_groups_list_search'), 'zenit')

WebUI.click(findTestObject('FindGroup/Page_Mohamed Kassem topluluklar/button_Topluluk olutur_ui_search_button_search _ui_search_button_search'))

