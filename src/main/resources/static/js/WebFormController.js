/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function createTable(cadenas) {
    var table = document.getElementById("Table");
    table.innerHTML = "";
    
    var tableHead = document.createElement("THEAD");
    tableHead.setAttribute("class", "bg-success");

    
    var headersRow = document.createElement("TR");

    
    var headers = ["ID", "Fecha", "Texto"];
    for (var h in headers) {
        var columnHeader = document.createElement("TH");
        columnHeader.setAttribute("scope", "col");
        columnHeader.innerHTML = headers[h];
        headersRow.appendChild(columnHeader);
    }   
    tableHead.appendChild(headersRow);
    table.appendChild(tableHead);

    var tableBody = document.createElement("TBODY");
    for (var i in cadenas) {
        console.log(cadenas)
        if (i < 10) {
            var bodyRow = document.createElement("TR");
            console.log(cadenas[i])

            for (var j in cadenas[i]) {
                console.log(cadenas[i][j])
                var columnRow = document.createElement("TD");
                columnRow.innerHTML = cadenas[i][j];
                bodyRow.appendChild(columnRow);
            }
            tableBody.appendChild(bodyRow);
            
            /*var lineas = document.getElementById("textos");
            for (var t = 0; t < Object.values(cadenas[i]).length; t++){
                switch(t){
                    case 0:
                        var id = document.createElement("small");
                        id.setAttribute("class", "text-muted");
                        id.innerHTML = Object.values(cadenas[i])[0];
                        console.log(id)
                        lineas.appendChild(id);
                        break
                        
                    case 1:
                        var fecha = document.createElement("small");
                        fecha.setAttribute("class", "text-muted");
                        fecha.innerHTML = " - " + Object.values(cadenas[i])[1];
                        console.log(fecha)
                        lineas.appendChild(fecha);
                        break
                        
                    case 2:
                        var texto = document.createElement("p");
                        texto.innerHTML = Object.values(cadenas[i])[2];
                        console.log(texto)
                        lineas.appendChild(texto);
                        break
                }
            }*/
            //var a = document.createElement("hr");       
                //lineas.appendChild(a);
        }
        
    }
    table.appendChild(tableBody);
    
    
}

function addString(str) {
    if (str != "" && str != " ") {
        axios.post('/strings', str, {headers: {'Content-Type': 'application/json'}}).then(function (response) {
            getStrings();
        }).catch(function (error) {
            console.log(error);
        });
    } else {
        alert("Invalid string!");
    }
}

function getStrings() {
    axios.get('/strings').then(function (response) {
        createTable(response.data);
    }).catch(function (error) {
        console.log(error);
    })
}