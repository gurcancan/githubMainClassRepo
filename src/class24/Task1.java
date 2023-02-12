package class24;

public class Task1 {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        Define common behavior within and some fields in parent class and override
        some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array.
        Loop through each object and execute available methods./
     */
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new HB()};
        // int a=(int)12.5;
        for (Computer c : computers) {
            c.playVideo();
            c.browserInternet();
            // If we want to call methods from apple class we need to convert c
            // to apple class.
            if (c instanceof Apple) {
                Apple apple = (Apple) c;
                apple.installApp();
                apple.editVideos();
            }
        }
    }
}

class Computer {
    int RAM;
    int storage;
    String OS;

    void playVideo() {
        System.out.println("Video is playing");
    }

    void browserInternet() {
        System.out.println("Browser the internet");
    }
}

class Apple extends Computer {
    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    void browserInternet() {
        System.out.println("Browsing the internet using safari");
    }

    void editVideos() {
        System.out.println("Editing on iMovies");
    }

    void installApp() {
        System.out.println("Installing the apps from App Store");
    }
}

class Dell extends Computer {

}

class Lenovo extends Computer {

}

class HB extends Computer {
    @Override
    void browserInternet() {
        System.out.println("Browsing using chrome");
    }

    void playVideo() {
        System.out.println("Playing the video on using VLC player");
    }
}
