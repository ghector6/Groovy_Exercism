class SecretHandshake {

  static List<String> commands(int number) {
    def binaryString = Integer.toBinaryString(number).reverse()
    def list = []

    binaryString.eachWithIndex {val, i ->
      if (val == "1"){
        if (i == 0){list << "wink"}
        if (i == 1){list << "double blink"}
        if (i == 2){list <<"close your eyes"}
        if (i == 3){list << "jump"}
      }
    }
    return list

  }
}
