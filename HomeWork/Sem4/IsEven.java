package HomeWork.Sem4;

public class IsEven implements IsGood<Integer>{

    @Override
    public boolean isGood(Integer item) {
       
        return item%2 == 0;
    }
    
}
