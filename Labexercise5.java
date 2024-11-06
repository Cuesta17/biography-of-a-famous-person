
package labexercise5;

import java.util.*;
public class Labexercise5 {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//        String name = "Marie Curie";
//        int birthYear = 1867;
//        String nationality = "Polish";
//        String occupation = "politician";
//        String notableAchievement = "Pioneering research on radioactivity, discovery of polonium and radium";
//        String firstmajorsucces = "36";
//        String awards = "Nobel Prize in Physics (1903), Nobel Prize in Chemistry (1911)";
        
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Birth year: ");
        int birthyear = scanner.nextInt();
        System.out.println("their nationality: ");
        scanner.nextLine();
        String nationality = scanner.nextLine();
        System.out.println("occupation");
        String occupation = scanner.nextLine();
        System.out.println("notable achievement ");
        String achievement = scanner.nextLine();
        System.out.println("age at first major success: ");
        String success = scanner.nextLine();
        System.out.println("awards: ");
        int awards = scanner.nextInt();
        System.out.println("death year: ");
        int deathyear = scanner.nextInt();
        System.out.println("net worth:");
        int networth = scanner.nextInt();
        System.out.println("famous quote: ");
        String famousquote = scanner.nextLine();
        
        
        
        
        System.out.println("name: " + name);
        System.out.println("birthyear: " + birthyear);
        System.out.println("nationality: " + nationality);
        System.out.println("occupation: " + occupation);
        System.out.println("achievement: " + achievement);
        System.out.println("success: " + success);
        System.out.println("awards: " + awards);
        System.out.println("deathyear: " + deathyear);
        System.out.println("networth: " + networth);
        System.out.println("famousquote: " + famousquote);
                
        
        
        
        
        
        
//        System.out.println("Name: " + name);
//        System.out.println("Birth Year: " + birthYear);
//        System.out.println("Nationality: " + nationality);
//        System.out.println("Occupation: " + occupation);
//        System.out.println("Notable Achievement: " + notableAchievement);
//        System.out.println("firstmajorsucces: " + firstmajorsucces);
//        System.out.println("Awards: " + awards);
    }
}