package com.onlinestore.kodigonlinestore.controller;

import com.onlinestore.kodigonlinestore.model.Item;
import java.util.Scanner;

public class Mail {
    public static void SendBillTo(Item item)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Mail to send the Bill");
        String Mail = sc.nextLine();
        StringBuilder bodyText = new StringBuilder();

        bodyText.append("Book Title: "+ item.getTitle().toUpperCase() +"\n");
        bodyText.append("Price: "+ item.getItemPrice().toUpperCase() +"\n");

        MailSender.sendMail(Mail,bodyText.toString(), "Kodigo Online Book Store Bill");
    }
}