package class24;

public abstract class Phone {
    /*
    Create a Phone Class, Create abstract methods like displayPictures
    unlockPhone
    SendText
    3 child classes IPhone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract void UnlockPhone();

    abstract void DisplayPicture();

    abstract void SendText();
}

class Iphone extends Phone {

    @Override
    void UnlockPhone() {
        System.out.println("Face ID to unlock to IPhone");
    }

    @Override
    void DisplayPicture() {
        System.out.println("IPhotos to browse the picture");
    }

    @Override
    void SendText() {
        System.out.println("Lets use the IMessage to send messages");
    }
}

class Samsung extends Phone {
    @Override
    void UnlockPhone() {
        System.out.println("Finger print to unlock Samsung");
    }

    @Override
    void DisplayPicture() {
        System.out.printf("Use Gallery to display picture");
    }

    @Override
    void SendText() {
        System.out.printf("Messages App to sand message");
    }
}
