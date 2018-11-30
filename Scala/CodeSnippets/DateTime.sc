import java.time.{OffsetDateTime, ZoneId}

//Current DateTime Eastern
val odt = OffsetDateTime.now(ZoneId.of("US/Eastern"))

//Convert OffsetDateTime to Different Timezone
//https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
val dt = odt.atZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime