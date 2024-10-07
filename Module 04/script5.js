//Function declaration
function sum(a,b){
    return a+b;
    //after this line there is no use to write code as after this it is temporal dead zone.
}

//Function Calling
let ans = sum(10,20);
console.log(ans);

//Factorial 
function factorial(num){
    if(num < 0){
        return "Factorial is not defined for negative numbers";
    }else if(num === 0 || num === 1){
        return 1;
    }else{
        let fact = 1;
        for(let i = 2; i <= num; i++){
            fact *= i;
        }
        return `The factorial of ${num} is ${fact}`;;
    }
}

console.log(factorial(-5));
console.log(factorial(5));
console.log(factorial(2));

//Fibonacci series 
function fibonacci(n) {
    let a = 0;
     let b = 1;
     let nextTem = null;
     for(let i =1; i <= n; i++){
        console.log(a);
         nextTem = a + b;
         a = b;
         b = nextTem;
     }
}

console.log(fibonacci(10)); 

//Scoping //Check img

//Global Scoping //var
// var studentName = "Sa";
let studentName = "Sa";
function ska(){
    console.log(studentName);
}
ska();

//Block Scoping // let & const
if(true){
    let name = "Ska";
    console.log(name);
}
console.log(name);

//Function Scoping //let, var & const
function sa(){
    var studentName = "Sa";
    console.log(studentName);
}
sa();
console.log(studentName);//error func scope

//Function Chaining
let a = 10;
function outer(){
    let b = 20;
    console.log(a++);
    function inner(){
        let c = 30;
        console.log(++a, --b, ++c);
        function innerMost(){
            let d = 40;
            console.log(a--, ++b, c--, d++);
        }
        innerMost(); //12 20 31 40
    }
    inner(); //12 19 31
}
outer(); //10

let a = 10;
function outerMost(){
    let b = 20;
    console.log(a--,b++);
    function outer(){
        let c = 30;
        console.log(a--, b++, c++);
        function inner(){
            let d = 40;
            console.log(a--, b++, c++, d++);
            function innerMost(){
                let e = 50;
                console.log(a--, b++, c++, d++, --e);
            }
            innerMost(); //7 23 32 41 49
        }
        inner(); //8 22 31 40
    }
    outer(); //9 21 30
}
outerMost(); //10 20

// https://javascript.info/
//Hoisting
/* console.log(sa);
 const sa = 10;*/ // Cannot access 'sa' before initialization

/*var sa;
console.log(sa);
sa = 10;*/ //undefined

function hello(){
    let sa = 10;
    console.log(sa);
}
hello(); //10
