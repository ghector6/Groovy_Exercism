class SecretHandshake {

  static List<String> commands(int number) {
    def binaryString = Integer.toBinaryString(number).reverse()
    def list = binaryString.toList().collect { bit, index ->
      if (bit == '1' && index == 0) {
        "wink"
      } else if (bit == '1' && index == 1) {
        "double blink"
      } else if (bit == '1' && index == 2) {
        "close your eyes"
      } else if (bit == '1' && index == 3) {
        "jump"
      } else {
        "" // Return an empty string for other cases
      }
    }.findAll { it != "" } // Remove any empty strings from the list
    list
  }
}

def foo = SecretHandshake.commands(4)
println(foo)

