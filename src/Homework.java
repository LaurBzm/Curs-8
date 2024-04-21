import java.time.LocalDate;
import java.time.Period;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Laur", 46);
        Person person2 = new Person("Nicolae", 6);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
    }

    private static class Person {
        public Person(String laur, int i) {
        }

        public boolean getName() {
            return false;
        }

        public Object getAge() {
            return null;
        }
    }
}

       public class JavaLocalDate {

            public static void main(String[] args) {

                LocalDate from = LocalDate.of(2020, 4, 20);
                LocalDate to = LocalDate.of(2020, 1, 1);

                Period period = Period.between(from, to);

                System.out.print(period.getYears() + " years,");
                System.out.print(period.getMonths() + " months,");
                System.out.print(period.getDays() + " days");

            }
        }

