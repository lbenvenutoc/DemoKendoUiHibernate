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
			<h4>Select Country</h4>
			<input id="countries" style="width: 100%;" />

		</div>


		<script>
			$(document).ready(function() {

				$("#countries").kendoAutoComplete({
					dataTextField : "name",
					minLength : 2,
					dataSource : cargarLista("/listCountry")

				});

			});
		</script>




	</div>



</body>
</html>
