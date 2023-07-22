class Hamming {

    def distance(strand1, strand2) {
      result = 0
      for (int i = 0; i < strand1.length(); i++){
        if (strand1[i] != strand2[i]){
          result++
        }
      }
      return result
    }

}
