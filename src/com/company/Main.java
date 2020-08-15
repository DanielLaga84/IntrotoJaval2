package com.company;

public class Main {

    public static void main(String[] args) {

        boolean ifCold = true;  //if it is cold it is working
        if (ifCold) {
            System.out.println("Wear a jacket! It is cold outside!");
        } else {//if works when it is hot
            System.out.println("It is hot outside go on !");
        }

        int ticketPrice = 10;
        int age = 44;
        boolean isStudent = false;
        if (age <= 15) {
            ticketPrice = 5;
        } else if (age > 60) {
            ticketPrice = 5;
        } else if (isStudent) {
            ticketPrice = 5;
        }
        // commands && = and ; or || ; NOT = !(3 < 5)
        // another way  if(age <= 15 || age > 60 || isStudent) { ticketPrice = 5;}
        System.out.println("Ticket price to the museum is " + ticketPrice + " dollars.");

// Film configuration
        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;

        if (action && romance) {
            System.out.println("This movie includes action and romance.");
            if (comedy || horror) {
                System.out.println("This also includes comedy and horror!");
            }
        }// Rating restarant
        int rating = 4;
        if (rating >=0 && rating <= 5) {
            if (rating <=2){
                System.out.println("What's the reason for your low rating?");
            }
        }System.out.println("Thank you for your feedback.");

// coffe machine and switch ;ode
        int passcode = 312;
        String coffeType;
        switch(passcode) {
            case 555: coffeType = "Espresso";
                break;
            case 312: coffeType = "Vanilla latte";
                break;
            case 629: coffeType = "Drip coffe";
                break;
            default : coffeType = "Unknown";
                break;
        }// if another passcode there is Unknown message
        System.out.println(coffeType);
// MONTH STRING
        int month= 36;//should be a number 1-12
        String monthString;

        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default : monthString = "Invalid month";
                break; }
        System.out.println(monthString);
// Question 1 C
        double balance = 0;
        balance = balance + 20; //Add quarter 1 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        balance = balance + 30; //Add quarter 2 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        if (balance < 0) {
            System.out.println("We’re in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }
// Question 2 "I guess you like cats more"
        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }
// Question 3
        boolean canSeePlayer =true;
        boolean playerPoweredUp =true;

        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }
// Question 4 - case of one true
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isRaining || isSnowing || temperature <50.0) {
            System.out.println("Let's stay home.");
        }
        else {
            System.out.println("Let's go out!");}

// Question 5
        int time = 18;
        String timeOfDay;
        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";}
        System.out.println(timeOfDay);


// Question 6

        int weekday = 5;
        boolean holiday = false;
        if (weekday >= 1 && weekday <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

// Question 7
//Double playbackPosition = 120;
//  boolean rewinding = true;
// if (rewinding) {
//      double rewindAmount = 0.1;
//      playbackPosition = playbackPosition - rewindAmount;
//  }
// Question 8
        int dayOfWeek = 1;
        String schedule;

        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2: schedule = "Class after work.";
                break;
            case 3:  schedule = "Meetings all day.";
                break;
            case 4:  schedule = "Work from home.";
                break;
            case 5:  schedule = "Game night after work.";
                break;
            case 6: case 7: default:  schedule = "Free!";
                break;}
        System.out.println(schedule);

    }
}
