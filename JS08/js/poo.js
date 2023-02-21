let persona = {
    nombre: 'Jorge',
    apellido: 'Recillas',
    nombreCompleto: function () {
        return "el nombre es " + this.nombre + " " + this.apellido;
    }
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());