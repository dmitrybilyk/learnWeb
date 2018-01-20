package com.lena.holders;

import com.lena.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dmitry on 29.12.17.
 */
public class UsersHolder {
    private static Map <Integer, User> map = new HashMap<>();
    public  static void addUser(User user) {
        setNewId(user);
        map.put(user.getId(), user);
    }

    private static void setNewId(User user) {
        int maxKey = 0;
        for (Integer key : map.keySet()) {
            if (key > maxKey) {
                maxKey = key;
            }
        }
        int newId = maxKey + 1;
        user.setId(newId);
    }

    public static void removeUser(Integer id) {
        map.remove(id);
    }
    public static Collection<User> getUsers(){
        return map.values();
    }

   // public static void addUsers(List<User> users) {
     //   for (User user : users) {
       //     addUser(user);
        //}
    //}

    public static User getUserById(Integer id) {
        for (Integer key : map.keySet()) {
            if (key.equals(id)) {
                return map.get(key);
            }
        }
        return null;
    }

    public static void editUser(Integer id, String name, Integer age) {
        User user = getUserById(id);
        user.setAge(age);
        user.setName(name);
    }
}
