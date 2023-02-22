// ejercicio 1

GPAacumulativo = 2.1
UnidadesTotales = 120

if (GPAacumulativo> 2.0 && UnidadesTotales >= 120) {
    console.log("puede graduarse!");
   } else {
console.log("no puede graduarse");
}


// ejercicio 2

cspCalificacion = 0
progCalificacion = 0

if (cspCalificacion >= 75 || progCalificacion >= 75) {
    console.log("eres elegible para la graduacion");
}else {
    console.log("no puedes graduarte");
}


// ejercicio 3
let texto = "Hola Mundo";
let separada = " "


for (let index = 0; index < texto.length; index++) {
    separada += texto[index] + ".";
    
}


console.log(separada);
