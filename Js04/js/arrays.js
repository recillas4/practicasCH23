let lista = [12,5,80,34];







lista.sort(
    function(valor1,valor2){
         return valor1 - valor2;
    }
)
console.log(lista);


lista.sort();
console.log(lista);




lista.reverse();
console.log(lista);



let remover = lista.splice(1,2)
console.log("remover");
console.log(lista);
lista.splice(2,0, 100,200,300)
console.log(lista);



lista.shift();// quita el primero 
console.log(lista);

lista.pop();// ultimo de la lista
console.log(lista);

let masE = lista.concat(100,200,900); //agrega elementos
console.log(masE);

lista.push(100); //agrega
console.log(lista);

let msj = lista.joint("-");
console.log(msj);

let listaNueva = lista.slice(1,3)
console.log(listaNueva);

for(let i = 0; i < lista.length; i++){
    console.log(lista[i]);
}