package com.mycompany.boletinextra01_03;

public class BoletinExtra01_03 {
    public static void main(String[] args) {
        final float prezo=100;
        double prezofinal= (float) prezo-(prezo*0.25);
        System.out.println("Precio sin rebaja: "+prezo+"€"+"\nPrezo con rebaja do 25%: "+prezofinal+"€");
    }
    
}

