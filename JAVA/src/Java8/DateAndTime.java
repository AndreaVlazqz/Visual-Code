package Java8;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args){
        String userDate = JOptionPane.showInputDialog("Enter your birthday");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(userDate,dateFormat);
        DayOfWeek dayName = parsedDate.getDayOfWeek();
        System.out.println("The day was: " + dayName);
        Month monthName = parsedDate.getMonth();
        System.out.println("The month was: " + monthName);
        int day = parsedDate.getDayOfMonth();

        switch (monthName){
            case JANUARY: if (day<= 19){
                System.out.println("The Zodiac sign is: Capricorn");
            }
                if (day >= 20 && day<= 31){
                    System.out.println("The Zodiac sign is: Aquarium");
                }
                break;
            case FEBRUARY: if (day<= 18){
                System.out.println("The Zodiac sign is: Aquarium");
            }
                if (day >= 19 && day<= 28){
                    System.out.println("The Zodiac sign is: Pisces");
                }
                break;
            case MARCH: if (day<= 20){
                System.out.println("The Zodiac sign is: Pisces");
            }
                if (day >= 21 && day<= 31){
                    System.out.println("The Zodiac sign is: Aries");
                }
                break;
            case APRIL: if (day<= 19){
                System.out.println("The Zodiac sign is: Aries");
            }
                if (day >= 20 && day<= 30){
                    System.out.println("The Zodiac sign is:Taurus ");
                }
                break;
            case MAY: if (day<= 20){
                System.out.println("The Zodiac sign is: Taurus");
            }
                if (day >= 21 && day<= 31){
                    System.out.println("The Zodiac sign is: Gemini");
                }
                break;
            case JUNE: if (day<= 20){
                System.out.println("The Zodiac sign is: Gemini");
            }
                if (day >= 21 && day<= 30){
                    System.out.println("The Zodiac sign is: Cancer");
                }
                break;
            case JULY: if (day<= 22){
                System.out.println("The Zodiac sign is: Cancer");
            }
                if (day >= 23 && day<= 31){
                    System.out.println("The Zodiac sign is: Leo");
                }
                break;
            case AUGUST: if (day<= 22){
                System.out.println("The Zodiac sign is: Leo");
            }
                if (day >= 23 && day<= 31){
                    System.out.println("The Zodiac sign is: Virgo");
                }
                break;
            case SEPTEMBER: if (day<= 22){
                System.out.println("The Zodiac sign is: Virgo");
            }
                if (day >= 23 && day<= 30){
                    System.out.println("The Zodiac sign is: Libra");
                }
                break;
            case OCTOBER: if (day<= 22){
                System.out.println("The Zodiac sign is: Libra");
            }
                if (day >= 23 && day<= 31){
                    System.out.println("The Zodiac sign is: Scorpio");
                }
                break;
            case NOVEMBER: if (day<= 21){
                System.out.println("The Zodiac sign is: Scorpio");
            }
                if (day >= 22 && day<= 30){
                    System.out.println("The Zodiac sign is: Sagittarius");
                }
                break;
            case DECEMBER: if (day<= 21){
                System.out.println("The Zodiac sign is: Sagittarius");
            }
                if (day >= 22 && day<= 31){
                    System.out.println("The Zodiac sign is: Capricorn");
                }
                break;
        }

    }
}
