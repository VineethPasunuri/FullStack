let app = require("express")();
let Mysql = require('mysql');
let bodyParser = require('body-parser');
const dbURL = "mysql://root:root@localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700";
const connection = Mysql.createConnection(dbURL);

connection.connect((err)=>{
    if(err)throw err;
    console.log('Connected to Mysql Server !');
});
let port = 9098;
app.listen(port, () => console.log(`Node server running in ${port}`));
app.use([bodyParser.text(), bodyParser.json()]);
let sql =`UPDATE employee SET name =?, salary=? WHERE id=?`;
let data=["sanket",12000,16];

// retriving all the records
app.get('/users', (request, response) => {
    const dbURL = "mysql://root:root@localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700";
    const connection = Mysql.createConnection(dbURL);
        var query = "SELECT * FROM employee";
        connection.query(query, (err, rows,results)=>{
            if(err)throw err;
            console.log(`The data from users are : ${rows}`);
           
             response.json(rows);

        }); 
        connection.end();
    });

app.get('/user/:id', (request, response) => {
    const dbURL = "mysql://root:root@localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700";
    const connection = Mysql.createConnection(dbURL);
        let id = parseInt(request.params.id);
        var query = `SELECT * FROM employee where id=${id}`;
        connection.query(query, (err, rows,results)=>{
            if(err)throw err;
            console.log(`The data from users are : ${rows}`);
          
             response.json(rows);
        }); 
        connection.end();
    });

app.post('/user', (request, response) => {
    connection.connect((err) => {
        let id = parseInt(request.query.id);
        let name = request.query.name;
        let salary = parseInt(request.query.salary);
        if(err) throw err;
        console.log(`connected!`);
       // var query = `INSERT INTO employee(id,name, salary) VALUES (${request.query.id},${request.query.name},${request.query.salary})`;
        var query = `INSERT INTO employee(id, name , salary) VALUES (${id}, '${name}' ,${salary})`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
            connection.commit();
             response.send(`Data Stored Successfully`);
        }); 
        connection.end();
    });
});

app.put('/user/:id/:name/:salary', (request, response) => {
    connection.connect((err) => {
        let id = parseInt(request.params.id);
        let name = request.params.name;
        let salary = parseInt(request.params.salary);
        if(err) throw err;
        console.log(`connected!`);
        var query = `UPDATE employee SET name = '${name}', salary=${salary} where id =${id}`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
            connection.commit();
            connection.end();
             response.send(`Data Updated Successfully`);
        }); 
    });
});
app.delete('/user/:id', (request, response) => {
    connection.connect((err) => {
        let id = parseInt(request.params.id);
        if(err) throw err;
        console.log(`connected!`);
        var query = `DELETE FROM employee where id =${id}`;
        connection.query(query, (err, results)=>{
            if(err)throw err;
             //console.log(`Query successfilly executed : ${results}` );
             connection.commit();
             connection.end();
             response.send(`Data Deleted Successfully `);
        }); 
    });
});