# ***Fechas en Java***

## ***LocalDate***

Representa la fecha sin la hora

```java
LocalDate fechaHoy=LocalDate.now();
System.out.println(fechaHoy.toString());

LocalDate fecha=LocalDate.of(2024,1,12);
System.out.println(fecha.toString());//2024-1-12;
```

También se puede sumar y restar días

```java
LocalDate fechaPlus=fecha.plusDays(7);
System.out.println(datePlus.toString());//2022-1-19

LocalDate fechaMin=fecha.minusDays(7);
System.out.println(fechaMin.toString());//2022-1-5
```