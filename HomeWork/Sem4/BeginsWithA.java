package HomeWork.Sem4;

public class BeginsWithA implements IsGood<String> {

    @Override
    public boolean isGood(String item) {
        
        return item.charAt(0) == 'A';
    }
    
}
