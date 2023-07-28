class SecretHandshake {

    static List<String> commands(int number) {
      def binaryString = Integer.toBinaryString(number).reverse()
      if (binaryString[0] == "1"){
        return ["wink"]
      }else if (binaryString[1]){
        return ["double blink"]
      }

    }
}
