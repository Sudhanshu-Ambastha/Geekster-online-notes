/*Leetcode 1047. Remove All Adjacent Duplicates In String*/
/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicate = function(s) {
    let stack = [];
    for(let i = 0; i < s.length; i++){
        if(stack.length > 0 && stack[stack.length - 1] === s[i]){
            stack.pop();
        }
        else{
            stack.push(s[i]);
        }
    }
    return stack.join("");
};
console.log(removeDuplicate("abbaca"));

/*Leetcode 242. Valid Anagram*/
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;
    
    const sortedS = s.split('').sort().join('');
    const sortedT = t.split('').sort().join('');
    
    return sortedS === sortedT;
};
console.log(isAnagram("anagram", "nagaram"));

/*Leetcode 394. Decode String*/
/**
 * @param {string} s
 * @return {string}
 */
var decodeString = function(s) {
    let stack = [];
    let currentNum = 0;
    let currentStr = '';
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '[') {
            stack.push(currentStr);
            stack.push(currentNum);
            currentStr = '';
            currentNum = 0;
        } else if (s[i] === ']') {
            let num = stack.pop();
            let prevStr = stack.pop();
            currentStr = prevStr + currentStr.repeat(num);
        } else if (isNaN(s[i])) {
            currentStr += s[i];
        } else {
            currentNum = currentNum * 10 + parseInt(s[i]);
        }
    }

    return currentStr;
};
console.log(decodeString("3[a]2[bc]"));

/*Leetcode: 767. Reorganize String*/
/**
 * @param {string} s
 * @return {string}
 */
var reorganizeString = function(s) {
    const n = s.length;

    const frequency = {};
    for (let char of s) {
        if (frequency[char]) {
            frequency[char]++;
        } else {
            frequency[char] = 1;
        }
    }

    let maxChar = '';
    let maxFreq = 0;
    for (let char in frequency) {
        if (frequency[char] > maxFreq) {
            maxFreq = frequency[char];
            maxChar = char;
        }
    }

    if (maxFreq > Math.floor((n + 1) / 2)) {
        return "";  
    }

    const result = new Array(n);

    let index = 0;
    while (frequency[maxChar] > 0) {
        result[index] = maxChar;
        index += 2;  
        frequency[maxChar]--;
    }

    for (let char in frequency) {
        while (frequency[char] > 0) {
            if (index >= n) {
                index = 1;  
            }
            result[index] = char;
            index += 2; 
            frequency[char]--;
        }
    }

    return result.join('');
};
console.log(reorganizeString("aab"));
