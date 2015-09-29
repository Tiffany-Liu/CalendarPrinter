public class CalendarPrinter {
    public static void main (String [] args) {

  int x=1;
   for (x=1; x<31; x++) {
       if (x==5||x==6||x==12||x==13||x==19||x==20||x==26||x==27){
        System.out.println ("September "+x+" - WEEKEND");
        x=x++;
       }
        else if (x==7){
         System.out.println ("September "+x+" - NO SCHOOL (LABOR DAY)");
         x=x++;
        }
        else if (x==25){
          System.out.println ("September "+x+" - END OF MARKING PERIOD");
          x=x++;
        }
        else {
         System.out.println ("September "+x);
         x=x++;
        };
        }
       };
       
       
       
       
   }
   
 
