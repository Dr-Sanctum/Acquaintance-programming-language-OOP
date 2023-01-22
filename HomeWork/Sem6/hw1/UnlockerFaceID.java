package HomeWork.Sem6.hw1;

public class UnlockerFaceID<T> implements Unlocker<T> {
    int mode = 3;
    String faceID = "adsg46";

    @Override
    public Boolean unlock(T input) {
        if (((String)input).equals(faceID)) {
            return true;
        }
        return false;
    }
}
