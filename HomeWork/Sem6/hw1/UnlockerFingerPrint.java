package HomeWork.Sem6.hw1;

public class UnlockerFingerPrint<T> implements Unlocker<T> {
    int mode = 2;
    String fingerprint = "usadhfj2414";

    @Override
    public Boolean unlock(T input) {
        if (((String)input).equals(fingerprint)) {
            return true;
        }
        return false;
    }
}
