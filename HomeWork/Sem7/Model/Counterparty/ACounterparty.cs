using Contact;

public abstract class ACounterparty
{
    public abstract string typeCounterparty { get; }
    public string name { get; set; }
    public ACounterparty(string name)
    {
        this.name = name;
    }

    private List<AContact> listContact = new List<AContact>();

    public void addContact(int typeContact, string info)
    {
        switch (typeContact)
        {
            case 1:
                listContact.Add(new Address(info));
                break;
            case 2:
                listContact.Add(new Mail(info));
                break;
            case 3:
                listContact.Add(new PhoneNumber(info));
                break;
            case 4:
                listContact.Add(new Telegramm(info));
                break;
            case 5:
                listContact.Add(new VK(info));
                break;
        }
    }

    public void removeContact(int numberContact)
    {
        listContact.RemoveAt(numberContact - 1);
    }
    public string? GetCounterparty()
    {
        int counter = 1;
        string result = name + "\n Контакты: \n";
        foreach (AContact item in listContact)
        {
            result += counter + ". " + item.ToString() + "\n";
            counter++;
        }
        return result;
    }

    public int getSizeListContact()
    {
        return listContact.Count;
    }
}