package com.kodilla.good.patterns.ordering;

public class MailService implements InformationService {

    @Override
    public void inform (User user) {
        sendMail(user);

    }
    private void sendMail(User user){
        System.out.println("Sending mail to " + user);
    }
}
