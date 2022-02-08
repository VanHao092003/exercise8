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

<<<<<<< HEAD
    public List<Card> showHistoryBorrowedOfStudent(String code){
        return this.cards.stream().filter(o -> o.getCode().contains(code)).collect(Collectors.toList());
=======
    public Card showHistoryBorrowedOfStudent(String code){
       Card card = this.cards.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
       if(card != null){
           return card;
       } else{
           return null;
       }
>>>>>>> e31a52713bb1582812c801a2f31f8dfabdb179a6
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