class Persona {
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this.apellido = apellido;
  }
  set nombre(nombre) {
    this._nombre = nombre;
  }
  get nombre() {
    return this._nombre;
  }
  set apellido(apellido) {
    this._apellido = apellido;
  }

  get apellido() {
    return this._apellido;
  }
  nombreCompleto(){
    return this._nombre + " " + this._apellido;
  }
  // sobre escribir metodo clase padre obj
  toString(){
    return this.nombreCompleto();

}

}

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre,apellido)
        this._departamento=departamento;

    }
    set departamento (departamento){
        this._departamento=departamento;
    }
    get departamento(){
        return this._departamento;
    }
    nombreCompleto(){
        return super.nombreCompleto() + " , " + this._departamento;
    }

}
let persona1 = new Persona("juan", "perez");
console.log(persona1.toString());

let empleado1 = new Empleado ("maria","juarez", "sistemas")
console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());


//let persona3 = new Persona ("jhonny", "deep");
//console.log(persona3.nombre);


//let persona1 = new Persona("Jorge", "Recillas");
//console.log(persona1.nombre);
//console.log(persona1.apellido);
//let persona2 = new Persona("sofia", "martinez");
//console.log(persona2);
