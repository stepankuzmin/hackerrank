// https://www.hackerrank.com/challenges/repeated-string

function count_a(s) {
  return s.split("").reduce((acc, c) => (c === "a" ? acc + 1 : acc), 0);
}

function repeatedString(s, n) {
  const len = s.length;
  const count_of_s_in_n = Math.floor(n / len);
  const subs = s.slice(0, n - count_of_s_in_n * len);
  return count_of_s_in_n * count_a(s) + count_a(subs);
}
