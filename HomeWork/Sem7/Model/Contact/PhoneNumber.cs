namespace Contact
{
    public class PhoneNumber : AContact
    {
        public override string typeContact { get { return "Номер телефона"; } }
        public PhoneNumber(string info) : base(info) { }
    }
}