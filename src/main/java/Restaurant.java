package restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("bread", 8, "yummy", "unhealthy", true );


        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
//    myMenu.addMenuItem(item2);
//    myMenu.addMenuItem(item3);
//        myMenu.removeMenuItem(item1);
        //System.out.println(myMenu.toString());
        System.out.println(item1.tostring());
    }
}
