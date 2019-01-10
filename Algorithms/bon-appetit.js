// https://www.hackerrank.com/challenges/bon-appetit

function bonAppetit(bill, k, b) {
  const actualBill =
    bill
      .slice(0, k)
      .concat(bill.slice(k + 1, bill.length))
      .reduce((acc, i) => acc + i, 0) / 2;

  const output = b === actualBill ? 'Bon Appetit' : b - actualBill;
  console.log(output);
}
