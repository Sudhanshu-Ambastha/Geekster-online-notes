// console.log("hii");

/*html collection, node list both of them are not arr,  but the diff between them is that we have the support of forEach loop in node list but not is html collection*/

// get elements by tag name
/*let h1 = document.getElementsByTagName("h1");
console.log(h1[0]);*/ //<h1>DOM is Amazing</h1>

// Get elements by id
/*let h1 = document.getElementById("head");
console.log(h1);*/ //<h1 id="head">Learning DOM</h1>

// get elements by className

// query Selector (used a lot)
/*let h1 = document.querySelector(".head");
console.log(h1);*/ //<h1 id="head">Learning DOM</h1>

/*let h1 = document.querySelector(".head");
console.log(h1);*/

// all (used a lot)

/*let convertedArr = Array.from(h1);
console.log(convertedArr);*/

let div = document.querySelector("#div1");
div.style.height = "200px";
div.style.width = "200px";
div.style.backgroundColor = "cyan";
div.innerText = "Hello";

let button = document.createElement("button");
console.log(button);
button.innerText = "Hit mee~"
div.appendChild(button);
// div.innerHTML = "<button id='btn'>Hit Me!!</button>"
console.log(div);