class Hamming {

    def distance(strand1, strand2) {
      if (strand1.isEmpty() || strand1 == strand2){
        return 0
      } else{
          def list1 = strand1.split("").toList()
          def list2 = strand2.split("").toList()
          def commons = list1.intersect(list2)
          def both = list1.plus(list2)
          both.removeElement(commons)
      }

    }


}
