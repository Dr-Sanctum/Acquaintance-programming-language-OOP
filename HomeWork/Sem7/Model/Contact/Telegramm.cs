namespace Contact
{
    public class Telegramm : AContact
    {
        public override string typeContact { get { return "Ник в Телеграмме"; } }
        public Telegramm(string info) : base(info) { }
    }
}