let fs = require('fs');
let url = require('url');
let http = require('http');
let port = 9090;
var server = http.createServer((request, response) => {
    var q = url.parse(request.url, true);
    var filename = "." + q.pathname;
    fs.readFile(filename, (err, data) => {
        if (err) {
            response.writeHead(404, { 'content-type': 'text/html' });
            return response.end('404 Error');
        }
        else {
            response.writeHead(200, { 'content-type': 'text/html' });
            response.write(data);
            return response.end();
        };
    });
});
server.listen(port, () => console.log(`Server Started in port: ${port}`));