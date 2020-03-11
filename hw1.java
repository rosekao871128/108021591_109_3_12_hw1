public class hw1{

    public static void main(String[]args){
        Book book1 = new Book();
        
        book1.setName("book1");
        System.out.println("Name\t:"+book1.getName());


        book1.setAuthor("Anne");
        System.out.println("Author\t:"+book1.getAuthor());
        
        book1.setPage("510");
        System.out.println("Page\t:"+book1.getPage());

        book1.setPrice("270");
        System.out.println("Price\t:"+book1.getPrice());

        book1.setCollect("3");
        System.out.println("Collect\t:"+book1.getCollect());


        Book book2 = new Book();
        
        book2.setName("book2");
        System.out.println("Name\t:"+book2.getName());


        book2.setAuthor("Anny");
        System.out.println("Author\t:"+book2.getAuthor());
        
        book2.setPage("560");
        System.out.println("Page\t:"+book2.getPage());

        book2.setPrice("1000");
        System.out.println("Price\t:"+book2.getPrice());

        book2.setCollect("5");
        System.out.println("Collect\t:"+book2.getCollect());



        Book book3 = new Book();
        
        book3.setName("book3");
        System.out.println("Name\t:"+book3.getName());


        book3.setAuthor("Anna");
        System.out.println("Author\t:"+book3.getAuthor());
        
        book3.setPage("100");
        System.out.println("Page\t:"+book3.getPage());

        book3.setPrice("1200");
        System.out.println("Price\t:"+book3.getPrice());

        book3.setCollect("1");
        System.out.println("Collect\t:"+book3.getCollect());

    }
}