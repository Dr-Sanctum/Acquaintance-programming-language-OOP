namespace Contact
{
    public class Mail : AContact
    {
        public override string typeContact { get { return "Электронная почта"; } }
        public Mail(string info) : base(info) { }
    }
}