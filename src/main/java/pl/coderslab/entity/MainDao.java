package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("xxx");
        user.setEmail("xxx@wp.pl");
        user.setPassword("xxx123");
        //userDao.create(user);

        //User readUser = userDao.read(10);
        //System.out.println(readUser);

        User userToUpdate = userDao.read(10);
        userToUpdate.setUserName("sss");
        userToUpdate.setEmail("sss@wp.pl");
        userToUpdate.setPassword("sss123");
        //userDao.update(userToUpdate);

        /*User anotherUser = new User();
        anotherUser.setUserName("zzz");
        anotherUser.setEmail("zzz@wp.pl");
        anotherUser.setPassword("zzz123");
        userDao.create(anotherUser);*/
        User[] all = userDao.findAll();
        for (User userTab : all) {
            System.out.println(userTab);
        }

        userDao.delete(11);



    }
}

