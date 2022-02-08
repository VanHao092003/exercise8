import java.util.ArrayList;
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

    public void showHistoryBorrowedOfStudent(String code){
        this.cards.stream().filter(o -> o.getCode().equals(code)).forEach(o -> System.out.println(o.toString()));
    }
    
    public void delete(String code){
        Card card =  this.cards.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
        if(card != null){
            card.toString();
            cards.remove(card);
        } else{
            System.out.println("There are no value of the code at this list card.");
        }
    }
}