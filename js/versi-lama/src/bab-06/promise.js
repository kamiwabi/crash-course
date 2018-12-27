// promise.js
var fs = require('fs');
 
if (process.argv.length <= 2) {
    console.log("Usage: " + __filename + " path/to/directory");
    process.exit(-1);
}
 
var path = process.argv[2];
 
function readDirContents() {
    return new Promise(
        function(resolve, reject) {
            fs.readdir(path, function(err, list) {
                if (err) {
                    reject(err);
                } else {
                    resolve(list);
                }
            })
        }
    )
}

readDirContents()
    .then(list => {
        for (var i=0; i<list.length; i++) {

            var fullName = path + '/' + list[i];
            var newFullName = fullName + '.txtp';

            fs.rename(fullName, newFullName, (err) => {
                if (err) throw err;
            });
        }
    })
    .catch(err => { console.log(err) });

