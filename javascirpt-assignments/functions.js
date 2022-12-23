/* 
Q1. Write a program to demonstrate how a function can be passed as a parameter to another function.
Q2. An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments. For the arguments Roger and Waters, the function returns ‘RW’. Write this function.
Submit the github link to the code
*/

//question 1

function even(n) {
    return !(n & 1);
}
function odd(n) {
    return n & 1;
}
function five(n) {
    return n % 5 == 0;
}

function filterArray(arr, filterFunction) {
    const ans = [];
    for (const i of arr) {
        if (filterFunction(i)) ans.push(i);
    }
    return ans;
}

const arr = [
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
];

const ans = filterArray(arr, even);
console.log(ans);

//question 2

const fnAndLn = (fn, ln) => {
    return fn[0] + ln[0];
};
console.log(fnAndLn("Roger", "Waters"));
