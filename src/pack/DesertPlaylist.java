package pack;

import java.util.ArrayList;

class DesertPlaylist {

    public static void main(String[] args) {
        // Introduction
        System.out.println("You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪");

        // declares ArrayList desertIslandPlaylist
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // adds 6 songs to the desertIslandPlaylist ArrayList
        desertIslandPlaylist.add("What You Are: Audioslave");
        desertIslandPlaylist.add("Around the World - Red Hot Chilli Pepper");
        desertIslandPlaylist.add("Work Outs - J. Cole");
        desertIslandPlaylist.add("Elevate - Papa Roach");
        desertIslandPlaylist.add("Toxicity - System Of The Down");
        desertIslandPlaylist.add("Believer - Imagine Dragons");
        System.out.println();

        // prints desert playlist along with ArrayList size
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        System.out.println();

        // removes a single song and prints size of ArrayList
        desertIslandPlaylist.remove(2);
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        System.out.println();

        //Create a temporary variable to store the value of song a. (We’ll call the songs a     and b here.)
        String tempA = "What You Are - Audioslave";
        String tempB = "Believer - Imagine Dragons";

        //Rewrite the value at the index of a to the value of b.
        desertIslandPlaylist.set(4, tempA);
        desertIslandPlaylist.set(0, tempB);
        System.out.println(desertIslandPlaylist);
    }
}