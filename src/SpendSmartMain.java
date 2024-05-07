
import controller.SpendSmartController;
import model.DataBase;
import view.Login;


public class SpendSmartMain {
    public static void main(String[] args) {
    SpendSmartController c = new SpendSmartController();
    DataBase model=new DataBase();
    Login view = new Login(); 
    //run spend smart app
    c.initController();
    }
}
