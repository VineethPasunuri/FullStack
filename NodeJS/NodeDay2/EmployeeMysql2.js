let app = require("express")();
//let cors = require('cors');
let bodyParser = require('body-parser');
const { request, response } = require("express");
let mysql = require("mysql");
//app.use(cors)
let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
mysqlConnection.connect((err) => {
    if (err) { throw err }
    else {
        console.log('Connection Established')
    }
})
let port = 9090;
app.listen(port, () => console.log(`Server Running on port : ${port}`));
app.use(bodyParser.json());
app.get('/employee', (request, response) => {
    let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
    mysqlConnection.query('select * from employee', (err, rows, fields) => {
        if (!err) {
            response.json(rows);
        }
        else {
            console.log(err);
        }
    });
    mysqlConnection.end();
});


app.post('/employee', (request, response) => {
    let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
    let data = { name: request.body.name, salary: request.body.salary };
    mysqlConnection.query(`insert into employee set ?`, data, (err, rows, fields) => {
        if (err) {
            throw err;
        }
        else {
            response.json("Inserted successfully");
        }
    })
    mysqlConnection.end()
})


app.put('/employee/.id', (request, response) => {
    let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
    // mysqlConnection.query('update employee set name = ?, salary = ? where id = ?', [request.body.name, request.body.salary, request.params.id], (err, rows, fields) => {
    mysqlConnection.query("update employee set name = 'Praneeth', salary = '76000' where id = ?", [request.params.id], (err, rows, fields) => {
        if (err) {
            throw err;
        }
        else {
            response.json('Updated');
        }
    })
    mysqlConnection.end();
})


app.delete('/employee/:id', (request, response) => {
    let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
    mysqlConnection.query(`delete from employee where id = ?`, [request.params.id], (err, rows, fields) => {
        if (err) {
            throw err;
        }
        else {
            response.json('Deleted');
        }
    })
    mysqlConnection.end();
})
app.get('/employee/:id', (request, response) => {
    let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
    mysqlConnection.query(`select * from employee where id = ?`, [request.params.id], (err, rows, fields) => {
        if (err) {
            throw err;
        }
        else {
            response.json(rows);
        }
    })
    mysqlConnection.end();
})