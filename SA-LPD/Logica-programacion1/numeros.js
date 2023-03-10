// Crear un programa en Javascript que realice lo siguiente:
// Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
// Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
// Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
// Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.

let num1 = parseInt( prompt("Ingresa un numero a ordenar "));
let num2 = parseInt( prompt("Ingresa otro numero a ordenar "));
let num3 = parseInt( prompt("Ingresa otro numero a ordenar "));







let max = Math.max (num1,num2,num3);
let min = Math.min (num1,num2,num3);
let medio = num1 + num2 + num3 - max - min;


console.log("Ordenados de mayor a menor: " + max, min, medio);

console.log("Ordenados de menor a mayor: " + min, medio, max);



