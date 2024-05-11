//object type in JS
let person = {
    name: "Neil Gerald Lapuz",
    age: 19,
};
console.log(person);

//Ternary Operator to shorten (if else) statement
var grade = 69;
let finalgrade = grade >=90 ? "A" : grade >=80 ? "B" : grade >= 70 ? "C" : "F";
console.log(finalgrade);

//array in JavaScript
let cars =["bmw", "toyota", "mercedes"];
console.log(cars);

//Destructuring Objects in JS
let me = {
    name: "Neil Gerald",
    age: 19,
    bday: "June 29, 2004",
    todaydate: new Date(),
};
let {name, age,bday, todaydate} = me;
console.log(name,age,todaydate);

//Destructuring Arrays in JS
let company =["aston", "toyota", "mercedes"];
let [uk, japan, germany] = company;
console.log(germany,uk,japan);

//Spread Operator (three dots "...")
let body = ["head", "arm"];
let compbody = [...body, "legs", "toes"];
console.log(compbody);

//Spread Operator in Objects
let trops = {
    name: "bry",
    age: 20,
};

let couple = {
    ...trops,
    bebenibry: "nini",
    ageniNini: 19,
};
console.log(couple);

//Spread Operator in a Function
let numbers = [2,5];
function product (a,b){
return a * b;
}

console.log(product(...numbers));

//Push Method in array JS
let fruits = ["banana","apple","grapes"];
fruits.push("mango");
console.log(fruits);

//Pop Methos in array JS
//Pop Method removes the last value in the array 
//Shift Method removes the first value in the array
let food = ["chicken", "beef", "tomato"];
food.pop();
console.log(food);

//Splice Method in array JS
//Splice is to add or delete certain thing in the array
const month = ["Jan","March", "April", "June"];
month.splice(1,0, "Feb");
month.splice(4,1,"May");
console.log(month);

//Include Method in array JS
//Include method ensure if the value is in the array
const months = ["Jan","March", "April", "June"];
console.log(months.includes("Jan"));

//Slice Method in array JS
//Shallow copy of the array
//Slice method will show in the output all the values that started from the starting point
let days =["Mon","Tues","Wed","Thurs","Fri","Sat","Sun"];
console.log(days.splice(2));
