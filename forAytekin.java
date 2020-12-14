import java.util.*;
//-------------------------------------------------------------------------------------
//Made by: emolyMill
//This is a project I made for my boyfriend as one of my Christmas presents to him.
//I know you guys may not think of this as "coding," but to me I wanted to do something
//to put a smile on his cute face, and I don't care about anyone else's opinions.
//Do I call this a message forum? A message archive? Basically, if you want to be
//fancy yet cryptic with someone, you can use this code to make the things you want to
//say to someone a "game."
//If you guys use anything like this to help w a project that is larger or smaller in
//length and/or context and come across this, please reference me. I'll be v upset
//if you do not.
//Happy coding!
//-------------------------------------------------------------------------------------

public class forAytekin {

    public static void main(String[] args) {
        System.out.println("What is your name? Answer below, please.");
        System.out.println("-----------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        String aytekInput = scanner.nextLine();
        if (aytekInput.equals("Aytekin") || aytekInput.equals("aytekin")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Woo! You're my boyfriend Aytekin! Hi baby, it me! Emoly!");
            System.out.println("I wanted to make you something in one way that I know how!");
            System.out.println("I love you so much and you deserve something hand-made from me!");
            menuMessages();
        } else {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("You're not Aytekin so you cannot see what we speak of privately.");
            System.out.println("However, you're still appreciated and I still care about u!!");
            System.exit(0);

        }
    }

    private static void menuMessages() {
        System.out.println("So.. *ahem* What do you want to know? Select from one of these options:");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1. A sappy message from ur gf.");
        System.out.println("2. A (rock) fact.");
        System.out.println("3. Your gf gushing about Barnaby.");
        System.out.println("4. A list of things I want to do with you.");
        System.out.println("5. Exit.");
        System.out.println("-----------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        String aytekOptions = scanner.nextLine();
        switch (aytekOptions) {
            case "1":
                runMessages();
            case "2":
                rockFacts();
            case "3":
                barnabeanGusher();
            case "4":
                listActivities();
            case "5":
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Bye baby! I love you very much!");
                System.out.println("I really hope I was able to make your day.");
                System.out.println("I hope I can expand on this some day,");
                System.out.println("although, for now this is what you got, LOL.");
                System.out.println("Please remember how worthy you are of anything you put your mind to.");
                System.out.println("One day, we'll be living together with our baby Loon and Barnabean.");
                System.out.println("'You're dearer to me than all the bats in all the caves in the world.'");
                System.out.println("                                                    - Morticia Addams");
                System.out.println("-----------------------------------------------------------------------");
                System.exit(0);

        }

    }

    private static void listActivities() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Here's a list of places I want to go to with my baby:");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. New York, New York");
        System.out.println("2. Sleepy Hollow, New York");
        System.out.println("3. Salem, Massachusetts");
        System.out.println("4. Disneyland: Anaheim, California");
        System.out.println("5. Disney World: Orlando, Florida");
        System.out.println("6. Gettysburg, Pennsylvania");
        System.out.println("7. Eastern State Penitentiary: Philadelphia, PA");
        System.out.println("-----------------------------------------------------");
        System.out.println("... And that's it for now! Hopefully once COVID-19 is");
        System.out.println("over, we can definitely go to all of these locations!");
        System.out.println("... Would you like to go back to the menu?");
        String aytekDecision = scanner.nextLine();
        if (aytekDecision.equals("Yes") || aytekDecision.equals("yes")) {
            menuMessages();
        } else if (aytekDecision.equals("No") || aytekDecision.equals("no")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Bye baby! I love you very much!");
            System.out.println("I really hope I was able to make your day.");
            System.out.println("I hope I can expand on this some day,");
            System.out.println("although, for now this is what you got, LOL.");
            System.out.println("Please remember how worthy you are of anything you put your mind to.");
            System.out.println("One day, we'll be living together with our baby Loon and Barnabean.");
            System.out.println("'You're dearer to me than all the bats in all the caves in the world.'");
            System.out.println("                                                    - Morticia Addams");
            System.out.println("-----------------------------------------------------------------------");
            System.exit(0);
        }
    }

    private static void barnabeanGusher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Wow I really love my cat ok like he's the cutest cutest baby on the");
        System.out.println("PLANET like LOOK. AT. HIM. His cute PAWS and his little FRECKLE.");
        System.out.println("THAT. fRECKkkkLE. ;__; !!");
        System.out.println("I find it so cute that we both are guilty of kissing the freckle");
        System.out.println("on his nose. Like look at us wow we're such a cute fricken family.");
        System.out.println("I can't wait until we're all living together where we can both love");
        System.out.println("on this wonderful boy. we'll be spoiling tf out of him and getting");
        System.out.println("him all of the clothes and toys, because he deserves the world.");
        System.out.println("... Would you like to go back to the menu?");
        System.out.println("-----------------------------------------------------------------------");
        String aytekDecision = scanner.nextLine();
        if (aytekDecision.equals("Yes") || aytekDecision.equals("yes")) {
            menuMessages();
        } else if (aytekDecision.equals("No") || aytekDecision.equals("no")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Bye baby! I love you very much!");
            System.out.println("I really hope I was able to make your day.");
            System.out.println("I hope I can expand on this some day,");
            System.out.println("although, for now this is what you got, LOL.");
            System.out.println("Please remember how worthy you are of anything you put your mind to.");
            System.out.println("One day, we'll be living together with our baby Loon and Barnabean.");
            System.out.println("'You're dearer to me than all the bats in all the caves in the world.'");
            System.out.println("                                                    - Morticia Addams");
            System.out.println("-----------------------------------------------------------------------");
            System.exit(0);
        }

    }

