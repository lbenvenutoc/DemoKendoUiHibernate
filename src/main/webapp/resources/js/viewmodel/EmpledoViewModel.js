var crudServiceBaseUrl = "http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado";
var empleadoViewModel = kendo.observable({	
	empleados : new kendo.data.DataSource({
		transport : {
			read : {
				url : crudServiceBaseUrl + "/listarTodoEmpleado",
				dataType : "json",
				type : "POST",
				contentType : "application/json"
			},
			update : {
				url : crudServiceBaseUrl + "/actualizarEmpleado",
				dataType : "json",
				type : "POST",
				contentType : "application/json"
			},
			create : {
				url : crudServiceBaseUrl + "/insertarEmpleado",
				dataType : "json",
				type : "POST",
				contentType : "application/json"
			},
			destroy : {
				url : crudServiceBaseUrl + "/eliminarEmpleado",
				dataType : "json",
				type : "POST",
				contentType : "application/json"
			},
			parameterMap : function(options, operation) {
				return JSON.stringify(options);

			}

		},
		pageSize : 20,
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
		
		
		
	})
});
kendo.bind($("#example"), empleadoViewModel);