import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After as After
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

WebUI.click(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/todasIncidencias'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WS.sendRequest(findTestObject('Incidencia/getIncidencias'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/incidenciasSolicitadas'))

WS.sendRequest(findTestObject('Incidencia/getIncidenciasSolicitadas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/cotizacionSolicitada'))

WS.sendRequest(findTestObject('Incidencia/getCotizacionSolicitada'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/esperaEjecucion'))

WS.sendRequest(findTestObject('Incidencia/getEsperaEjecucion'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/trabajosTerminados'))

WS.sendRequest(findTestObject('Incidencia/getTrabajosTerminados'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/favoritas'))

WS.sendRequest(findTestObject('Incidencia/getFavoritas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.click(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/estadisticas'))

WS.sendRequest(findTestObject('Incidencia/getEstadisticas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/ultimaActividad'))

WS.sendRequest(findTestObject('Incidencia/getUltimaActividad'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/dashboard'))

WS.sendRequest(findTestObject('Incidencia/getDashboard'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/tablaResumen'))

WS.sendRequest(findTestObject('Incidencia/getTablaResumen'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/reportePorArea'))

WS.sendRequest(findTestObject('Incidencia/getReporteArea'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/informe'))

WS.sendRequest(findTestObject('Incidencia/getInforme'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/reporteSla'))

WS.sendRequest(findTestObject('Incidencia/getReporteSla'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/reporteMonto'))

WS.sendRequest(findTestObject('Incidencia/getReporteMonto'))

WebUI.click(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/subMenuReportes'))

WebUI.focus(findTestObject('Incidencia/graficoSeguimiento'))

WebUI.click(findTestObject('Incidencia/graficoSeguimiento'))

WS.sendRequest(findTestObject('Incidencia/getGraficoSeguimiento'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/encuestaSatisfaccion'))

WS.sendRequest(findTestObject('Incidencia/getEncuestaSatisfaccion'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuReportes'))

WebUI.click(findTestObject('Incidencia/diasFestivos'))

WS.sendRequest(findTestObject('Incidencia/getDiasFestivos'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.focus(findTestObject('Incidencia/subMenuIncidencias'))

WebUI.click(findTestObject('Incidencia/estadoPorSucursal'))

WS.sendRequest(findTestObject('Incidencia/getEstadoSucursal'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/supervisores'))

WS.sendRequest(findTestObject('Incidencia/getSupervisores'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/roles'))

WS.sendRequest(findTestObject('Incidencia/getRoles'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/proveedores'))

WS.sendRequest(findTestObject('Incidencia/getProveedores'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/especialidades'))

WS.sendRequest(findTestObject('Incidencia/getEspecialidades'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/areas'))

WS.sendRequest(findTestObject('Incidencia/getAreas'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/prioridades'))

WS.sendRequest(findTestObject('Incidencia/getPrioridades'))

WebUI.focus(findTestObject('Incidencia/menuIncidencias'))

WebUI.click(findTestObject('Incidencia/servicios'))

WS.sendRequest(findTestObject('Incidencia/getServices'))

WebUI.closeBrowser();