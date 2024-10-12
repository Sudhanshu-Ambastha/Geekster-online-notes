//Arrays
//Time complexity is O(n)
let playerInfo = [
    {name: "John", score: 25},
    {name: "Jane", score: 30},
    {name: "Vivek", score: 10},
    {name: "Mia", score: 17},
    {name: "Jack", score: 50},
    {name: "Ava", score: 60},
    {name: "Rahul", score: 20},
]

//Shift:- O(n)
// playerInfo.shift()
//for adding element
// playerInfo.push({name: "Evelyn", score: 45}, {name: "Lokesh", score: 85})
//insert elements at the beginning:- unshift:- O(n)
// playerInfo.unshift({name: "Evelyn", score: 45}, {name: "Lokesh", score: 85})
//for deleting element
// playerInfo.pop();
console.log(playerInfo);

//for loop
for(let i = 0; i < playerInfo.length; i++){
    console.log(playerInfo[i].score);
}

//splice:- starting index,deletion count, what u want to add there?
playerInfo.splice(1,3, {name: "anand", score: 89});
console.log(playerInfo);

let ans = playerInfo.every(function(player)){
    if(player.score % 2 ===0){
        return true;
    }else{
        return false;
    }
}
console.log(ans);

// 53. Max Subarray
function getMaxSum(arr){
    let maxSum = 0;
    for(let i = 0; i < arr.length; i++){
        let sum = 0;
        for(let j = i; j < arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
}
//shallow copy
let employee = {
    eid:123,
    ename:"skd",
    salary:12345,
}
let newemplyee = employee;
newemplyee.salary = "200";
console.log(employee);
console.log(newemplyee);

//Sort:- 
const fruits = ['banana', 'apple', 'mango', 'cherry'];
fruits.sort();
console.log(fruits); // Output: ["apple", "banana", "cherry", "mango"]
