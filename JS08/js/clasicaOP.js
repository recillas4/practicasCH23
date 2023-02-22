class OperacionesArirmeticas {
    numero0 = 0;
    numero1 = 0;

    constructor(valor0,valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }
    
    sumar(){
        return this.numero0 + this.numero1;
    }
}

let obj4 = new OperacionesArirmeticas(8, 6);
console.log(obj4.sumar());


let obj3 = new OperacionesArirmeticas();

obj3.numero0 = 8;
obj3.numero1 = 5;
<<<<<<< HEAD


=======
>>>>>>> main
console.log(obj3.sumar(obj3.numero0,obj3.numero1))

let obj2 = new OperacionesArirmeticas();
console.log(obj2.sumar(2,3));


let obj1; 
obj1 = new OperacionesArirmeticas();
<<<<<<< HEAD
let a = obj1.numero0;
console.log(" "+a);
=======
console.log(obj1.numero0);
>>>>>>> main
