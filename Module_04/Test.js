//String Reversal
let str = ("ABCDE");
let reversedStr = Object.values(str).join("").split("").reverse().join("");
console.log(reversedStr); // Output: "EDCBA"

//Check Anagram
function areAnagrams(str1, str2) {
  if (str1.length !== str2.length) {
    return false;
  }

  let sortedStr1 = str1.toLowerCase().split("").sort().join("");
  let sortedStr2 = str2.toLowerCase().split("").sort().join("");

  return sortedStr1 === sortedStr2;
}

console.log(areAnagrams("listen", "silent"));  

//Array Intersection
const arr1 = [1, 2, 3, 4, 5];
const arr2 = [3, 4, 5, 6, 7];
const intersection = arr1.filter(num => arr2.includes(num));
console.log(intersection); // Output: [3, 4, 5]

//String Palindrome
function isPalindrome(str) {
    str = str.toLowerCase();
    const reversedStr = str.split('').reverse().join('');
    return str === reversedStr;
}
const input = prompt("Enter a string to check if it's a palindrome:");
if (isPalindrome(input)) {
    console.log("The string is a palindrome.");
} else {
    console.log("The string is not a palindrome.");
}


//Array Rotation
function rotateRight(arr, positions) {
  positions = positions % arr.length;
  return arr.slice(-positions).concat(arr.slice(0, -positions));
}

const array = [1, 2, 3, 4, 5];
const rotatedArray = rotateRight(array, 2);
console.log(rotatedArray); 

//String Compression
function compressString(str) {
    let compressed = "";
    let count = 1;
    for (let i = 0; i < str.length; i++) {
            if (str[i] === str[i + 1]) {
                count++;
            } else {
                compressed += str[i] + count;
                count = 1;
            }
        }
        return compressed;
    }

    const inputString = prompt("Enter a string to compress:");
    const compressedString = compressString(inputString);
    console.log(compressedString);
    
//Array Sum
function arraySum(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

const array = [1, 2, 3, 4, 5];
console.log(arraySum(array));  // Output: 15

//Longest Substring Without Repeating Characters
function longestSubstringWithoutRepeating(s) {
  let longest = 0;  
  let currentSubstring = "";  

  for (let i = 0; i < s.length; i++) {
    if (currentSubstring.includes(s[i])) {
      const index = currentSubstring.indexOf(s[i]);
      currentSubstring = currentSubstring.slice(index + 1);
    }

    currentSubstring += s[i];

    if (currentSubstring.length > longest) {
      longest = currentSubstring.length;
    }
  }

  return longest;
}

const input = "abcabcbb";
console.log(longestSubstringWithoutRepeating(input));  // Output: 3 (substring: "abc")