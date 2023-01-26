public class CounterpartyPerson : ACounterparty
{
    public CounterpartyPerson(string name) : base(name){}

    public override string typeCounterparty { get { return "Физическое лицо"; } }
}