/*
* created date:13 Oct 2021
* author: cgm
*/
package com.namnd2008110152.Lab5;

public class manufacturer {
    String producer, type;
    void getHang(String text){
        producer = text;
    }
    void gettype(String text){
        type = text;
    }
    void showData(){
        System.out.println("Hãng: "+producer);
        System.out.println("type(xe số/xe điện/ moto/tay ga): "+type);

    }
}