// Function Statement
function sum(x, y){
    return x + y;
}
let ans = sum(4,5);
console.log(ans); // Output: 9

// Function Expression
var a = 9;
let sum1 = function sum(){
    console.log(2+3);
}
sum1()//5
console.log(sum1);//[Function: sum]

// Anonymous Function (which don't have any name)
let b = function(){
    console.log(10+20);
}
b();//30

// HOF = Higher order function(kind a regular func but it takes one or more func as arguments or return a func as a value from it)
function getCapture(camera){
    camera();
}
getCapture(function(){
    console.log("Captured");
});

//or

function getCapture(camera){
    camera();
}
function a(){
    console.log("Captured");
}
getCapture(a); // Captured

//or

function returnFunc(){
    return function(){
        console.log("Captured");
    }    
}
let fn = returnFunc();
fn(); //Captured

function calculate(ope, initialValue, numbers){
    let total = initialValue;
    for(let number of numbers){
        total = ope(total, number);
    }
    return total;
}
function sum(n1, n2){
    return n1 + n2;
}

function multiply(n1, n2){
    return n1 * n2;
}
calculate(sum, 0, [1,2,3,4,5,6]);
calculate(multiply, 1, [1,2,3,4,5,6]);

// Arrow function
function sum(){
    // console.log("Captured")
    return 90+90;
}
sum();

let sum1 = () => 90-20;
//or
let sum1 = () =>{
    return 90-20;
}
let ans = sum1();
console.log(ans);

// Immediately invoked function expression (IIFE)
(function(){
    console.log(90-30);
})();//60

//or

//let b = 10;
var b = 10;
function func(){
    b=8;
    //let b=8; 
    console.log(b);
}
func();//8
console.log(b);//8

//or

var a = 10;
{()=>{
    a = 9;
    console.log(a);
}}(a);
console.log(a);//10

//or

var b = 20;
function p(){
    b = 10;
    console.log(b);//10
};
p();
console.log(b);//10