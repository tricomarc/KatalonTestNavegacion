import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://demo.oneapp.cl/admin/')

WebUI.maximizeWindow()

def response = WS.sendRequest(findTestObject('Comun/login' /*Hace llamado objeto login*/ ))

WS.verifyResponseStatusCode(response, 200 /* Verifica que las respuesta del servidor sea 200*/ )

WebUI.setText(findTestObject('Comun/userName'), 'admin' /*Inserta valor en campo Administrador Usuario*/ )

WebUI.setText(findTestObject('Comun/passAdmin'), 'andain5546' /*Inserta valor en campo AdministradorClave*/ )

WebUI.click(findTestObject('Comun/btnLogin'))

WebUI.focus(findTestObject('Comunicados/menuComunicados'))

WebUI.click(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/resumen'))

WS.sendRequest(findTestObject('Visapp/getResumen'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/menuCampania'))

WebUI.click(findTestObject('Visapp/listaCampania'))

WS.sendRequest(findTestObject('Visapp/getListaCampania'))

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuCampania'))

WebUI.click(findTestObject('Visapp/agregarCampania'))

WS.sendRequest(findTestObject('Visapp/getAgregarCampania'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/calificaciones'))

WS.sendRequest(findTestObject('Visapp/getCalificaciones'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/ranking'))

WS.sendRequest(findTestObject('Visapp/getRanking'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/menuFotos'))

WebUI.click(findTestObject('Visapp/exportarFotos'))

WS.sendRequest(findTestObject('Visapp/getExportarFotos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuFotos'))

WebUI.click(findTestObject('Visapp/exportarFotosDetallado'))

WS.sendRequest(findTestObject('Visapp/getExportarFotosDetallado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/historico'))

WS.sendRequest(findTestObject('Visapp/getHistorico'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/menuNoImplementado'))

WebUI.click(findTestObject('Visapp/resumenNoImplementado'))

WebUI.click(findTestObject('Visapp/btnAlertaNoImp')) /*Click en alerta*/

WS.sendRequest(findTestObject('Visapp/getResumenNoImplementado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('VIsapp/menuNoImplementado'))

WebUI.click(findTestObject('Visapp/reportesNoImplementado'))

WS.sendRequest(findTestObject('Visapp/getReporteNoImp'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuNoImplementado'))

WebUI.click(findTestObject('Visapp/listadoCausas'))

WS.sendRequest(findTestObject('Visapp/getListadoCausas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/areaDepartamento'))

WS.sendRequest(findTestObject('Visapp/getAreaDepartamento'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/categoria'))

WS.sendRequest(findTestObject('Visapp/getCategoria'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/clusterSucursales'))

WS.sendRequest(findTestObject('Visapp/getClusterSucursales'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/criterioEvaluacion'))

WS.sendRequest(findTestObject('Visapp/getCriterioEvaluacion'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/estados'))

WS.sendRequest(findTestObject('Visapp/getEstado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/proveedores'))

WS.sendRequest(findTestObject('Visapp/getProveedores'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/motivosNoImp'))

WS.sendRequest(findTestObject('Visapp/getMotivosNoImp'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/clases'))

WS.sendRequest(findTestObject('Visapp/getClases'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuParametros'))

WebUI.click(findTestObject('Visapp/productos'))

WS.sendRequest(findTestObject('Visapp/getProductos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/informeCriterios'))

WS.sendRequest(findTestObject('Visapp/getInformeCriterios'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/noMontado'))

WS.sendRequest(findTestObject('Visapp/getNoMontado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/esperaAprobacion'))

WS.sendRequest(findTestObject('Visapp/getEsperaAprobacion'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/cumple'))

WS.sendRequest(findTestObject('Visapp/getCumple'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/enRevision'))

WS.sendRequest(findTestObject('Visapp/getEnRevision'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/enCorreccion'))

WS.sendRequest(findTestObject('Visapp/getEnCorreccion'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/observaciones'))

WS.sendRequest(findTestObject('Visapp/getObservaciones'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/caducado'))

WS.sendRequest(findTestObject('Visapp/getCaducado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/noReportado'))

WS.sendRequest(findTestObject('Visapp/getNoReportado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.focus(findTestObject('Visapp/menuReportes'))

WebUI.click(findTestObject('Visapp/noReportado'))

WS.sendRequest(findTestObject('Visapp/getNoReportado'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/noLeidos'))

WS.sendRequest(findTestObject('Visapp/getNoLeidos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Visapp/menuVisapp'))

WebUI.click(findTestObject('Visapp/porcentajeImplementacion'))

WS.sendRequest(findTestObject('Visapp/getPorcentajeImplementacion'))

WebUI.closeBrowser();
