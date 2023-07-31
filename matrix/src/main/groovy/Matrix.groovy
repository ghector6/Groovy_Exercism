class Matrix {

  String str = ""
    Matrix(String asString) {
      this.str = asString
        //throw new UnsupportedOperationException('Method implementation is missing')
    }

    int[] row(int rowNumber) {
      str.collect {it as int}
       // throw new UnsupportedOperationException('Method implementation is missing')
    }

    int[] column(int columnNumber) {
        throw new UnsupportedOperationException('Method implementation is missing')
    }
}
