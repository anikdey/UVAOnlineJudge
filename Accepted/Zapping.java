import java.util.Scanner;

public class Zapping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int currentChannel = input.nextInt();
            int targetChannel = input.nextInt();

            if( currentChannel == -1 && targetChannel == -1 ) {
                break;
            }

            if (currentChannel>targetChannel) {
                int downWardDirection =  currentChannel - targetChannel;
                int forwardDirection = 100 - currentChannel + targetChannel;

                if(downWardDirection < forwardDirection) {
                    System.out.println(downWardDirection);
                } else {
                    System.out.println(forwardDirection);
                }
            } else {
                int downWardDirection = currentChannel + (100 - targetChannel);
                int forwardDirection = targetChannel - currentChannel;
                if(downWardDirection < forwardDirection) {
                    System.out.println(downWardDirection);
                } else {
                    System.out.println(forwardDirection);
                }
            }
        }

        input.close();
    }
}
