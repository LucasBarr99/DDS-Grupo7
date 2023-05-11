
function diceAdmin(valor) {
    if(valor == "admin"){
        return true
    }
    else false
}

function dice1234(valor) {
    if(valor == "1234"){
        return true
    }
    else false
}

function validarDatos(){
    var nombre = document.getElementById("nombre").value;
    var contraseña = document.getElementById("contraseña").value;
    var confirmacionContraseña = document.getElementById("confirmacion").value;
    var error = false;

    if((nombre == "") || (contraseña=="") || (confirmacion=="")){
        document.getElementById("advertencia4").innerHTML = "Por favor, completar todos los campos obligatorios(*).";
        error = true;
    }
    else document.getElementById("advertencia4").innerHTML = ""

    if(diceAdmin(nombre)){
        document.getElementById("advertencia1").innerHTML = "Su usuario no puede llamarse 'admin'.";
        document.getElementById("nombre").style.border = "1px solid red";
        error = true;
    }
    else{ 
        document.getElementById("advertencia1").innerHTML = ""
        document.getElementById("nombre").style.border = "1px solid rgb(18, 119, 89)"
    }

    if(contraseña != confirmacionContraseña){
        document.getElementById("advertencia3").innerHTML = "Las contraseñas no coinciden.";
        document.getElementById("contraseña").style.border = "1px solid red";
        document.getElementById("confirmacion").style.border = "1px solid red";
        error = true;
    }
    else{ 
        document.getElementById("advertencia3").innerHTML = ""
        document.getElementById("contraseña").style.border = "1px solid rgb(18, 119, 89)"
        document.getElementById("confirmacion").style.border = "1px solid rgb(18, 119, 89)"
    }

    if(dice1234(contraseña) || diceAdmin(contraseña)){
        document.getElementById("advertencia2").innerHTML = "Su contraseña no puede ser '" + contraseña + "'.";
        document.getElementById("contraseña").style.border = "1px solid red";
        error = true;
    }
    else{ 
        document.getElementById("advertencia2").innerHTML = ""
        document.getElementById("contraseña").style.border = "1px solid rgb(18, 119, 89)"
    }

    if (error == false){
        console.log("Usuario: " + nombre + " - Contraseña: " + contraseña);
        document.getElementById("bienvenida").innerHTML="¡Hola, " + nombre + "!";
        document.getElementById("bloque").innerHTML="<br><br><br>Usuario registrado exitosamente. <br><br><br>";
        document.getElementById("boton").outerHTML="<button type=button class=boton onclick=location.reload()>Volver Atrás</button>"
    }
    
}