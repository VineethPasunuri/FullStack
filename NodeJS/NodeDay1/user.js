let fs = require('fs');
let user = [{ name: 'Vineeth', age: 24 }, { name: 'Raj', age: 29 }];
user.push({ name: 'Ronith', age: 22 });
user.push({ name: 'Vincy', age: 11 });
let jsonUser = JSON.stringify(user);
fs.writeFile('user.json', jsonUser, (err) => {
    if (err) {
        throw err;
    }
    else {
        console.log("Data Added")
    }
});
console.log('LastLine')
fs.readFile('user.json', 'utf8', (err, data) => {
    if (err) {
        throw err;
    }
    else {
        const user = JSON.parse(data);
        for (let i = 0; i < user.length; i++) {
            console.log('JSON data : name = ' + user[i].name + ', age = ' + user[i].age);

        }
    }
})