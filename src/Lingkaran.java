/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang {

    @Override
    public float luas() {
        return PI * jari*jari;
    }

    @Override
    public float keliling() {
        return 2 * PI * jari;
    }
    private float jari;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
}
