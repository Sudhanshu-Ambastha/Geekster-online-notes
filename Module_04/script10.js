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