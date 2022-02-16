let fs = require('fs');
let object = {
    employee: []
};
object.employee.push({ name: 'vineeth', age: 24 });
fs.writeFile('myJsonFile.json', json, 'utf8', callback);
console.log('DONE');