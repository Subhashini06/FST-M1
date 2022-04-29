package actvities;

abstract class Book {
    String sTitle;
    abstract void setTitle(String s);


    String getTitle() {
        return sTitle;
    }
}

class MyBook extends Book {

    public void setTitle(String title) {
        sTitle = title;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        String title = "Racer Book";
        Book obj = new MyBook();
        obj.setTitle(title);
        System.out.println("The title is: " +obj.getTitle());
    }

}
