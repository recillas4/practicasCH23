const button = document.getElementById('cambiaNombre');
const saludo = document.getElementById('saludo');

button.addEventListener('click', function() {
    const nombre = prompt('cual es tu nombre?');
    saludo.innerHTML = `Hola, ${nombre}!`;
  });

