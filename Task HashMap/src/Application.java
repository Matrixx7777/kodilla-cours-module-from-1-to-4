import java.util.*;
import java.lang.*;
import java.io.*;

class Application {
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

        System.out.println("\n"+"All maps:"+"\n");

        Map<Integer, String> ourFavoriteColours = new HashMap<>();
        ourFavoriteColours.putAll(myFavoriteColours);
        ourFavoriteColours.putAll(myFriendsFavoriteColours);

        for(Map.Entry<Integer,String> equals : ourFavoriteColours.entrySet()){
            System.out.println(equals);
        }
    }
}