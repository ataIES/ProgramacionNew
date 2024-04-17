# ***Fechas en Java***

## ***LocalDate***

* Representa la fecha sin la hora

```java
LocalDate fechaHoy=LocalDate.now();
System.out.println(fechaHoy.toString());

LocalDate fecha=LocalDate.of(2024,1,12);
System.out.println(fecha.toString());//2024-1-12;
```

* También se puede sumar y restar días

```java
LocalDate fechaPlus=fecha.plusDays(7);
System.out.println(datePlus.toString());//2022-1-19

LocalDate fechaMin=fecha.minusDays(7);
System.out.println(fechaMin.toString());//2022-1-5
```

* Determinar si una fecha es anterior o posterior a otra

```java
LocalDate fechaVencimiento=LocalDate.parse(new Scanner(System.in).nextLine();

public boolean vencida() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }
```

## ***LocalTime***

* Es similar a LocalDate y representa hora sin la fecha

```java
LocalTime horaActual=LocalTime.now();
System.out.println(horaActual);

LocalTime hora=LocalTime.of(6,30);
System.out.println(hora);// 06:30;
```

* Sumar o restar horas o cualquier otro tipo de unidad como segundo

```java
LocalTime horaPlus= hora.plus(1,ChronoUnit.HOURS);
System.out.println(hora);//07:30

LocalTime horaMin= hora.minus(60, ChronoUnit.SECONDS);
System.out.println(horaMinus);//06:29;
```

* Comparar si una hora es mayor o no que otra

```java
boolean antes=LocalTime.parse("08:30).isBefore(LocalTime.parse("10:20"));
System.out.println(antes);
```

## ***LocalDateTime***

* Es la combinación de la fecha y la hora

```java
LocalDateTime fechaHoraHoy=LocalDateTime.now();
System.out.println(fechaHoraHoy);

LocalDateTime fechaHora=LocalDateTime.of(2022,Month.NOVEMBER,20,8,30);
System.out.println(fechaHora);
```
* También se puede sumar y restar

```java
LocalDateTime fechaHoraPlus=fechaHora.plusDays(5);
System.out.println(fechaHoraPlus);
```

---

## ***Period***

Puedes obtener la diferencia entre dos fechas o para modificar valores de alguna fecha

```java
LocalDate fechaInicio = LocalDate.of(2022, 10, 10);
LocalDate fechaFin = fechaInicio.plus(Period.ofDays(500));

int diffDays = Period.between(fechaInicio, fechaFin).getDays();
int diffMonths =Period.between(fechaInicio, fechaFin).getMonths();
int diffYears =Period.between(fechaInicio, fechaFin).getYears();

System.out.println("Años: "+diffYears+" Meses: "+diffMonths+" Dias: "+diffDays);
long aux=ChronoUnit.DAYS.between(fechaInicio, fechaFin);
System.out.println("Dias entre dos fechas: "+aux);
```

## ***Duration***

Duration es equivalente a Period pero para las horas

```java
LocalTime startLocalTime = LocalTime.of(8, 30);
LocalTime endLocalTime = startLocalTime.plus(Duration.ofHours(3)); // 11:30

long diffSeconds = Duration.between(startLocalTime, endLocalTime).getSeconds();
System.out.println(diffSeconds); // 10800 seconds
```

## ***DateTimeFormatter***

```java
LocalTime hora = LocalTime.now();
DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
System.out.println(hora.format(f));
```

También se puede introducir por teclado

```java
Scanner teclado=new Scanner(System.in);
System.out.println("Introduce la fecha con formato dd-mm-yyyy:");
DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDate fecha=LocalDate.parse(teclado.nextLine(), f);
```

Podemos transformar las fechas a castellano con el método withLocale()

```java
 String formatoFecha = "";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es", "ES"));

        formatoFecha = fecha.format(formato);
        return formatoFecha;
```

Con LocalDateTime

```java 
LocalDateTime fechaConHora=LocalDateTime.now();
DateTimeFormatter esDateFormatLargo= DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'a las' hh:mm:ss") .withLocale(new Locale("es", "ES"));

System.out.println("Formato español (largo, localizado): " +
fechaConHora.format(esDateFormatLargo));
```

## ***Calendar***

Calendar es abstracta

```java
Calendar hoy=Calendar.getInstance();
System.in.nextLine();

//de una forma más legible
System.out.println("Hoy es -pero un poco mas claro- "+hoy.getInstance());
```
También podemos obtener el año, el mes o el día

```java
System.out.println("Vivimos en el año: "+hoy.get(Calendar.YEAR));
System.out.println("Vivimos en el mes: "+hoy.get(Calendar.MONTH));
System.out.println("Vivimos en el dia: "+hoy.get(Calendar.DATE));
```

Podemos asignar con set la fecha

```java
Calendar fecha1=Calendar.getInstance();
fecha1.set(2024, 6, 7);
System.out.println("Ese día será: "+fecha1.getTime());

//otra manera más
Calendar ponerDia=Calendar.getInstance();
ponerDia.set(Calendar.YEAR, 2024);
ponerDia.set(Calendar.MONTH, 3);
ponerDia.set(Calendar.DATE, 23);
System.out.println("El día de referencia es: "+ponerDia.getTime());
```




