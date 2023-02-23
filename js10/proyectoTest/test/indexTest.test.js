//prueba efectiva
//const indexTest = require ("../calculadora");

import { indexTest } from "../calculadora";
test('test suma', () => {
  const r = indexTest.suma(3,2);
  expect (r).toBe(5);

});

// en espera
test.todo('test resta')
test.todo('test multi')
test.todo('test division')
