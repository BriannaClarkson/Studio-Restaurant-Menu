public class Main {
    public static void main(String[] args) {
//        MenuItem item1 = new MenuItem("bread", "yummy", 8.0, "unhealthy", true );

        MenuItem item1 = new MenuItem("Bread", "Garlic", 7.0, "Unhealthy", true);
        MenuItem item2 = new MenuItem("Salad", "Green", 10.0, "Healthy", false);
        MenuItem item3 = new MenuItem("Pasta", "Meatballs", 15.0, "Healthy", false);
        MenuItem item4 = new MenuItem("Pasta", "Meatballs", 15.0, "Healthy", false);

//change
        Menu myMenu = new Menu();

//        System.out.println(item1.getCategory());
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        myMenu.addMenuItem(item4);
        myMenu.removeMenuItem(item1);
        System.out.println(myMenu.toString());
//        System.out.println(item1.tostring());
    }
}
