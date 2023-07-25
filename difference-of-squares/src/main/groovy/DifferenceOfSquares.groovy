class DifferenceOfSquares {
  private int num

    DifferenceOfSquares(num) {
      this.num = num
        //throw new UnsupportedOperationException('Constructor implementation is missing')
    }

    def squareOfSum() {
      def range = 1..num
      def total = 0
      range.each {n ->
        total += n
      }
      return total**2
        //throw new UnsupportedOperationException('Method implementation is missing')
    }

    def sumOfSquares() {
      def range = 1..num
      def total = 0
      range.each {n ->
        def squared = n**2
        total += squared
      }
      return total
        //throw new UnsupportedOperationException('Method implementation is missing')
    }

    def difference() {
      squareOfSum() - sumOfSquares()
        //throw new UnsupportedOperationException('Method implementation is missing')
    }

}
