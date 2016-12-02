// https://www.hackerrank.com/challenges/30-data-types

// Declare second integer, double, and String variables.
var i2, d2, s2;

// Read and save an integer, double, and String to your variables.
i2 = parseInt(input_stdin_array[0], 10);
d2 = parseFloat(input_stdin_array[1]);
s2 = input_stdin_array[2];

// Print the sum of both integer variables on a new line.
console.log(i + i2);

// Print the sum of the double variables on a new line.
console.log((d + d2).toFixed(1));

// Concatenate and print the String variables on a new line
// The 's' variable above should be printed first.
console.log(s + s2);
