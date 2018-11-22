// https://www.hackerrank.com/challenges/counting-valleys

function countingValleys(_, s) {
  const steps = s.split("");

  const { valleys } = steps.reduce(
    (acc, step) => {
      const delta = step === "U" ? 1 : -1;
      acc.level = acc.level + delta;

      if (acc.level === 0 && step === "U") {
        acc.valleys += 1;
      }

      return acc;
    },
    { level: 0, valleys: 0 }
  );

  return valleys;
}
