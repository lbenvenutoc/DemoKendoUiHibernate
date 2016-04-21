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
<script>
	
</script>


</head>
<body>



	<div id="example">
		<div class="demo-section k-content" data-bind="visible: confirmed">
			Thank you for your registration, <span data-bind="text: firstName"></span>
			<span data-bind="text: lastName"></span> <br /> <br />
			<button data-bind="click: startOver" class="k-button k-primary">Start
				Over</button>
		</div>
		<div class="demo-section k-content wide">
			<div>
				<form>
					<ul id="fieldlist">
						<li><label for="fname">First Name:</label> <input id="fname"
							data-bind="value: firstName" class="k-textbox" /></li>
						<li><label for="lname">Last Name:</label> <input id="lname"
							data-bind="value: lastName" class="k-textbox" /></li>
						<li><label for="gender">Gender:</label> <select id="gender"
							data-bind="source: genders, value: gender"></select></li>
						<li><label for="agree">License Agreement</label> <input
							type="checkbox" id="agree" data-bind="checked: agreed" /> I have
							read the licence agreement</li>
					</ul>
					<button data-bind="enabled: agreed, click: register"
						class="k-button k-primary">Register</button>
				</form>
			</div>
			<div>
				<h4>Current view model state:</h4>
				<pre>
    {
        firstName: <span data-bind="text: firstName"></span>,
        lastName: <span data-bind="text: lastName"></span>,
        gender: <span data-bind="text: gender"></span>,
        agreed: <span data-bind="text: agreed"></span>
    }
            </pre>
			</div>
		</div>
		<script>
			$(document).ready(function() {
				var viewModel = kendo.observable({
					firstName : "John",
					lastName : "Doe",
					genders : [ "Male", "Female" ],
					gender : "Male",
					agreed : false,
					confirmed : false,
					register : function(e) {
						e.preventDefault();

						this.set("confirmed", true);
					},
					startOver : function() {
						this.set("confirmed", false);
						this.set("agreed", false);
						this.set("gender", "Male");
						this.set("firstName", "John");
						this.set("lastName", "Doe");
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
