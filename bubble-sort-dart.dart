void main() {
  List<int> numbers = [1, 200, 3, 4, 5, 67, 54, 0, 12];

  int varible;

  for (int j = 0; j < numbers.length; j++) {
    for (int i = 0; i < numbers.length; i++) {
      if (i + 1 < numbers.length) {
        if (numbers[i] > numbers[i + 1]) {
          varible = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = varible;
        }
      }
    }
  }

  print(numbers);
}
