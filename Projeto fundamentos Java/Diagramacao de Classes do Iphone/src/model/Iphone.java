package model;

import model.interfaces.InternetBrowser;
import model.interfaces.Ipod;
import model.interfaces.Phone;

public class Iphone implements InternetBrowser, Ipod, Phone {
    @Override
    public void displayPage() {
        System.out.println("Display Page...");
    }

    @Override
    public void addPage() {
        System.out.println("Add Page...");
    }

    @Override
    public void updatePage() {
        System.out.println("Update Page...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected Music: "+ music);
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void turnOn(String phoneNumber) {
        System.out.println("Turn on....");
    }

    @Override
    public void answer() {
        System.out.println("Answer call...");
    }

    @Override
    public void voiceMail() {
        System.out.println("Voice Mail");
    }
}
