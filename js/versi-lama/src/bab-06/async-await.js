// async-await.js
var fs = require('fs');

if (process.argv.length <= 2) {
    console.log("Usage: " + __filename + " path/to/directory");
    process.exit(-1);
}

var path = process.argv[2];

function readDirContents(thePath) {

    promise = new Promise(function(resolve, reject) {
        fs.readdir(path, function(err, list) {
            if (err) {
                reject(err);
            } else {
                resolve(list);
            }
        });
    });

    return promise

}

var a = main();

async function main() {

    var rdir = await readDirContents(path)
        .then(list => {
            for (var i=0; i<list.length; i++) {
                console.log(list[i]);
            }
        })
        .catch(err => { console.log(err) });

    return rdir;

};
