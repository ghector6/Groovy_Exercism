class Matrix {

  String str = ""
    Matrix(String asString) {
      this.str = asString
        //throw new UnsupportedOperationException('Method implementation is missing')
    }

    int[] row(int rowNumber) {
      str.split("\n")[rowNumber].split(" ").collect {it as int}
       // throw new UnsupportedOperationException('Method implementation is missing')
    }

    int[] column(int columnNumber) {
      str.split("\n").collect {it.trim().split(" ")}.collect {it[columnNumber] as int}

        //throw new UnsupportedOperationException('Method implementation is missing')
    }
}
