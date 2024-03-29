package Labs.AppHashMap;

import java.util.HashMap;
import java.util.Map;

/*
Zadanie: HashMap
        W tym zadaniu przypomnisz sobie HashMapy.
        Napisz program, który przekopiuje wszystkie wartości z HashMapy myFavoriteColours i myFriendsFavoriteColours do HashMapy ourFavoriteColours:
*/

public class AppHashMap {

    public static void main(String[] args) {

        Map<Integer, String> myFavoriteColours = new HashMap<>();
        Map<Integer, String> myFriendsFavoriteColours = new HashMap<>();

        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);

        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);

        Map<Integer, String> ourFavoriteColours = new HashMap<>();
        ourFavoriteColours.putAll(myFavoriteColours);
        ourFavoriteColours.putAll(myFriendsFavoriteColours);
        System.out.println("Values in third map: " + ourFavoriteColours);
    }
}
