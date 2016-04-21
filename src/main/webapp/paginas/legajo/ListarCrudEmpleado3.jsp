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


</head>
<body>

	<div id="example">

		<div id="grid" data-role="grid" data-toolbar="['create']"
			data-columns="[ {
										'field' : 'idEmpleado',
										'title' : 'Codigo',
										'filterable' : false
									}, {
										'field' : 'apellidoPaterno',
										'title' : 'Apellido Paterno'

									}, {
										'field' : 'apellidoMaterno',
										'title' : 'Apellido Materno'
									}, {
										'field' : 'nombre',
										'title' : 'Nombres'
									}, {
										'command' : [ 'edit', 'destroy' ],
										'title' : '&nbsp;',
										'width' : '250px'
									} ]"
			data-bind="source: empleados"
			data-editable="popup" data-pageable="true" data-height="550"></div>

	</div>


	
</body>
<script
		src="${pageContext.request.contextPath}/resources/js/viewmodel/EmpledoViewModel.js"></script>
</html>
