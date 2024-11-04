let h1 = document.querySelector("#h1");
console.log(h1);

const style = `
background: hotpink;
padding: 12px;
font-weight: 900;
font-size: 2rem;
`;
console.log('%cHello World!', style);

h1.addEventListener("click", function(){
    alert("h1 is clicked!!");
})