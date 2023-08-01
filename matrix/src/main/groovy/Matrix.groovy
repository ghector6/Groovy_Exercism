class Matrix {

  String str = ""
    Matrix(String asString) {
      this.str = asString
    }

    int[] row(int rowNumber) {
      str.split("\n")[rowNumber].split(" ").collect {it as int}
    }

    int[] column(int columnNumber) {
      str.split("\n").collect {it.trim().split(" ")}.collect {it[columnNumber] as int}
    }
}
