public class ListCounterParty
{
    private Dictionary<string, ACounterparty> dicCounterParty = new Dictionary<string, ACounterparty>();

    public string GetlistCounterPartyString()
    {
        string result = "";
        foreach (ACounterparty item in dicCounterParty.Values)
        {
            result += item.GetCounterparty() + "\n";
        }
        return result;
    }

    public Dictionary<string, ACounterparty> GetlistCounterParty()
    {
        return dicCounterParty;
    }

    public void addCounterParty(ACounterparty counterparty)
    {
        dicCounterParty.Add(counterparty.name, counterparty);
    }

    
}