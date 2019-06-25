/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaPessoa {
    public static void main(String[] args){
        try{
        Pessoa p = new Pessoa("John",-1);
        
    }catch(IdadeInvalidaException ex){
        System.out.println(ex.getMessage());
    }
    
    }
}
