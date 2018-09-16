if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'hello'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'hello'.");
}
var hello = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    var scope = 'world';
    println('Hello, world!');
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('hello', _);
  return _;
}(typeof hello === 'undefined' ? {} : hello, kotlin);