    private static void rockFacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Did you know that you're the cutest boy in the world?");
        System.out.println("... And that's a rock fact!");
        System.out.println("Would you like to hear another?");
        System.out.println("-----------------------------------------------------------------------");
        String aytekQuestion = scanner.nextLine();

        if (aytekQuestion.equals("Yes") || aytekQuestion.equals("yes")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Did you know that the first thing we're going to do after college is");
            System.out.println("adopt a kitten?");
            System.out.println("... And that's a rock fact!");
            System.out.println("Would you like to hear more?");
            System.out.println("-----------------------------------------------------------------------");
            String aytekContinue = scanner.nextLine();

            if (aytekContinue.equals("Yes") || aytekContinue.equals("yes")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Did you know that I'm so grateful to have you in my life?");
                System.out.println("... And that's a rock fact!");
                System.out.println("Would you like to hear more?");
                System.out.println("-----------------------------------------------------------------------");

            } else if (aytekContinue.equals("No") || aytekContinue.equals("no")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Okay okay fine, I'm done. LOL.");
                menuMessages();
            }
        } else if (aytekQuestion.equals("No") || aytekQuestion.equals("no")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Okay I'm REALLY done this time! Bye, baby. I love you!");
            menuMessages();
        }

    }

    private static void runMessages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("To be honest, I am so lucky to have a person like you in my life.");
        System.out.println("I'm not sure how I made it this far in life without you in it until now.");
        System.out.println("It seems as if we know each other from another life, doesn't it?");
        System.out.println("Like the stars aligned and chose for us to meet again, somehow.");
        System.out.println("If that's how it happened, wow I thank the stars. Because the stars");
        System.out.println("couldn't have done a better job of finding my soulmate.");
        System.out.println("Lately, I know you've been down on yourself, and your abilities.");
        System.out.println("But I can tell you from what I've watched you do throughout this year,");
        System.out.println("that you've tried your absolute best.");
        System.out.println("I know you're going to doubt me, but know that your doubts won't change");
        System.out.println("my mind.");
        System.out.println("To me, you're a wonderful person who deserves the world.");
        System.out.println("To me, you deserve to chase the moon, and shoot for the stars.");
        System.out.println("And me? I'll be beside you, watching you grow and succeed in life.");
        System.out.println("Effortlessly proud and full of glee with all you achieve.");
        System.out.println("So don't give up, we're almost at a senior year's close!");
        System.out.println("We have a LOT to look forward to, and we will be there for one another");
        System.out.println("Picking each other up as we walk along the trail of life.");
        System.out.println("... Would you like to go back to the menu?");
        System.out.println("-----------------------------------------------------------------------");
        String aytekDecision = scanner.nextLine();

        if (aytekDecision.equals("Yes") || aytekDecision.equals("yes")) {
            menuMessages();
        } else if (aytekDecision.equals("No") || aytekDecision.equals("no")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Bye baby! I love you very much!");
            System.out.println("I really hope I was able to make your day.");
            System.out.println("I hope I can expand on this some day,");
            System.out.println("although, for now this is what you got, LOL.");
            System.out.println("Please remember how worthy you are of anything you put your mind to.");
            System.out.println("One day, we'll be living together with our baby Loon and Barnabean.");
            System.out.println("'You're dearer to me than all the bats in all the caves in the world.'");
            System.out.println("                                                    - Morticia Addams");
            System.out.println("-----------------------------------------------------------------------");
            System.exit(0);
        }
    }
}
