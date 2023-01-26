namespace Contact
{
    public class Address : AContact
    {
        public override string typeContact { get { return "Адрес"; } }
        public Address(string info) : base(info) { }
    }
}