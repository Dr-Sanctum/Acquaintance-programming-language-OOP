package HomeWork.Sem6.hw1;

public class UnlockerFree<T> implements Unlocker<T> {
    int mode = 0;

    @Override
    public Boolean unlock(T input) {
            return true;
    }
}
