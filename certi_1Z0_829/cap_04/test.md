
```java
// Métodos para ir hacia atrás en el tiempo con LocalDateTime
var date = LocalDate.of(2024, Month.JANUARY, 20);
var time = LocalTime.of(5, 15);
var dateTime = LocalDateTime.of(date, time);
System.out.println(dateTime);      // 2024-01-20T05:15
dateTime = dateTime.minusDays(1);
System.out.println(dateTime);      // 2024-01-19T05:15
dateTime = dateTime.minusHours(10);
System.out.println(dateTime);      // 2024-01-18T19:15
dateTime = dateTime.minusSeconds(30);
System.out.println(dateTime);      // 2024-01-18T19:14:30
```

La línea 25 imprime la fecha original del 20 de enero de 2024 a las 5:15 a.m. La línea 26 resta un día completo, llevándonos al 19 de enero de 2024 a las 5:15 a.m. La línea 28 resta 10 horas, mostrando que la fecha cambiará si las horas causan un ajuste, llevándonos al 18 de enero de 2024 a las 19:15 (7:15 p.m.). Finalmente, la línea 30 resta 30 segundos. Puede verse que de repente el valor mostrado empieza a mostrar segundos. Java es lo suficientemente inteligente para ocultar los segundos y nanosegundos cuando no los estamos usando.

Es común que los métodos de fecha y hora se encadenen. Por ejemplo, sin las declaraciones print, el ejemplo anterior podría reescribirse así:

```java
var date = LocalDate.of(2024, Month.JANUARY, 20);
var time = LocalTime.of(5, 15);
var dateTime = LocalDateTime.of(date, time)
    .minusDays(1)
    .minusHours(10)
    .minusSeconds(30);
```

Cuando tienes muchas manipulaciones que hacer, este encadenamiento resulta útil.

Hay dos formas en que los creadores del examen pueden intentar engañarte. ¿Qué crees que imprime esto?

```java
var date = LocalDate.of(2024, Month.JANUARY, 20);
date.plusDays(10);
System.out.println(date);
```

Imprime 20 de enero de 2024. Añadir 10 días fue inútil porque el programa ignoró el resultado. Cuando veas tipos inmutables, presta atención a esto.
