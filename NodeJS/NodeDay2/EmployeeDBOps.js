let app = require("express")();
let MongoClient = require("mongodb").MongoClient;
let dbURL = "mongodb://localhost:27017";
let port = 9092;
app.listen(port, () => console.log(`Server running on port : ${port}`));
// To fetch all the records
app.get('/employee', (request, response) => {
    MongoClient.connect(dbURL, { useNewUrlParser: true }, (err, client) => {
        if (!err) {
            let db = client.db('learning');
            let doc = db.collection("employee").find();
            let arrayOfEmployees = [];
            let count = 0;
            doc.forEach((record) => {
                arrayOfEmployees.push(record);
                count++;
            }, () => {
                if (count == 0) {
                    response.json({ error: 'No record found' });
                }
                else {
                    response.json(arrayOfEmployees);
                }
                client.close();
            });
        }
    });
});