//Event in js is something happen in website like action which works on click
/*let h1 = document.querySelector("h1");
console.log(h1);

h1.addEventListener("click", function(){
    alert("alert box")
    h1.style.color="red";
    h1.style.borderColor="black";
})*/

let para = document.querySelector("#para");
let subBtn = document.querySelector("#sub");
let addBtn = document.querySelector("#add");
let value = 0;

subBtn.addEventListener("click", function(){
    //error: once subBtn got disabled after reaching to 0 doesn't get enabled again once again reach to greater then 0
    if(value > 0){
    value--;
    console.log(value);
    para.innerText = value;
    }
    if(value > 0){
       subBtn.disabled = false;
    }
    else if(value <= 0){
       subBtn.disabled = true;
    }
})
addBtn.addEventListener("click", ()=>{
    value++;
    console.log(value);
    para.innerHTML = value;
})

let input = document.querySelector("input");
console.log("Key is pressed=");

input.addEventListener("keypress", function(e){
    console.log("Key is pressed: ", e.key);
})