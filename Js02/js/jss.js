//funciones

//let suma(a,b){
  //  let sum1 = a + b
    //console.log(sum1);

//}
// funcion directa
function agregarCarritoCompra(){
    // lo que hace mi funcion
}
// invocar funcion
agregarCarritoCompra();

// funcion anonima

//let funcionAnonima = function (){
//    let valor1 = 5;
//    let valor1 = 7;
//    let suma = valor1 + valor2;
  //  console.log("esta funcion anonima ",suma);
//}

//funcionAnonima();

function division (par1,par2){
    let resultado = par1 / par2
    console.log(resultado);
}

division (88,10);

console.log(edad);
let edad = "30";

/*
Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)
    */

/*
cosas inportantes a tener en cuenta

- nombre que sea descrito e equivalente al funcionamiento
- datos de entrada (parametros)
- proceso o instrucciones a ejecutar
- salida (return)
*/

/*
hoisting llamar una funcnion antes de declararla elevacion

scope alcance o contexto
*/

/* 
tipos de funciones:
    funciones directas - nombre (comunes)
    
    funciones anonumas - viven pegadas a una variable o constante

    funciones como metodos (para especificar que hace mi obejeto)
    
    funciones como constructores(construir o crear un objeto)
*/

/* 
funciones flecha

    sintaxis
    =>*/
    function suma (a,b){
        let sum1 = a + b
        console.log(sum1);
    }

    const sumaflecha = (a, b) => a + b;

