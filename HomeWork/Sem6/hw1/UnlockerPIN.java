package HomeWork.Sem6.hw1;

public class UnlockerPIN<T> implements Unlocker<T> {
    int mode = 1;
    int pin = 1234;

    @Override
    public Boolean unlock(T input) {
        if ((int)input == pin) {
            return true;
        }
        return false;
    }
}
