function *genWithParam(x) {
    x++;
    yield x
    yield x/2;
}

var gwp = genWithParam(5);
console.log(gwp.next());
console.log(gwp.next());
console.log(gwp.next());

function *genNoParam() {
    var a = [1,2,3]
    yield a[0]
    yield a[1]
    yield a[2]
}

var gnp = genNoParam();
console.log(gnp.next('a'));
console.log(gnp.next('b'));
console.log(gnp.next());
console.log(gnp.next());

// results:
// { value: 6, done: false }
// { value: 3, done: false }
// { value: undefined, done: true }
// { value: 1, done: false }
// { value: 2, done: false }
// { value: 3, done: false }
// { value: undefined, done: true }
