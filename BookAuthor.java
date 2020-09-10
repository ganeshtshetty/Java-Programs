class author1
{
	String name;
	String email;
	char gender;
	author1(String n,String e, char g)
	{ 
		name = n;
		email = e;
		gender = g;
	}
	void display()
	{
		System.out.println(name+" "+email+" "+gender);
	}
}
    class book1 extends author1
    {
        String name;
        double price;
        int qtiinstock;
        book1(String n,double p,int q)
        {
            super("a","b",'m');


            name=n;
            price=p;
            qtiinstock=q;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQtiinstock() {
            return qtiinstock;
        }
        public void setQtiinstock(int qtiinstock) {
            this.qtiinstock = qtiinstock;
        }
        void display()
        {
            System.out.println("author and book details are");
            System.out.println("name of author is:-"+" "+super.name+"\n "+"mail:-"+" "+email+" "+"gender:-"+" "+gender);
            System.out.println();
            System.out.println();
            System.out.println("book name:-"+" "+name+"\n"+"price:-"+" "+price+"\n"+"qtiinstock"+":- "+qtiinstock);
        }
        
    }





public class BookAuthor {
    


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        author1 obj=new book1("c",124,5);
        //System.out.println(obj.name+" "+obj.price+" "+obj.qtiinstock);
        obj.display();
    }


}
 





