// callback.js

var fs = require('fs');

// fs.readFile(file[, options], callback)
// file <string> | <Buffer> | <integer> filename or file descriptor
// options <Object> | <string>:
//      encoding <string> | <null> default = null
//      flag <string> default = 'r'
// callback <Function>

console.log('Start reading the file...');
fs.readFile('./pegawai.json', 'utf-8',  function(err, data) {
  if (err) throw err;
  console.log(data);
})
console.log('After reading the file ...');

// result:
//Start reading the file...
//After reading the file ...
//{
//  "pegawai": [
//    {
//      "id": "1",
//      "nama": "Zaky",
//      "alamat": "Purwomartani"
//    },
//    {
//      "id": "2",
//      "nama": "Ahmad",
//      "alamat": "Kalasan"
//    },
//    {
//      "id": "3",
//      "name": "Aditya",
//      "alamat": "Sleman"
//    }
//  ]
//}
