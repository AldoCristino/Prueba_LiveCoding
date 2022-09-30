
let arregloPalabras = ["insecto", "bootcamp", "mangos", "reptil", "mosca", "escritorio"];
let ul = document.getElementById("ul");
let btn = document.getElementById("btn");
let pala = document.getElementById("Palabra");
btn.addEventListener("click", function (e) {
    e.preventDefault();
    escribe(escoge(pala.value, arregloPalabras));
    pala.value = " ";
    pala.focus();
})


function escoge(palabra, arreglopalabras) {
    let arraypala = [];
    arregloPalabras.forEach(pala => {
        if (pala.length > palabra.length) {
            arraypala.push(pala);
        }
    });
    return arraypala;
 
}

function escribe(arreglo) {
    arreglo.forEach(pala =>{
       ul.innerHTML+= `<li> ${pala} </lli>`;       
    });
}