function imprimirFibonacci() {
    let num = prompt("Ingresa un número para imprimir su serie de Fibonacci:");
    
    while (isNaN(num)) {
      num = prompt("Error: Ingresa un número válido para imprimir su serie de Fibonacci:");
    }
    
    num = parseInt(num);
    
    let a = 0;
    let b = 1;
    let fib = [];
    for (let i = 0; i < num; i++) {
      fib.push(a);
      let temp = a + b;
      a = b;
      b = temp;
    }
    
    // imprimir el resultado
    console.log(`La serie de Fibonacci de ${num} números es: ${fib.join(", ")}`);
  }
  
  imprimirFibonacci();