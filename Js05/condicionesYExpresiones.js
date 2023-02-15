//you have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"
let nombres = ["Maria", "Antony", "Joy", "Juan"]
console.log(nombres);

//Write a function to insert a name to the end of the list. Add your own name to the end of the list.
function agregarMiNombre (mio,nombres){
    nombres.push(mio)
}
agregarMiNombre ("Jorge",nombres);
console.log(nombres);

//Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.
function nombresEnLista(nombres, listaNombres) {
    return listaNombres.includes(nombres);
  }
  console.log(nombresEnLista("Jorge", nombres));  

// Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.

let otrosNombres = ["sofia","fatima","lorena","angelica"];

function todosLosNombres (nombres,otrosNombres){
    return nombres.filter
}

