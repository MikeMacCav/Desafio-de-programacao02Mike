package br.com.capgemini;

import javax.swing.JOptionPane;

public class QuantasLetrasEx2 {
    public static void main(String[] args) {
        String frase = "ola mundo";
       
		
     
        int TextoSemEspaco = frase.replaceAll(" ", "").length();
        System.out.println("Quantidade de letras sem espaço: " + TextoSemEspaco);
        double root = Math.sqrt(TextoSemEspaco);
        
        int tamanho = (int) Math.ceil(root);
        String[][] matriz = new String[tamanho][tamanho];
        
        frase = frase.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        int row = matriz.length;
		int col = matriz.length;
		
		int cont = 0;
        for (int i = 0; i < row; i++) {        	
            for (int j = 0; j < col; j++) {
            	if (cont < frase.length()) {
            		matriz[i][j] = frase.substring(cont, ++cont);	
            	}else {
            		matriz[i][j] ="";
            	} 				
            }
        }
        
        
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
    
        sb.append(matriz[i][j]);
        if (j != matriz[i].length - 1) 
            sb.append(' ');
    }
    if (i != matriz.length - 1) 
        sb.append('\n');
}


JOptionPane.showMessageDialog(null, sb.toString());
System.out.print(frase);
    
}
}