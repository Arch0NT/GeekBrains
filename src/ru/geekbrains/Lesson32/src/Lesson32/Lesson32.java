package Lesson32;

public class Lesson32 {
    public static void main(String[] args) throws Exception {
        System.out.println(Class.forName("java.lang.String"));
        SQLHandler dbh = new SQLHandler();
        dbh.openConnection();
        dbh.delAll();
        dbh.fillDB();
        if (args.length!=0) {
            switch (args[0].toLowerCase()){
                case "/цена": {
                    System.out.println(dbh.getCost(args[1]));
                }
                break;
                case "/сменитьцену": {
                    dbh.setCost(args[1],Integer.valueOf(args[2]));
                }
                break;
                case "/товарыпоцене": {
                    dbh.getProduct(Integer.valueOf(args[1]),Integer.valueOf(args[2]));
                }
                break;
                default:
                    System.out.println("неверная команда");
                break;
            }
        }
        dbh.closeConnection();
    }
}
