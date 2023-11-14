package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.pkgfinal.classes.Estagiario;
import trabalho.pkgfinal.classes.Funcionario;

public class ArquivoIO {
    
    public void gravarFunc(Funcionario func){
        
        try {
            String fileName = func.getNome();
            FileOutputStream arq = new FileOutputStream(fileName + ".db");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            System.out.println(func.getSexo());
            obj.writeObject(func);
            arq.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public Funcionario lerFunc(String fileName){
        Funcionario func = new Funcionario();
        try {
            FileInputStream arqIn = new FileInputStream(fileName+".db");
            ObjectInputStream objIn = new ObjectInputStream(arqIn);
            func = (Funcionario) objIn.readObject();
             
            arqIn.close();
            return func;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void gravarEsta(Estagiario esta){
        
        try {
            String fileName = esta.getNome();
            FileOutputStream arq = new FileOutputStream(fileName+".db");
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(esta);
            arq.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public Estagiario lerEsta(String fileName){
        Estagiario esta = new Estagiario();
        try {
            FileInputStream arqIn = new FileInputStream(fileName+".db");
            ObjectInputStream objIn = new ObjectInputStream(arqIn);
            
            
             esta = (Estagiario) objIn.readObject();
             
             arqIn.close();
             return esta;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ArquivoIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
