/* Напишите приложение, которое позволяет пользователю управлять своим списком контактов. Используйте наследование, полиморфизм, принципы SOLID.

Контрагент — это либо человек, либо компания.

У каждого контрагента есть список способов связаться: телефон, email, 
ник в telegram, адрес страницы VK, уличный адрес. Разрешается, 
что у одного контрагента сколько угодно способов связаться, например, 
несколько телефонов или несколько адресов.

Программа должна позволять следующие действия:

• Посмотреть список контрагентов
• Найти контрагента по названию. Посмотреть подробную информацию о нём
• Добавить контрагента
• Удалить контрагента
• Добавить новый способ связаться с контрагентом
• Удалить способ связаться с контрагентом

Если задача кажется слишком простой, вы можете выбрать следующие необязательные усложнения:

• Используйте паттерн MVC или MVP для архитектуры приложения
• Решите задачу на языке, отличном от Java
• Возможность сохранять книгу контактов в файл, загружать из файла*/
ListCounterParty list1 = new ListCounterParty();
Viewer newViewer = new Viewer();
Presenter newPresenter = new Presenter(list1, newViewer);

 list1.addCounterParty(new CounterpartyCompany("Рога и копыта"));
    list1.GetlistCounterParty()["Рога и копыта"].addContact(1,"Улица сосновая");
    list1.GetlistCounterParty()["Рога и копыта"].addContact(3,"384341");
    list1.GetlistCounterParty()["Рога и копыта"].addContact(2,"Рога_и_копыта@.мыло.рф");
list1.addCounterParty(new CounterpartyPerson("Вася"));
    list1.GetlistCounterParty()["Вася"].addContact(1,"Улица бобровая");
    list1.GetlistCounterParty()["Вася"].addContact(3,"883131");
list1.addCounterParty(new CounterpartyCompany("Новый мир"));
    list1.GetlistCounterParty()["Новый мир"].addContact(1,"Улица новая");
    list1.GetlistCounterParty()["Новый мир"].addContact(3,"4348634");
    list1.GetlistCounterParty()["Новый мир"].addContact(3,"1432141");

newPresenter.dataProcessing();

