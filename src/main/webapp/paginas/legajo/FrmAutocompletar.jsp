<!DOCTYPE html>

<html>
<head>
<title>Basic usage</title>
<meta charset="utf-8">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/content/shared/styles/examples-offline.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.common.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.rtl.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.default.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.dataviz.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.dataviz.default.min.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resources/kendoui/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/kendoui/js/jszip.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/kendoui/js/kendo.all.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/kendoui/content/shared/js/console.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/utilitario/Utilitario.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/viewmodel/Persona.js"></script>
</head>
<body>



	<div id="exampleAutocompletar">
		<div class="demo-section k-content">
			<h4>Seleccionar Departamentos</h4>
			<input id="departamentos" style="width: 100%;" />

		</div>
		<div id="grid"></div>

		<script>
			$(document)
					.ready(
							function() {

								$("#departamentos")
										.kendoAutoComplete(
												{
													dataTextField : "nombre",
													minLength : 2,
													select : seleccionado,

													dataSource : cargarLista("/listarDepartamento")

												});
								function seleccionado(context) {
									var departamento = this
											.dataItem(context.item.index());
									//alert(departamento.idDepartamento);
									$("#grid")
											.kendoGrid(
													{
														sortable : true,
														groupable : true,
														scrollable : true,
														dataSource : {
															transport : {
																read : {																	
																	url : "http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado/cargarProvincia",
																	data : {
																		idDepartamento : departamento.idDepartamento
																	},
																	dataType : "json",
																	type : "POST",
																	contentType : "application/json"
																},
																parameterMap : function(
																		data) {
																	return JSON
																			.stringify(data);

																}
															},
															pageSize : 2
														},
														height : 100,
														filterable : true,
														sortable : true,
														pageable : true,
														columns : [
																{
																	field : "idProvincia",
																	title : "Codigo",
																	filterable : false
																},
																{
																	field : "nombre",
																	title : "Provincia"

																} ]
													});

								}

							});
		</script>




	</div>



</body>
</html>
