package com.kodilla.good.patterns.challenges.allegrostore;

public class InformationService {
    public void orderConfirmation(User user) {
        System.out.println("Sending confirmation email to " +
                user.getFirstName() + " " + user.getLastName() + "...");
    }
}
