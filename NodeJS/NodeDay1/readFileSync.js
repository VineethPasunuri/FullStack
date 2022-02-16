let fs = require('fs');
// let data = 'This file is an Example of ' + ' Writing and reading file Synchronously';
let data = ' 2. This file is an Example of Writing and reading file Synchronously without using + \n';
fs.writeFileSync('rwFileSync.txt', data, { flag: 'a+' });
console.log('Writing data into file is completed');
console.log('Data written into file is');
console.log(fs.readFileSync('rwFileSync.txt', 'utf8'));