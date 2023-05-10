const fs = require('fs')

process.title="TestMemoryUsage"

const server = require('http').createServer({
    requestTimeout: 1000
})


server.on('request', (req, res) => {
    fs.readFile('./big.file', (err, data) => {
        if(err) throw err;

        // mandaria o arquivo de uma vez, consumiria muita memória do servidor
        // res.end(data)

        const src = fs.createReadStream('./big.file')
        src.pipe(res)
})
})





const PORT =  5555
server.listen(PORT)

