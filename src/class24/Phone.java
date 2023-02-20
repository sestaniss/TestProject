package class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract methods like displayPictures
    unlockPhone
    sendText
    2 child classes IPhone Samsung Google Pixle and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract void displayPictures();

    abstract void unlockPhone();

    abstract void SendText();
}
class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Iphotos to browse the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Face ID to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("Lets use the IMessage to send the text");

    }
}
    class Samsung extends Phone{

        @Override
        void displayPictures() {
            System.out.println("Gallery access to see pictures");
        }

        @Override
        void unlockPhone() {
            System.out.println("Using fingerprint sensor or camera");
        }

        @Override
        void SendText() {
            System.out.println("Messages app to send the message");
        }
    }

