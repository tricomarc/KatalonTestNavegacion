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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://demo.oneapp.cl/admin/')

WebUI.maximizeWindow()

def response = WS.sendRequest(findTestObject('Comun/login' /*Hace llamado objeto login*/ ))

WS.verifyResponseStatusCode(response, 200 /* Verifica que las respuesta del servidor sea 200*/ )

WebUI.setText(findTestObject('Comun/userName'), 'admin' /*Inserta valor en campo Administrador Usuario*/ )

WebUI.setText(findTestObject('Comun/passAdmin'), 'andain5546' /*Inserta valor en campo AdministradorClave*/ )

WebUI.click(findTestObject('Comun/btnLogin'))

WebUI.focus(findTestObject('Comunicados/menuComunicados'))

WebUI.click(findTestObject('Notificaciones/menuNotificacion'))

WebUI.click(findTestObject('Notificaciones/agregarNotificacion'))

WebUI.focus(findTestObject('Notificaciones/menuNotificacion'))

WebUI.click(findTestObject('Notificaciones/listaNotificaciones'))

WS.sendRequest(findTestObject('Notificaciones/getListadoNotificaciones'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Notificaciones/menuNotificacion'))

WebUI.click(findTestObject('Notificaciones/notificacionPush'))

WS.sendRequest(findTestObject('Notificaciones/getNotificacionPush'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Notificaciones/menuNotificacion'))

WebUI.click(findTestObject('Notificaciones/listadoEnlaces'))

WS.sendRequest(findTestObject('Notificaciones/getListadoEnlaces'))

WS.verifyResponseStatusCode(response, 200)

WebUI.closeBrowser();