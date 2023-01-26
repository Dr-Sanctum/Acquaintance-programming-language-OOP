public class Presenter
{
    private ListCounterParty listCP;
    private Viewer viewer;

    public Presenter(ListCounterParty list, Viewer viewer)
    {
        this.listCP = list;
        this.viewer = viewer;
    }
    public void dataProcessing()
    {
        bool loop = true;
        while (loop)
        {
            switch (viewer.getMainMenu())
            {
                case "1": //Посмотреть список контрагентов
                    viewer.print(listCP.GetlistCounterPartyString());
                    break;
                case "2": //Найти контрагента по названию. Посмотреть подробную информацию о нём
                    string name2 = viewer.nameCounterParty();
                    if (!listCP.GetlistCounterParty().ContainsKey(name2))
                    {
                        viewer.print("Такого контрагента нет \n");
                        break;
                    }
                    viewer.print(listCP.GetlistCounterParty()[name2].GetCounterparty());
                    break;
                case "3": // Добавить контрагента
                    string name3 = viewer.nameCounterParty();
                    switch (viewer.TypeCounterParty())
                    {
                        case "1":
                            listCP.addCounterParty(new CounterpartyPerson(name3));
                            break;
                        case "2":
                            listCP.addCounterParty(new CounterpartyCompany(name3));
                            break;
                        default:
                            viewer.print("Такого типа контрагента нет \n");
                            break;
                    }
                    break;
                case "4": // Удалить контрагента
                    string name4 = viewer.nameCounterParty();
                    if (!listCP.GetlistCounterParty().ContainsKey(name4))
                    {
                        viewer.print("Такого контрагента нет");
                        break;
                    }
                    listCP.GetlistCounterParty().Remove(name4);
                    break;
                case "5": // Добавить новый способ связаться с контрагентом
                    string name5 = viewer.nameCounterParty();
                    if (!listCP.GetlistCounterParty().ContainsKey(name5))
                    {
                        viewer.print("Такого контрагента нет");
                        break;
                    }
                    string typeContact = viewer.getMenuAddContact();
                    switch (typeContact)
                    {
                        case "1":
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                            listCP.GetlistCounterParty()[name5].addContact(int.Parse(typeContact), viewer.infoContact());
                            break;
                        default:
                            viewer.print("Такого типа контакта нет");
                            break;
                    }


                    break;
                case "6": // Удалить способ связаться с контрагентом
                    string name6 = viewer.nameCounterParty();
                    if (!listCP.GetlistCounterParty().ContainsKey(name6))
                    {
                        viewer.print("Такого контрагента нет");
                        break;
                    }
                    viewer.print(listCP.GetlistCounterParty()[name6].GetCounterparty());
                    int numberContact = int.Parse(viewer.numberContact());
                    if (!(0 < numberContact && numberContact <= listCP.GetlistCounterParty()[name6].getSizeListContact()))
                    {
                        viewer.print("Такого контакта нет");
                        break;
                    }
                    listCP.GetlistCounterParty()[name6].removeContact(numberContact);
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}