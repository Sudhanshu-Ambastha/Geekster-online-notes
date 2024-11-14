// set objects
let numbers1 = new Set([1,2,3,4,5,6,7,8,9,10]);
let uniqueNumbers = new Set(numbers1);
console.log(uniqueNumbers);

// default param
function greet(guest){
    console.log(`Hello ${guest}`);
}
greet('John');

// Destructuring = arr
let numbers = [1,2,3,4,5,6,7];
let [first, second, third] = numbers;
console.log(numbers);

// Destructuring = obj
let person = {
    name: 'John',
    age: 30,
    city: 'New York',
    personalInfo:{
        phNumber: 12345,
        email: 'john@gmail.com',
        password: '123456',
    }
}
let {age, city} = person;
console.log(age, city);

let {name, personalInfo:{phNumber, email}} = person;
console.log(name, phNumber, email);

// Rest operator
function sum(...arguments){
    console.log(arguments);
    return arguments.reduce((acc, curr) => acc + curr, 0);
}

console.log(sum(1,2,3,4,5));

// Spread operator
let arr = [1,2,3,4,5];
let arr2 = [6,7,8,9,10];
let arr3 = [...arr, ...arr2];
console.log(arr3);