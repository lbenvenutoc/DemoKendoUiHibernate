function cargarLista(accionParam) {
	var crudServiceBaseUrl = "http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado";
	var datasourceDs = new kendo.data.DataSource({
		transport : {
			read : {
				url : crudServiceBaseUrl + accionParam,
				dataType : "json",
				contentType : "application/json"
			}
		}
	});
	return datasourceDs;
}
function cargarComboTablaGeneral(accionParam, claseParam) {
	var crudServiceBaseUrl = "http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado";
	var datasourceDs = new kendo.data.DataSource({

		transport : {
			read : {
				url : crudServiceBaseUrl + accionParam,
				data : {
					clase : claseParam
				},
				dataType : "json",
				type : "POST",
				contentType : "application/json"

			},
			parameterMap : function(data) {
				return JSON.stringify(data);

			}
		}
	});

	return datasourceDs;
}