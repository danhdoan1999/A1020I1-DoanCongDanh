const list : number[] = [1,2,3];
const category: Array<string> = ['sport','it','car'];
console.log('list');
list.forEach((num) => console.log(num.toFixed(4)) );
console.log("categories");
category.forEach((str) => console.log(str.includes('a')));

// convert mảng từ dạng này sang dạng khác.
const listSquare = list.map(num => num*num);
console.log(listSquare);

// lọc các phần tử thỏa mãn
const result = category.filter(str => str.length > 2);
console.log(result);
// Declare a tuple type
let x;
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
// x = [10, "hello"]; // Error
console.log(x[0].substr(1)); // OK
// console.log(x[1].substr(1));
// Error, Property 'substr' does not exist on type 'number'.
x[3] = "world";
// OK, 'string' can be assigned to 'string | number'
x[5] = 100.25;
console.log(x[5].toString());
// OK, 'string' and 'number' both have 'toString'
// x[6] = true; // Error, 'boolean' isn't 'string | number'

