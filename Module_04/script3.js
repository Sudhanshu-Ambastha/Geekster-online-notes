/*********************************************************************   Day3   ******************************************************************/

//for loop
// for(let i = 0; i < 5; i++){
//     console.log(i);
// }
// Output
/*0
1
2
3
4*/

// while loop
// let i = 0;
// while(i < 5){
//     console.log(i);
//     i++;
// }
/*Output
0
1
2
3
4*/

//do while loop
// let j = 0;

// do{
//     console.log(j);
//     j++;
// }while(j < 5);

/*Output
0
1
2
3
4*/

//Switch case
/*let str = 'case1';

switch(str){
    case 'case1':
        console.log('case1');
        break;
    case 'case2':
        console.log('case2');
        break;
    default:
        console.log('default');
        break;
    }*/
//Output: case1 

//Array
let arr = [];
arr[0] = 10;
arr[1] = 'sa';
arr[2] = 10.1;
arr[3] = {
    name: 'sa',
    age: 20
};

console.log(arr);
//[ 10, 'sa', 10.1, { name: 'sa', age: 20 } ]

/*for(let i = 0; i < arr.length; i++){
    console.log(arr[i]);
}

arr.forEach((element) => {
    console.log(element);
});*/

//callIt - HOC (higher order func) //! Important for interview Q
/*function callIt(callBack){
    let a = 10;
    callBack(a);
}

callIt(function(a){
    console.log(a, 'call back');
});*/

//Stack
/*let arr = [];
arr.push(10);
arr.push(20);

arr.unshift(30); //[ 30, 10, 20 ]

arr.pop(); //[ 30, 10 ]
arr.shift(); //[ 10 ]

console.log(arr);*/

//
let newArr = [1,2,3,1]; //past arr: [2,1]
//let one = newArr.includes(1); //true/false if 1 present in arr
//let idx = newArr.indexOf(45); //-1 if not present else idx of no. position
/*if(idx === -1){
    console.log('not exists');
}else{
    console.log('exists')
}
console.log(idx);*/ //-1

//Slice don't change original arr
//slice === substring //current arr: [1,2,3,1]
let removedArrEle = newArr.slice(1,2);
console.log(removedArrEle);//[ 2 ]
console.log(newArr);//[ 1, 2, 3, 1 ]

//Splice change original arr
let remArrEle = newArr.splice(1,2);
console.log(remArrEle);//[ 2, 3 ]
console.log(newArr);//[ 1, 1 ]