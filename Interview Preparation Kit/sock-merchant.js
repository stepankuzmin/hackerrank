// https://www.hackerrank.com/challenges/sock-merchant

function sockMerchant(n, ar) {
  const { pairs } = ar.reduce(
    (acc, i) => {
      if (acc[i]) {
        acc[i] = false;
        acc.pairs = acc.pairs + 1;
      } else {
        acc[i] = true;
      }

      return acc;
    },
    { pairs: 0 }
  );

  return pairs;
}
