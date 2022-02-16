let app = require('express')();
let port = 9090;
app.get('/', (request, response) => {
    response.send("Welcome this is Get function ")
});
app.get('/greet', (request, response) => {
    response.send('Greetings for the day')
})
app.listen(port, () => console.log(`Listening to port : ${port}`));