package com.javarush.task.pro.task16.task1618;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* 
Лишь бы не запутаться
*/

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишите тут ваш код МОЙ КОД(не прошел,не перекидывает день при вычитании через полночь)
        /*long hours = (ZonedDateTime.now(fromZone).getHour())-(ZonedDateTime.now(toZone).getHour());
        long minutes = (ZonedDateTime.now(fromZone).getMinute())-(ZonedDateTime.now(toZone).getMinute());
        return fromDateTime.minusHours(hours).minusMinutes(minutes);*/

        //JavaRush
        ZonedDateTime fromZonedDateTime = fromDateTime.atZone(fromZone);
        ZonedDateTime toZonedDateTime = fromZonedDateTime.withZoneSameInstant(toZone);//*
        return toZonedDateTime.toLocalDateTime();
    }
}
/*
Метод withZoneSameInstant() класса ZonedDateTime используется для возврата копии этого объекта ZonedDateTime
путем изменения часового пояса и без указания момента времени. Этот метод основан на сохранении одного и того
 же момента, поэтому пробелы и перекрытия на локальной временной шкале не влияют на результат.
 */