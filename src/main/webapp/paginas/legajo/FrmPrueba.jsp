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



	<div id="example">
		<div class="demo-section k-content" data-bind="visible: modeloPersona.confirmed">
			Thank you for your registration, <span data-bind="text: modeloPersona..firstName"></span>
			<span data-bind="text: modeloPersona.lastName"></span> <br /> <br />
			<button data-bind="click: startOver" class="k-button k-primary">Start
				Over</button>
		</div>
		<div class="demo-section k-content wide">
			<div>
				<form>
					<ul id="fieldlist">
						<li><label for="fname">First Name:</label> <input id="fname"
							data-bind="value: modeloPersona.firstName" class="k-textbox" /></li>
						<li><label for="lname">Last Name:</label> <input id="lname"
							data-bind="value: modeloPersona.lastName" class="k-textbox" /></li>
						<li><label for="gender">Gender:</label> <select id="gender"
							data-bind="source: modeloPersona.genders, value: modeloPersona.idGender"
							data-text-field="valor" data-value-field="codigo"></select></li>
						<li><label for="agree">License Agreement</label> <input
							type="checkbox" id="agree" data-bind="checked: modeloPersona.agreed" />
							I have read the licence agreement</li>
					</ul>
					<button data-bind="enabled: modeloPersona.agreed, click: register"
						class="k-button k-primary">Register</button>
				</form>
			</div>
			<div>
				<h4>Current view model state:</h4>
				<pre>
    {
        firstName: <span data-bind="text: modeloPersona.firstName"></span>,
        lastName: <span data-bind="text: modeloPersona.lastName"></span>,
        gender: <span data-bind="text: modeloPersona.idGender"></span>,
        agreed: <span data-bind="text: modeloPersona.agreed"></span>
    }
            </pre>
			</div>
		</div>
		<script>
			$(document).ready(function() {

				var generoDs = cargarComboTablaGeneral("/listarTablaMaestra", 4);
				persona.genders = generoDs;
				var viewModel = kendo.observable({
					modeloPersona : persona,
					register : function(e) {
						e.preventDefault();

						this.set("modeloPersona.confirmed", true);
					},
					startOver : function() {
						this.set("modeloPersona.confirmed", false);
						this.set("modeloPersona.agreed", false);

						this.set("modeloPersona.firstName", "John");
						this.set("modeloPersona.lastName", "Doe");
					}
				});

				kendo.bind($("#example"), viewModel);
			});
		</script>



		<style>
.demo-section>div {
	float: left;
	margin-bottom: 2em;
}

#fieldlist {
	margin: 0;
	padding: 0;
}

#fieldlist li {
	list-style: none;
	padding-bottom: 1.5em;
	text-align: left;
}

#fieldlist label {
	display: block;
	padding-bottom: .3em;
	font-weight: bold;
	text-transform: uppercase;
	font-size: 12px;
}

.prettyprint {
	background-color: #fff;
	border: 1px solid #ccc;
	overflow: auto;
	padding: 5px;
}
</style>
	</div>



</body>
</html>
