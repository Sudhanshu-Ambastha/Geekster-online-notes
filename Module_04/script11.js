//For Each
/*let arr = [1,2,3,4,5];
arr.forEach(function(ele, index, arr){
    console.log(ele);
/*
1
2
3
4
5
*/
    // console.log(ele, index, arr);
/*
1 0 [ 1, 2, 3, 4, 5 ]
2 1 [ 1, 2, 3, 4, 5 ]
3 2 [ 1, 2, 3, 4, 5 ]
4 3 [ 1, 2, 3, 4, 5 ]
5 4 [ 1, 2, 3, 4, 5 ]
*/
//})

/*let arr=[
    {id:1, name:'aakash'},
    {id:2, name:'rahul'},
]
arr.forEach(function(obj){
    console.log(obj);
    /*{ id: 1, name: 'aakash' }
      { id: 2, name: 'rahul' }*/
    //console.log(obj.name);
    /*aakash
    rahul*/
//});

//Map
/*let arr = [1,2,3,4,5];
let mapArray = arr.map((ele)=>{
    return ele * 2;
})*/
// console.log(mapArray);//[ 2, 4, 6, 8, 10 ]
// console.log(arr);//[ 1, 2, 3, 4, 5 ]

//Filter
/*let arr = [1,2,3,4,5];
let filteresArray = arr.filter((ele)=>{
    return ele % 2 === 0;
})
console.log(filteresArray);*///[ 2, 4 ]'

/*let arr =[
    {id: 100, name: 'John'},
    {id: 200, name: 'Jane'},
    {id: 300, name: 'Bob'},
    {id: 400, name: 'Alice'},
    {id: 500, name: 'Mike'},
]*/

/*let array = arr.filter((ele)=>{
    return ele.id < 200 && ele.id < 500;
})
console.log(array);*/
//[ { id: 100, name: 'John' } ]
//or
/*let array = arr.filter((ele)=>{
    return ele.id < 200 && ele.id < 500;
})
array.forEach((ele)=>{
    console.log(ele.name); //John
})*/
//or
//Chaining
/*let array = arr.filter((ele)=>{
    return ele.id < 200 && ele.id < 500;
}).forEach((ele)=>{
    console.log(ele.name);//John
})*/

//Reduce Accumulator (reduce gives one single val)
/*let arr = [1,2,3,4,5];
let ans = arr.reduce((accumulator, currentValue)=>{
    return accumulator + currentValue;
}, 0);
console.log(ans);*///15

/*let arr = [1, 2, 3, 4, 5];
let ans = arr.reduce((accumulator, currentValue) => {
    accumulator.push(currentValue * currentValue);
    return accumulator;
}, []);
console.log(ans);*/ // Output: [1, 4, 9, 16, 25]

//find mean=38.5 & median=39 of (12, 46, 32, 64)
// let input = [12, 46, 32, 64];
/*let input = [12, 46, 32, 64, 72];
//mean
let mean = input.reduce((acc, cur)=>{
    return acc + cur;
},0);
console.log(mean/input.length);//38.5 //45.2
//median
input.sort((a,b)=>a-b);
let median;
if(input.length % 2 === 0){
    median = (input[input.length/2] + input[input.length/2 - 1])/2; //39
}else{
    median = input[Math.floor(input.length/2)]; //46
}
console.log(median);*/

let str = "Akhil Sharma Developer";
let ans = str.split(" ").map(word => word[0]).join("");
console.log(ans);//ASD

/*arr with collection objects your task is to use map, reduce, filter to find average in each category and return categories and it's average whose average is greater then 50*/
// employee=[
//     {name, salary:5000, department:'IT'}
// ]