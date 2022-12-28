package HomeWork.Sem4;

public class BeginsWith implements IsGood<String> {
    String stringMemory;
    public BeginsWith(String stringMemory) {
        this.stringMemory = stringMemory;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(stringMemory);
    }
    
}
