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

WebUI.click(findTestObject('Comunicados/menuComunicados'))

WebUI.click(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.click(findTestObject('ControlAcceso/dashboard'))

WS.sendRequest(findTestObject('ControlAcceso/getDashboard'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.click(findTestObject('ControlAcceso/dotacion'))

WS.sendRequest(findTestObject('ControlAcceso/getDotaciones'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.click(findTestObject('ControlAcceso/sinDotaciones'))

WS.sendRequest(findTestObject('ControlAcceso/getSinDotaciones'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.click(findTestObject('ControlAcceso/bloqueos'))

WS.sendRequest(findTestObject('ControlAcceso/getBloqueos'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.click(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/marca'))

WS.sendRequest(findTestObject('ControlAcceso/getMarca'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/estados'))

WS.sendRequest(findTestObject('ControlAcceso/getEstados'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/departamentos'))

WS.sendRequest(findTestObject('ControlAcceso/getDepartamentos'))


WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/divisiones'))

WS.sendRequest(findTestObject('ControlAcceso/getDivisiones'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/motivoBloqueo'))

WS.sendRequest(findTestObject('ControlAcceso/getMotivoBloqueo'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/motivoES'))

WS.sendRequest(findTestObject('ControlAcceso/getMotivoES'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/mutuales'))

WS.sendRequest(findTestObject('ControlAcceso/getMutuales'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/documentos'))

WS.sendRequest(findTestObject('ControlAcceso/getDocumentos'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/asignarDepartamentos'))

WS.sendRequest(findTestObject('ControlAcceso/getAsignarAreas'))

WebUI.focus(findTestObject('ControlAcceso/menuControlAcceso'))

WebUI.focus(findTestObject('ControlAcceso/subMenuMantenedores'))

WebUI.click(findTestObject('ControlAcceso/asignarMarcas'))

WS.sendRequest(findTestObject('ControlAcceso/getAsignarMarcas'))

WebUI.closeBrowser();