class Juego {
    constructor(numero, input,intentar, intentos){
        this.numero = numero
        this.input = input
        this.intentar = intentar
        this.intentos = intentos
    }
}

pedirNumero() {
    let numero = (this.inputNumero.value)
    if (numero === this.input) {
      this.mensaje.innerHTML = 'Felicidades, adivinaste el número secreto';
      console.log('Lista de números introducidos: ' + this.intentos.innerHTML);
    } else {
      this.input.innerHTML = 'Ups, el número secreto es incorrecto, vuelve a intentarlo.';
    }
    this.inputNumero.value = '';
  }



const numero = Math.floor(Math.random() * 100) + 1;
const input = document.getElementById('input');
const intento = document.getElementById('intento');
const intentos = document.getElementById('intentos');