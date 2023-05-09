const fs = require('fs')
const file  = fs.createWriteStream('./big.file')


for(let i = 0; i < 10000000; i++) {
    file.write('Loren ipsun dolor sit amet, consectetur adipsic')
}


file.end()
