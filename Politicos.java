/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicos;

import java.util.Scanner;

/**
 *
 * @author LorenaPG
 */
public class Politicos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		int a;
                int b;
                int c;
                int d;
                int e;   
                int resultado;
                int candidatoAaa;
                int candidatoAab;
                int candidatoAac;
                int candidatoAad;
                int candidatoAae;
                int candidatoAa = 1;
                int candidatoAb = 0;
                int candidatoAc = 0;
                int candidatoAd = 0;
                int candidatoAe = 1;
                int resultA;
                int candidatoBa = 0;
                int candidatoBb = 1;
                int candidatoBc = 1;
                int candidatoBd = 1;
                int candidatoBe = 1;
                int candidatoCa = 1;
                int candidatoCb = 0;
                int candidatoCc = 0;
                int candidatoCd = 0;
                int candidatoCe = 0;
                int candidatoDa = 0;
                int candidatoDb = 1;
                int candidatoDc = 1;
                int candidatoDd = 0;
                int candidatoDe = 1;
                int candidatoEa = 1;
                int candidatoEb = 0;
                int candidatoEc = 1;
                int candidatoEd = 0;
                int candidatoEe = 0;
                int candidatoBab;
                int candidatoBbb;
                int candidatoBcb;
                int candidatoBdb;
                int candidatoBeb;
                int candidatoCac;
                int candidatoCbc;
                int candidatoCcc;
                int candidatoCdc;
                int candidatoCec;
                int candidatoDad;
                int candidatoDbd;
                int candidatoDcd;
                int candidatoDdd;
                int candidatoDed;
                int candidatoEae;
                int candidatoEbe;
                int candidatoEce;
                int candidatoEde;
                int candidatoEee;
                int resultB;
                int resultC;
                int resultD;
                int resultE;
                float politicoAf;
                float politicoBf;
                float politicoCf;
                float politicoDf;
                float politicoEf;

                System.out.println ("1. Aborto: a favor ou contra?, onde 1 é a favor e 0 é contra");
		a=leitor.nextInt(); 
                System.out.println ("2. Legalizacao da maconha? A favor ou contra, onde 1 é a favor e 0 é contra");
		b=leitor.nextInt();
                System.out.println ("3. Desarmamento civil?, onde 1 é a favor e 0 é contra");
		c=leitor.nextInt();
                System.out.println ("4. Reducao da maioridade penal?, onde 1 é a favor e 0 é contra");
		d=leitor.nextInt();
                System.out.println ("5. Ensino sexual nas escolas?, onde 1 é a favor e 0 é contra");
		e=leitor.nextInt();
                System.out.println ("6. Ensino religioso?, onde 1 é a favor e 0 é contra");
		
                resultado = a+b+c+d+e;
                
                candidatoAaa = (a == candidatoAa) ? 1:0;
                candidatoAab = (b == candidatoAb) ? 1:0;
                candidatoAac = (c == candidatoAc) ? 1:0;
                candidatoAad = (d == candidatoAd) ? 1:0;
                candidatoAae = (e == candidatoAe) ? 1:0;          
                candidatoBab = (a == candidatoBa) ? 1:0;
                candidatoBbb = (b == candidatoBb) ? 1:0;
                candidatoBcb = (c == candidatoBc) ? 1:0;
                candidatoBdb = (d == candidatoBd) ? 1:0;
                candidatoBeb = (e == candidatoBe) ? 1:0;
                candidatoCac = (a == candidatoCa) ? 1:0;
                candidatoCbc = (b == candidatoCb) ? 1:0;
                candidatoCcc = (c == candidatoCc) ? 1:0;
                candidatoCdc = (d == candidatoCd) ? 1:0;
                candidatoCec = (e == candidatoCe) ? 1:0;
                candidatoDad = (a == candidatoDa) ? 1:0;
                candidatoDbd = (b == candidatoDb) ? 1:0;
                candidatoDcd = (c == candidatoDc) ? 1:0;
                candidatoDdd = (d == candidatoDd) ? 1:0;
                candidatoDed = (e == candidatoDe) ? 1:0;
                candidatoEae = (a == candidatoEa) ? 1:0;
                candidatoEbe = (b == candidatoEb) ? 1:0;
                candidatoEce = (c == candidatoEc) ? 1:0;
                candidatoEde = (d == candidatoEd) ? 1:0;
                candidatoEee = (e == candidatoEe) ? 1:0;

            
                resultA = (candidatoAaa + candidatoAab + candidatoAac + candidatoAad + candidatoAae)/5;
                resultB = candidatoBab + candidatoBbb + candidatoBcb + candidatoBdb + candidatoBeb;
                resultC = candidatoCac + candidatoCbc + candidatoCcc + candidatoCdc + candidatoCec;
                resultD = candidatoDad + candidatoDbd + candidatoDcd + candidatoDdd + candidatoDed;
                resultE = candidatoEae + candidatoEbe + candidatoEce + candidatoEde + candidatoEee;
                                
                System.out.println("Seu percentual de aderência ao político A é de " + resultA %.2f);
                System.out.println("Seu percentual de aderência ao político B é de " + resultB);
                System.out.println("Seu percentual de aderência ao político C é de " + resultC);
                System.out.println("Seu percentual de aderência ao político D é de " + resultD);
                System.out.println("Seu percentual de aderência ao político E é de " + resultE);
                
		//System.out.println (numero);
    }
    
}
