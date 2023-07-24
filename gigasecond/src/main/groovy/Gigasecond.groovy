import java.time.*

class Gigasecond {

  public static final long gigaSec = 1_000_000_000

  static LocalDateTime add(LocalDate moment){
    this.add(moment.atStartOfDay())
  }


  static LocalDateTime add(LocalDateTime moment){
    moment.plusSeconds(gigaSec)
  }

}
