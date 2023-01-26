namespace Contact
{
    public abstract class AContact
    {
        public abstract string typeContact { get; }
        private string info = "";
        public AContact(string info)
        {
            this.info = info;
        }

        public string getInfo()
        {
            return info;
        }
        public void setInfo(string info)
        {
            this.info = info;
        }

        public override bool Equals(object? obj)
        {
            if (!obj.GetType().Equals(this.GetType()))
            {
                return false;
            }
            if (this.info.Equals(((AContact)obj).getInfo()))
            {
                return true;
            }else
            {
                return false;
            }
            
        }



        public override string? ToString()
        {
            return typeContact + " - " + info;
        }

        public override int GetHashCode()
        {
            return info.GetHashCode() + typeContact.GetHashCode(); 
        }
    }
}