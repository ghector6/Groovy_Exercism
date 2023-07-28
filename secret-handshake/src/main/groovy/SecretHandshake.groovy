class SecretHandshake {

    static List<String> commands(int number) {
      def binaryString = Integer.toBinaryString(number).reverse()
      if (binaryString[0] == "1"){
        return ["wink"]
      }else if (binaryString[1] == "1"){
        return ["double blink"]
      }else if (binaryString[2] == "1"){
        return ["close your eyes"]
      }else if (binaryString[3] == "1"){
        return ["jump"]
      }
    }
}
