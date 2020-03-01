package sample.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

    private List<User> users;

    public Database() {
        users = Arrays.asList(
                new User("Ion", "asdf"),
                new User("Mihai", "123"),
                new User("Aladin", "covor"),
                new User("Something", "adf")
        );
    }

    public Database(List<User> users) {
        this.users = users;
    }

    public void add(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
