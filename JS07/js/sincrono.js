// sincrono, bloqueante
alert("cohorte23");
console.log("Hola buen dia");
alert("dia del michi");
console.log("Adios");

//setTimeout(

    // function(){
    //     console.log("hola mundo, con retraso");
    // }, 1000)

    const myCallBack = () => console.log("hola mundo con retraso");
    setTimeout(myCallBack);
    
    console.log("sorpresa");