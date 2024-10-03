/***************************    Day2    ***************************/

// console.log("Hello World");

/*let a = 10;
a=1;
var b = 20;   //can be redeclared
b=2; */

/*const c = 30;  
c=3;*/ //can't be redeclared
// console.log(a,b,c);

//Data type:- null is non primitive
// let a = 20; //number
// let b = true; //boolean
// let c = "SA"; //string
// let d = null; //Object as everything in js behave like an object and if we resolve it, it will lead to lose of so many func of js 
// let e = undefined; //undefined
// let f = BigInt(746358347); //bigint
// let g = Symbol("SA"); //symbol
// let h = null; 
// console.log(typeof a, typeof b, typeof c, typeof d, typeof e, typeof f, typeof g, typeof h); /*output: number boolean string object undefined bigint symbol undefined*/
// console.log(typeof a, typeof b, typeof c, typeof d, typeof e, typeof f, typeof g, h); /*output: number boolean string object undefined bigint symbol null*/
// console.log(BigInt, Symbol); /* output: [Function: BigInt] [Function: Symbol]*/
// h = "SA";

/*creation of an object*/
let player = {
    name:"SKA",
    age: "20",
    marks: 100,
    hobbies:["cricket", "football", "reading"],
    rollNo:21,
}

// for(let key in player){
//   delete player[key];
// }


/*add an object*/
/*player.stats = {matchesPlayed: 50};
console.log(player);*/
//output of adding the player
/*{
  name: 'SKA',
  age: '20',
  marks: 100,
  hobbies: [ 'cricket', 'football', 'reading' ],
  rollNo: 21,
  stats: { matchesPlayed: 50 }
}*/

//update an object              
/*player.name = "sa";
player.age = 21;
console.log(player);*/

/*updated arr of player as output*/
/*{
  name: 'sa',
  age: 21,
  marks: 100,
  hobbies: [ 'cricket', 'football', 'reading' ],
  rollNo: 21
}*/

/*delete an object*/
/*delete player.marks;
console.log(player);*/

/*reading an object*/
// console.log(player.hobbies);/*[ 'cricket', 'football', 'reading' ]*/
// console.log(player.hobbies[1]);/*football*/

/*let arr = [];
arr['a'] = 3;
arr['b'] = 6;
console.log(arr.length);*/ //0