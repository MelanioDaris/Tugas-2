/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements MenghitungRuang{

    @Override
    public float volume() {
        return super.luas()*tinggi;
    }

    @Override
    public float luasPermukaan() {
        return super.keliling()*(super.getJari()+ tinggi);
    }
    private float tinggi;

    public Tabung(float tinggi, float jari) {
        super(jari);
        this.tinggi = tinggi;
    }
     public Tabung(float jari) {
        super(jari);
    
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
}
