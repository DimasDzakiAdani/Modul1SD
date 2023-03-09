/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg1.sd;

/**
 *
 * @author dimas
 * @param <E>
 */
public class Kota<E>{
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }
    
    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<>(9);
        Kota<String> namaKota =new Kota<>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahKota.getElement() + " kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota "+ namaKota.getElement());
    }
    }
