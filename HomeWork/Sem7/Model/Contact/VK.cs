namespace Contact
{
    public class VK : AContact
    {
        public override string typeContact { get { return "Адрес страницы Вконтакте"; } }
        public VK(string info) : base(info) { }
    }
}