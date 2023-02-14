/*Parte 1
Hay tres personas esperando el banco. Sus nombres, en orden, son Sofía, David y Juan. Cree una matriz que tenga estos tres nombres en orden. */
let nombres = ["Sofia", "David", "Juan"];
console.log(nombres);

/*Parte 2
Se agregan dos personas más al final de la fila: Sara y Augustin. La primera persona en la fila es llamada al cajero. ¿Cómo es la cola?*/
nombres.shift();
nombres.push("sara", "agustin");
console.log(nombres);

/*parte 3
Resulta que David estaba reservando un lugar para su amiga Renata. Ella aparece y va detrás de él en la fila. Aparece una persona más (Elena) y va hasta el final de la fila. ¿Cómo es la cola? */
nombres.splice(1, 0, "renata");
nombres.push("Elena");

console.log(nombres);

/*Write a JavaScript program to construct the following pattern, using a nested for loop.*/

let a = "*";
let contador = 0;

while (contador < 5) {
  console.log(a);
  a += " *";
  contador += 1;
}

//- Print all the odd numbers between 1 - 100.
for (let i = 1; i <= 100; i++) {
  console.log(i);
}


