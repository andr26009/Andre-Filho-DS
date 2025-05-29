/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author CAMARGO
 */
public class Moto {
    
    String nomeM;
    String marcaM;
    int anoM;
    int velM;
    
    void acelerarM(int props){
        velM = velM + props;
        System.out.println("Sua moto foi para a velocidade: "+velM+"KM/h");
    }
    
    void freiarM(int para){
        velM = velM - para;
        System.out.println("Sua moto diminuiu a velocidade para: "+velM+"KM/h");
    }
    
    void buzinarM(){
        System.out.println("Moto buzinando!");
    }
    
    void darGrau(){
        System.out.println("Dando um grau!");
    }
    
    void atropelarCivil(String res){
        if(res.equals("sim")){
            System.out.println("Você atropelou o civil!");
        }
        if(res.equals("sim!")){
            System.out.println("Você atropelou o civil e ele quebrou as duas pernas!");
        }
        if(res.equals("SIM!")){
            System.out.println("Você atropelou e matou o civil");
        }
        if(res.equals("não")){
            System.out.println("Você não atropelou ninguém!");
        }
    }
}
