/*********************************************************************   Day4   ******************************************************************/
// let a = 20;
// let b = 30;
// let c = 10;

// console.log(true === "true"); //false

/* Pre or post increment or decrement */
//console.log(--a + ++b + c++ - a-- + b-- + ++c + ++a - b-- - c--); //62

/*Logical operators also known as Short circuit evaluation*/
// console.log(a++ > b && a++ == b ++); //false 21 30
// console.log(a++ > b || a++ == b ++); //false 22 31
// console.log(a++ < b || a++ == b ++); //true 21 30
// console.log(a,b);

/*Implicit Type Casting*/
// console.log(10+"20");//1020
// console.log(typeof(10+"20"));//string
// console.log((10-"20"));//-10

// let a = -10; //true
// let a = undefined; //false
// let a = "";//false
//let a = "1000";//false
// let aBoolean = Boolean(a); //true
// let aBoolean = Number(a); //true
//let aBoolean = String(a);//-10
// console.log(aBoolean);

/*Explicit Typecasting*/
// let a="1000";
// let aBoolean = Number(a);
// console.log((aBoolean));//1000


/* if/else
1. user > ₹1000 => 10% dis
2. user > ₹500 => 5% dis
3. user < ₹500 => no discount

and also give actual price after discount 
*/
/*const price = 200;
if(price > 1000){
    console.log("You got 10% discount:"+ 0.1 * price);
}else if(price > 500){
    console.log("You got 5% discount:"+ 0.05 * price);
}else{
    console.log("No discount");
}*/

/* using switch
user's shipping option
standard:- 5-7 days to deliver
express:- 1-2 days to deliver
oneday:- same day to deliver
choose correct shipping option
*/
/*let shippingOption = "oneDay"
switch(shippingOption){
    case "Standard":
        console.log("5-7 days to deliver");
        break;
    case "Express":
        console.log("1-2 days to deliver");
        break;
    case "OneDay":
        console.log("same day to deliver");
        break;
    default:
        console.log("choose correct shipping option");
        break;
}*/

//for, while and do-while
//write a table of 19 in for, while & do-while
//for loop
for(let i = 1; i <= 10; i++){
    console.log("19 x "+"= "+(19*i));
}

//while
let i = 1;
while(i <= 10){
    console.log("19 x "+"= "+(19*i));
    i++;
}

//Do-while
let j = 1;
do{
    console.log("19 x "+"= "+(19*i));
    j++;
}while(j <= 10);