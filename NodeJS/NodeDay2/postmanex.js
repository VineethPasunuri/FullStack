let app = require('express')();
let port = 9090;
app.get('/', (request, response) => {
    response.send('Get Request');
});
app.post('/', (request, response) => {
    response.send('Post Request');
});
app.put('/', (request, response) => {
    response.send('Put Request');
});
app.delete('/', (request, response) => {
    response.send('Delete Request');
});
app.listen(port, () => console.log(`Listening to : ${port}`));