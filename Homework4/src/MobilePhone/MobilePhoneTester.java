package MobilePhone;

public class MobilePhoneTester {
    public static void main(String[] args) {

        MobilePhone samsung = new MobilePhone("Samsung galaxy", 1000, 500);

        samsung.installApplication("Google maps", 100);

        samsung.installApplication("Tinder", 200);

        samsung.installApplication("Pokemon GO", 250);

        samsung.use("YouTube", 5);

        samsung.use("Facebook", 6);

        samsung.use("Angry Birds", 2);

        samsung.charge();

        samsung.use("Angry Birds", 2);

    }
}
//Application Google maps has been installed on Samsung galaxy. Remain memory: 400 MB
//Application Tinder has been installed on Samsung galaxy. Remain memory: 200 MB
//Application Pokemon GO can't be installed on Samsung galaxy. There are no enough memory
//Application YouTube has been ran for 5 hours on Samsung galaxy. Remain battery capacity: 500 mAh
//Application Facebook has been used for 5 hours on Samsung galaxy. Phone has been discharged.
//Application Angry Birds can't be run on Samsung galaxy. Phone discharged
//Samsung galaxy has been charged. Remain battery capacity: 1000 mAh
//Application Angry Birds has been ran for 2 hours on Samsung galaxy. Remain battery capacity: 800 mAh