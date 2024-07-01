package org.example.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendatio = Calendar.getInstance();
        //los meses arrancan desde 0 0 = enero
        //calendatio.set(1970, Calendar.SEPTEMBER, 25, 20, 10);
        calendatio.set(Calendar.YEAR, 2020);
        calendatio.set(Calendar.MONTH, Calendar.JULY);
        calendatio.set(Calendar.DAY_OF_MONTH, 25);

        //calendatio.set(Calendar.HOUR_OF_DAY, 21);
        calendatio.set(Calendar.HOUR, 7);
        calendatio.set(Calendar.AM_PM, Calendar.PM);
        calendatio.set(Calendar.MINUTE, 20);
        calendatio.set(Calendar.SECOND, 10);
        calendatio.set(Calendar.MILLISECOND, 125);
        Date fecha = calendatio.getTime();
        System.out.println("calendatio = " + fecha);

        SimpleDateFormat farmato = new SimpleDateFormat("yyyy-MM-dd hh:mm:SSS a" );
        String fechaConFormato = farmato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
