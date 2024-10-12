// Memory Life Cycle
/*1. Allocates the memory
2. use the allocated memory
3. Release/Delete memory*/

let employee = {
    name: 'John',
    age: 30,
}

let name = "Sa";

function greet(name){
    return name;
}

let newEmployee = employee; 
console.log(newEmployee)//{ name: 'John', age: 30 }

let playerInfo = ["Sat", "Rat", "Cat", "Bat"];

//Join
/*let playerString = playerInfo.join(" * ");
console.log(playerString);*/ //Sat * Rat * Cat * Bat

/*let playerString = playerInfo.toString();
console.log(typeof playerString);*/ //string

//Split operator
/*let str="Sat,Rat,Cat,Bat";
let arr = str.split(", ")
console.log(arr);*/ //[ 'Sat,Rat,Cat,Bat' ]

//delete 
delete playerInfo[1];
// console.log(playerInfo); //[ 'Sat', <1 empty item>, 'Cat', 'Bat' ]
// console.log(playerInfo.length); //4

/*Q1. Create an array write [bazz, ball] and then add the England to arr [bazz, ball, England] then replace ball with bat [bazz, bat, england] then replace bazz with India [India, bat, England].*/

let arr = ["bazz", "ball"];//[ 'bazz', 'ball' ]
arr.push("England");//[ 'bazz', 'ball', 'England' ]
arr[1] = "bat";//[ 'bazz', 'bat', 'England' ]
arr[0] = "India";//[ 'India', 'bat', 'England' ]
console.log(arr);

/*Q2. write a function sumInput(), ask values from user and store in to an array finish asking values if user has given any non-numeric String or press cancel calculates the sum & return that
for this check index7.html*/

// Stack & Heap