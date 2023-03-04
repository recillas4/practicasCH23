/*
switch (expresión) {
  case valor1:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
    [break;]
  case valor2:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
    [break;]
  ...
  case valorN:
    //Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
    [break;]
  default:
    //Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
    [break;]
}

*/

let dia = Number(prompt("Introduce un numero de dia de la semana "));

switch (dia) {
  case 1:
    document.write("Lunes");
    break;
  case 2:
    document.write("Martes");
    break;
  case 3:
    document.write("Miercoles");
    break;
  case 4:
    document.write("Jueves");
    break;
  case 5:
    document.write("Viernes");
    break;
  case 6:
    document.write("Sabado");
    break;
  case 7:
    document.write("Domingo");
    break;
  default:
    document.write("No es un dia Valido");
    break;
}
