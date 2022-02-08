import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        Date day = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ManageCard manageCard = new ManageCard();
        while (true) {
            System.out.println("----------------------choose command--------------------------");
            System.out.println("Enter 1: To add in system.");
            System.out.println("Enter 2: To delete card.");
            System.out.println("Enter 3: To show all card and information of student.");
            System.out.println("Enter 4: To show history of card.");
            System.out.println("Enter 5: To exit.");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":{
                    System.out.println("----------------------choose command--------------------------");
                    System.out.println("Enter 1: To add new card for new student.");
                    System.out.println("Enter 2: To extra for student who already have a card.");
                    System.out.println("Enter 3: To exit.");
                    String choose1 = scanner.nextLine();
                    switch (choose1) {
                        case "1":{
                            System.out.println("---------------Enter information of student-------------------");
                            System.out.print("name: "); String name = scanner.nextLine();
                            System.out.print("age: "); int age = scanner.nextInt(); scanner.nextLine();
                            System.out.print("class: "); String class_ = scanner.nextLine();
                            System.out.println("---------------information card of student---------------");
                            System.out.print("code card: "); String code  = scanner.nextLine();
                            System.out.print("Bookstore number: "); int bookstoreNumber = scanner.nextInt(); scanner.nextLine();
                            System.out.println("Borrowed day: " + dateFormat.format(day));
                            String borrowedDay = dateFormat.format(day);
                            System.out.print("Number borrowed day: "); int numberBorrowedDay = scanner.nextInt(); scanner.nextLine();
                            calendar.setTime(dateFormat.parse(borrowedDay));
                            calendar.add(Calendar.DATE, numberBorrowedDay);
                            String payDay = dateFormat.format(calendar.getTime());
                            Student card = new Card( name, age, class_, code, bookstoreNumber, borrowedDay, payDay);
                            System.out.println(card.toString());
                            manageCard.addCard((Card)card);
                            break;
                        }
                            
                        case "2":{
                            System.out.print("code card: "); String code  = scanner.nextLine();
                            System.out.println("---------------information card of student---------------");
                            System.out.print("Bookstore number: "); int bookstoreNumber = scanner.nextInt(); scanner.nextLine();
                            System.out.println("Borrowed day: " + dateFormat.format(day));
                            String borrowedDay = dateFormat.format(day);
                            System.out.print("Number borrowed day: "); int numberBorrowedDay = scanner.nextInt(); scanner.nextLine();
                            calendar.setTime(dateFormat.parse(borrowedDay));
                            calendar.add(Calendar.DATE, numberBorrowedDay);
                            String payDay = dateFormat.format(calendar.getTime());
                            Card cardCache = manageCard.addHadCard(code);
                            Student card = new Card(cardCache.getName(), cardCache.getAge(), cardCache.getClass_(), cardCache.getCode(), bookstoreNumber, borrowedDay, payDay);
                            System.out.println(card.toString());
                            manageCard.addCard((Card)card);
                            break;
                        }
                        case "3":{
                            return;
                        }
                        default:
                            System.out.println("Invalid.");
                            break;
                    }
                    break;
                }
                case "2":{
                    System.out.print("code card you want to delete: "); String code  = scanner.nextLine();
                    manageCard.delete(code);
                    break;
                }   
                case "3":{
                    manageCard.showAllOfCards();
                    break;
                }
                case "4":{
                    System.out.print("code card you want to show history: "); String code  = scanner.nextLine();
                    manageCard.showHistoryBorrowedOfStudent(code);
                    break;
                }
                case "5":{
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Invalid!!");
                    break;
            }
        }
            
    }
}
