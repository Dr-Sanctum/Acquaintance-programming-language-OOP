public class Viewer
{
    public string getMainMenu()
    {
        string mainMenu = "Выберите пункт меню: \n" +
                        "1 - Посмотреть список контрагентов \n" +
                        "2 - Найти контрагента по названию. Посмотреть подробную информацию о нём \n" +
                        "3 - Добавить контрагента \n" +
                        "4 - Удалить контрагента \n" +
                        "5 - Добавить новый способ связаться с контрагентом \n" +
                        "6 - Удалить способ связаться с контрагентом \n"+
                        "Чтобы выйти из меню введите любой другой символ";
        Console.WriteLine(mainMenu);
        return Console.ReadLine();
    }
    public string getMenuAddContact()
    {
        string menuAddContact = "Выберите тип контакта: \n" +
                        "1 - Адрес \n" +
                        "2 - Электронная почта \n" +
                        "3 - Номер телефона \n" +
                        "4 - Телеграмм \n" +
                        "5 - Страница ВКонтакте \n";
        Console.WriteLine(menuAddContact);
        return Console.ReadLine();
    }
    public void print(string data)
    {
        Console.WriteLine(data);
    }

    public string nameCounterParty()
    {
        Console.WriteLine("Введите имя контрагента");
        return Console.ReadLine();
    }
    public string infoContact()
    {
        Console.WriteLine("Введите информацию");
        return Console.ReadLine();
    }

        public string numberContact()
    {
        Console.WriteLine("Введите номер контакта контрагента");
        return Console.ReadLine();
    }
        public string TypeCounterParty()
    {
        string menu = "Выберите тип контрагента: \n" +
                        "1 - Физическое лицо \n" +
                        "2 - Юридическое лицо \n";
        Console.WriteLine(menu);
        return Console.ReadLine();
    }
}