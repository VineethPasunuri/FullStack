let fs = require('fs');
fs.readFile('rwFileSync.txt', 'utf8', (err, data) => {
    if (err) { throw err; }
    else {
        console.log(data.toString());
    }
});
console.log('Done reading File');