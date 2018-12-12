import java.time.{OffsetDateTime, ZoneId}
import java.sql.Timestamp

//Current DateTime Eastern
val odt = OffsetDateTime.now(ZoneId.of("US/Eastern"))

//Convert OffsetDateTime to Different Timezone
//https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
val dt = odt.atZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime

//Convert OffsetDateTime to Timestamp
val ldt = odt.toLocalDateTime
val tm = Timestamp.valueOf(ldt)

//Format DateTime using Pattern
    val processDateTime = Instant.now()
    val formatter =
      DateTimeFormatter.ofPattern("MM-dd-yyyy-hhmmss")
        .withLocale( Locale.US )
        .withZone( ZoneId.of("Z") )
    formatter.format(processDateTime)