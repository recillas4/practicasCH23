function calcularFactorial() {
    let num = prompt("Ingresa un número para calcular su factorial:");
    
    while (isNaN(num)) {
      num = prompt("Error: Ingresa un número para calcular su factorial:");
    }
    
    num = parseInt(num);
    
    // calcular el factorial
    let factorial = 1;
    for (let i = 2; i <= num; i++) {
      factorial *= i;
    }
    
    console.log(`El factorial de ${num} es ${factorial}`);
  }
  
  calcularFactorial();
  