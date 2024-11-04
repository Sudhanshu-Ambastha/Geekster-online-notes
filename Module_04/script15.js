let logIn = true;
function log(){
    let p1 = new Promise(function(res,rej){
        if(logIn === true){
            res("You are logged in");
        }else{
            rej("You are not logged in");
        }
    });
    return p1;
}

log();

p1.then((msg)=>{
    console.log(msg);
})
.catch((msg)=>{
    console.log(msg);
})

// promises.all() -> will take an arr of promises

let promise1 = new Promise((resolve)=>{
    setTimeout(()=>resolve('promise 1 resolved'),1000);
})
let promise2 = new Promise((resolve)=>{
    setTimeout(()=>resolve('promise 2 resolved'),500);
})
let promise3 = new Promise((resolve)=>{
    setTimeout(()=>resolve('promise 3 resolved'),800);
})
// for error
let promise4 = new Promise((resolve,reject)=>{
    setTimeout(()=>reject('promise 4 resolved'),100);
})

// let promiseArray = [promise1, promise2, promise3];
let promiseArray = [promise1, promise2, promise3, promise4];

// Promise.all(promiseArray) //show only error or arr of ok [promise 1 resolved, promise 2 resolved, promise 3 resolved]/ [promise 4 rejected]
// Promise.allSettled(promiseArray)  //show all even error and ok [promise 1 resolved, promise 2 resolved, promise 3 resolved, promise 4 rejected]
//Promise.race(promiseArray) //gives single response irrespective of pass or fail [promise 1 resolved]/[promise 1 rejected] gives one with least time which will be [promise 1 resolve]
// Promise.any(promiseArray) //show only ok [promise 1 resolved]
.then((result)=>{
    console.log(results);
}).catch((error)=>{
    console.log(error);
})

