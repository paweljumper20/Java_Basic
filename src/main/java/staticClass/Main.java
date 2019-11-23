package staticClass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("xx", "xsss",231);
        System.out.println(user1.getLogin());
        User user2 = new User("XXXX", "YYY",234);
        User.incrementGlobalId();
        // odwołanie do składowej statycznej
        //1. nie wymaga utworzenia obiektu
        //2. odwłoujemy się poprzedzając składową nazwą klasy
        //3. Jest tylko jedna kopia składowej statycznej w ramach klasy

        System.out.println(User.globalId);
        User.incrementGlobalId();
        System.out.println(User.globalId);

        System.out.println(user1.getLogin() + user1.getPassword());
    }
}
