let str1 = "Hello"
let str2 = "SA"

let str3 = `${str1} ${str2}`;
console.log(str3); //Hello SA
console.log(str3.length);//8
console.log(str3[10]);//undefined

let keyword = "Hello M";
let position = str3.search(keyword)
console.log(position); //-1

let str = "My self SA and currently I am learning Javascript from 8pm to 10pm";
let slicedText = str.slice(10, 30);
console.log(slicedText); // and currently I am
let sbstringStr = str.substring(10);
console.log(sbstringStr);

/* Create a func trim length, which take one length as well for example:- 
trim.length(str,10) after the 10 charaters print .... like this = Ska.... */
function trimLength(str, maxLength) {
  if (str.length > maxLength) {
    return str.slice(0, maxLength) + '...';
  }
  return str;
}

const userInputString = prompt('Enter a string:'); 

// Call the function with user input
const result = trimLength(userInputString, 10);
console.log(result); 

/*Extract currency ('$120') print 120*/
let currency = prompt("Enter currency: ");
let currencyValue = currency.slice(1);
console.log(currencyValue);

const student = {
    name1: "Ska",
    name2: "SA",
}

student.rollNo = 32;
console.log(student);//{ name1: 'Ska', name2: 'SA', rollNo: 32 }

let employee = {
    name: "Ska",
    age: 25,
    salary: 25000,
    address: {
        city: "Pune",
        state: "MH",
        pincode: 411041,
        family:{
            name: "Sa",
            age: 25,
            occupation: 'Teacher'
        }
    }
}
console.log(employee.address.family.occupation); //Teacher
console.log(employee["address"]["family"]["occupation"]); //Teacher

let obj = {
    "my name": "SA",
    age: 21,
}

// console.log(obj.my name); //error
console.log(obj["my name"]); //SA

//How ro iterate over a arr
for(let key in obj){
    console.log(key); //my name age
    console.log(obj[key]); // 21
}

console.log(Object.keys(obj));//[ 'my name', 'age' ]
console.log(Object.values(obj));//[ 'SA', 21 ]