 class Palindrome {
  private static int canMakeAPalindrome(int number) {
    int[] frequencyArr = createFrequencyArray(number);

    int oddCharCount = 0;

    for (int ch : frequencyArr) {

      // Count characters with odd occurrence.
      if (ch % 2 != 0)
        oddCharCount++;

      // If more than one character in the string has odd occurrence then
      // palindrome cannot be formed from given string
      if (oddCharCount > 1)
        return 1;
    }

    return 2;
  }

  private static int[] createFrequencyArray(int number) {
    int[] frequencyArr = new int[256];

    char[] charArray = String.valueOf(number).toCharArray();

    for (char ch : charArray)
      frequencyArr[ch]++;

    return frequencyArr;
  }

  public static void main(String[] args) {
      int number=21251;
      System.out.println(canMakeAPalindrome(number));
    //System.out.println("Can palindrome be formed from " + canMakePalindrome(number));
  }

}