import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class ManageCard{
    private List<Card> cards;

    public ManageCard(){
        cards = new ArrayList<>();
    }
    public void addCard(Card card){
        cards.add(card);
    }

    public Card addHadCard(String code){
        return this.cards.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
    }

    public void showAllOfCards(){
        this.cards.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
    }

    public List<Card> showHistoryBorrowedOfStudent(String code){
        return this.cards.stream().filter(o -> o.getCode().equals(code)).collect(Collectors.toList());
    }
    
    public void delete(String code){
        long count =  this.cards.stream().filter(o -> o.getCode().equals(code)).count();
        while (count > 0) {
            Card card = this.cards.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
            cards.remove(card);
            count--;
        }
        if(count == 0){
            System.out.println("You have success card of student.");
        }
        
    }
}