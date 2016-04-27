<!DOCTYPE html>
<html>
<head>
    <title>Binding to remote data</title>
    <meta charset="utf-8">
    <link href="${pageContext.request.contextPath}/resources/kendoui/content/shared/styles/examples-offline.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.common.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.rtl.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.default.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.dataviz.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/kendoui/styles/kendo.dataviz.default.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/resources/kendoui/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/kendoui/js/jszip.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/kendoui/js/kendo.all.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/kendoui/content/shared/js/console.js"></script>
    <script>
        
    </script>
    
    
</head>
<body>
    
       
    
    
        <div id="example">
            <div id="grid"></div>
            <script>
                $(document).ready(function() {
                    $("#grid").kendoGrid({
                    	sortable  : true,
                        groupable : true,
                        scrollable: true,
                        dataSource: {                            
                            transport: {
                                read: {
                                	url:"http://192.168.1.153:8040/DemoKendoUi/demokendo/empleado/listarTodoEmpleado",
                                	dataType:"Json"
                                }
                            },
                    		pageSize: 20
                    		
                           
                        },
                        height: 550,
                        filterable: true,
                        sortable: true,
                        pageable: true,
                        columns: [{
                                field:"idEmpleado",
                                title: "Codigo",
                                filterable: false
                            },                     
                            {
                                field: "apellidoPaterno",
                                title: "Apellido Paterno"
                               
                            }, {
                                field: "apellidoMaterno",
                                title: "Apellido Materno"
                            }, {
                                field: "nombre",
                                title: "Nombres"
                            }
                        ]
                    });
                });
            </script>
</div>


    
</body>
</html>
