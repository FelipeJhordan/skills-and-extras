const { Transform } = require('stream')

const upperCaseTr = new Transform({
    transform(chunk, encoding, callback) {
        this.push(chunk.toString().toUpperCase(0))
        callback()
    }
})


process.stdin.pipe(upperCaseTr).pipe(process.stdout)