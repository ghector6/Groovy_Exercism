class SecretHandshake {

  static List<String> commands(int number) {
    def binaryString = Integer.toBinaryString(number).reverse()
    def list = []
    def reversedList =  false

    binaryString.eachWithIndex {val, i ->
      if (val == "1"){
        if (i == 0){list << "wink"}
        if (i == 1){list << "double blink"}
        if (i == 2){list <<"close your eyes"}
        if (i == 3){list << "jump"}
        if (i == 4){reversedList = true }
      }
    }
    if (reversedList){
      list = list.reverse()
    }
    return list

  }
}
