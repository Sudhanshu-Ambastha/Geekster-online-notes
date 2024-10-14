var l = 4;
var w = 3;

function calculate(length, width){
    var area = length * width;
    return area;
}

var rectangle =  calculate(l, w);
console.log(rectangle);

/*global execution context mcp = l, w, calculate, rectangle will run 1st then cep(code execution phase)will run
*/

//First Unique Character in a String
function getUniqueCharacters(input) {
  let charCount = {};
  let output = '';
  
  // Count frequency of each character
  for (let char of input) {
    charCount[char] = (charCount[char] || 0) + 1;
  }
  
  // Append characters that appear only once
  for (let char of input) {
    if (charCount[char] === 1) {
      output += char;
    }
  }
  
  return output;
}

let input1 = "aakhhill";
let input2 = "aakash";

console.log(getUniqueCharacters(input1)); // Prints "ki"
console.log(getUniqueCharacters(input2)); // Prints "kash"
