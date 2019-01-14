// https://www.hackerrank.com/challenges/minimum-distances

function minimumDistances(a) {
  const groupIndexByValue = a.reduce((acc, item, index) => {
    if (!acc[item]) {
      acc[item] = [];
    }
    acc[item].push(index);
    return acc;
  }, {});

  const distances = Object.keys(groupIndexByValue)
    .filter(value => groupIndexByValue[value].length === 2)
    .map(value => {
      const [a, b] = groupIndexByValue[value];
      return b - a;
    });

  return distances.length > 0 ? Math.min(...distances) : -1;
}
