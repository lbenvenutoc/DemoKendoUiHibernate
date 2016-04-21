<!DOCTYPE html>
<html>
<head>
<title>Binding to remote data</title>
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
<script>
	
</script>


</head>
<body>




	<div id="example">
		<div id="grid"></div>
		<script>
			$(document)
					.ready(
							function() {
								var crudServiceBaseUrl = "http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado", dataSource = new kendo.data.DataSource(
										{
											transport : {
												read : {
													url : crudServiceBaseUrl
															+ "/listarTodoEmpleado",
													dataType : "json",
													type : "POST",
													contentType : "application/json"
												},
												update : {
													url : crudServiceBaseUrl
															+ "/actualizarEmpleado",
													dataType : "json",
													type : "POST",
													contentType : "application/json"
												},
												create : {
													url : crudServiceBaseUrl
															+ "/insertarEmpleado",
													dataType : "json",
													type : "POST",
													contentType : "application/json"
												},
												destroy : {
													url : crudServiceBaseUrl
															+ "/eliminarEmpleado",
													dataType : "json",
													type : "POST",
													contentType : "application/json"
												},
												parameterMap : function(
														options, operation) {
													return JSON
															.stringify(options);

												}

											},
											pageSize : 5,
											schema : {
												model : {
													id : "idEmpleado",
													fields : {
														idEmpleado : {
															editable : false,
															nullable : true
														},
														apellidoPaterno : {
															type : "string",
															validation : {
																required : true
															}
														},
														apellidoMaterno : {
															type : "string",
															validation : {
																required : true
															}
														},
														nombre : {
															type : "string",
															validation : {
																min : 0,
																required : true
															}
														}
													}
												}
											}
										});

								$("#grid").kendoGrid({
									dataSource : dataSource,
									pageable : true,
									height : 550,
									toolbar : [ "create" ],
									columns : [ {
										field : "idEmpleado",
										title : "Codigo",
										filterable : false
									}, {
										field : "apellidoPaterno",
										title : "Apellido Paterno"

									}, {
										field : "apellidoMaterno",
										title : "Apellido Materno"
									}, {
										field : "nombre",
										title : "Nombres"
									}, {
										command : [ "edit", "destroy" ],
										title : "&nbsp;",
										width : "250px"
									} ],
									editable : "popup"
								});
							});
		</script>
	</div>



</body>
</html>
