class DifferenceOfSquares {
  private int num

    DifferenceOfSquares(num) {
      this.num = num
    }

    def squareOfSum() {
      def range = 1..num
      def total = 0
      range.each {n ->
        total += n
      }
      return total**2
    }

    def sumOfSquares() {
      def range = 1..num
      def total = 0
      range.each {n ->
        def squared = n**2
        total += squared
      }
      return total
    }

    def difference() {
      squareOfSum() - sumOfSquares()
    }

}
