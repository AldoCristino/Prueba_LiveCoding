// API
const API_ENDPOINT = 'https://yesno.wtf/api';
let input = document.getElementById("input");
let anser = document.getElementById("answer");
let btn = document.getElementById("button")


btn.addEventListener("click",function (e){
    
    fetchAnswer();
    setTimeout(() => {
        anser.innerHTML = " "
        input.value = " "    
    }, 5000);
    
});

function fetchAnswer() {
    const promesa = fetch(API_ENDPOINT, {
        method: "GET"
    });

    promesa.then((response) => {
        response.json().then((data) => {
            anser.innerHTML += data.answer;
        }).catch((error) => {
            console.error(error);
        })//catch
    }).catch ((error) => {
        console.error("Error en la solicitud " + error);
    })//catch-promesa

}



/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */
