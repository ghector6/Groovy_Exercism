class Hamming {

    def distance(strand1, strand2) {
      if (strand1.length() != strand2.length()) {
        throw new ArithmeticException("Tu cola")
      }
      def result = 0
      for (int i = 0; i < strand1.length(); i++){
        if (strand1[i] != strand2[i]){
          result++
        }
      }
      return result as int
    }

}
