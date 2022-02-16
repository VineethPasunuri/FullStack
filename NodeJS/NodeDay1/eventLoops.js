let x = 25;
let y = 35;
let z = x + y;
console.log(`z = ${z}`);
setTimeout(() => {
    console.log('this is inside callback');
}, 1000);
console.log('LAst Line!')