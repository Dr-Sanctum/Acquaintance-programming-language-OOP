package HomeWork.Sem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

/**
 * Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
 * boolean isGood (T item);
 * Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
 * Создайте следующие детские классы:
 * • IsEven — ему дают целое число, он одобряет его, если оно чётное
 * • IsPositive — ему дают целое число, он одобряет его, если оно положительное
 * • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
 * • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
 * 
 * Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
 * Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
 * Продемонстрируйте, что это работает.
 * @param <Т>
 */


public class Main {
    public static void main(String[] args) {
        IsGood<Integer> isEven = new IsEven();
        IsGood<Integer> isPos = new IsPositive();
        IsGood<String> isBegWith = new BeginsWith("123");
        IsGood<String> isBegWithA = new BeginsWithA();

        List<Integer> listInt = Arrays.asList(1,2,4,5,-7,6,7,-5);
        List<String> listStrings = Arrays.asList("123456", "ADSF", "3rdsgt", "asd","1256");
       
        System.out.println(filters(listInt, isEven));
        System.out.println(filters(listInt, isPos));
        System.out.println(filters(listStrings, isBegWith));
        System.out.println(filters(listStrings, isBegWithA));
        


    }

    public static <T>Iterable<T> filters(Iterable<T> collection, IsGood<T> aplover) {

        Collection<T> result = new LinkedList<T>();
        
        for (T t : collection) {
            if (aplover.isGood(t)) {
                result.add(t);
            }
        }
        return (Iterable<T>)result;
            }
}
