// Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
// Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
// Debe imprimir ambos resultados por consola o por el DOM.
// Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.

temp = parseFloat(prompt("Ingresa los grados C para convertir a Kelvin y Farenheit"));
while (isNaN(temp)) {
    temp = prompt("Error: Ingresa un número válido para calcular los grados");
  }

farenheit = ((temp * 1.8) + 32)
kelvin = (temp + 273.15)


console.log("la temperatura en kelvin es: " + kelvin + " En farnheit " + farenheit);






