public class CounterpartyCompany : ACounterparty
{
    public CounterpartyCompany(string name) : base(name){}

    public override string typeCounterparty { get { return "Юридическое лицо"; } }
}