const { Readable } = require('stream')

const inStream = new Readable({
    read() {}
})

inStream.push('ABCDEFGHIJKLMN')
inStream.push('NOPQRSTUVWXYZ')

inStream.push(null)

inStream.pipe(process.stdout)