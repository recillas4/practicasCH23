/*critical rendering path*/
/*
que encontramos en el arbol del DOM?

Nodo, node = unidad mas basica dentro del documento
etiqueta 

document tambien es un nodo tipo documento, nodo raiz apartir del cual se generan los demas

element, element son aquellos definidos por etiquetas div,h1,p,

atributo attributes, dan informacion associada al tipo de elemento

comentariio y otros son nodos
*/

/*
metodos tradicionales (que se usan en versiones antiguas en js)
    -document.getElementById(botonsuma)
    -document.getElementByTagName(<button>)
    -document.getElementByClassName (botones)


metodos recientes 
document.querySelector(#botonSuma)
documet.querySelectorAll(.botones)

var elementoId = document.getElementById("botonSuma")
console.log(elementoId);

var elementoEtiqueta = document.getElementsByTagName('button')
console.log(elementoEtiqueta);
console.log("primer objeto de mi coleccion", elementoEtiqueta[0]);

var elementoClassName = document.getElementsByClassName("botomes")
console.log(elementoClassName);


var unElemento = document.querySelector("#input1")
console.log(unElemento);


var variosElementos = document.querySelectorAll(".botones")
console.log(variosElementos);
*/

/*creacion de nodos
    document.createElement(tipoNodo)

*/

//tipoimagen
const imagenPerrito = document.createElement("img");
// atributos a la etiqueta

imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.alt ="perrito tierno"
imagenPerrito.style.width = "150px"



// poner elementos o nodos en el html
document.body.append(imagenPerrito);


//actualizar nodos parentElementBefore appendChild adjacent
// 1 identificar el nodo k quiero cambiar(outer)
// 2 modificar el nodo (inner)

var resultadoQueCambia = document.getElementById ("resultado");
resultadoQueCambia.innerHTML = "saludos cambie el texto juajiuas";










var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");


var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");


var resultado = document.getElementById("resultado")