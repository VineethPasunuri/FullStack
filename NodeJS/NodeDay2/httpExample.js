let http = require('http');
let port = 9090;
let server = http.createServer((request, response) => {
    console.log(request.url);
    response.writeHead(200, { 'content-type': 'text/html' });
    response.write('<h2> Welcome to Node Web </h2>')
    response.end();
});
server.listen(port, () => console.log(`Server is running on port ${port}`));