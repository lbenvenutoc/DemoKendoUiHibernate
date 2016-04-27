var crudServiceBaseUrl = "http://192.168.1.153:8044/DemoKendoUi/demokendo/empleado";
var frmAutocompletarViewModel = kendo.observable({	
	model : {
		departamentos : null
	}
});
kendo.bind($("#exampleAutocompletar"), frmAutocompletarViewModel);