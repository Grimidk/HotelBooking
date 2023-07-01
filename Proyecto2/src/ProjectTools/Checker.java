/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTools;

/**
 *
 * @author juanmendezl
 * todo lo que es validar datos
 */
public class Checker {
    public static boolean isNum(String string) { 
        try { Double.parseDouble(string);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }       
}
    public static boolean isValiddate(String string){
        if(string.contains("/")){
            String[] check = string.split("/");
            if(check.length == 3){
                if(isNum(check[0])){
                  int aux1 = Integer.parseInt(check[0]);
                  if(aux1 < 32 & aux1 > 0){
                        if(isNum(check[1])){
                            int aux2 = Integer.parseInt(check[1]);
                            if(aux2 < 13 & aux1 > 0){
                                if(isNum(check[2])){
                                    int aux3 = Integer.parseInt(check[2]);
                                    if(aux3 < 2100 & aux1 > 0){
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }        
        } 
        return false;
    }
    
    public static boolean areValiddates(String first, String second){
        if(isValiddate(first) & isValiddate(second)){
            String[] aux = first.split("/");
            String[] check = second.split("/");
            int aux3 = Integer.parseInt(aux[2]);
            int check3 = Integer.parseInt(check[2]);
            if(check3 > aux3){
                return true;
            } else if(check3 == aux3){
                int aux2 = Integer.parseInt(aux[1]);
                int check2 = Integer.parseInt(check[1]);
                if(check2 > aux2){
                    return true;
                } else if(check2 == aux2){
                    int aux1 = Integer.parseInt(aux[0]);
                    int check1 = Integer.parseInt(check[0]);
                    if(check1 > aux1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean isRoom(String string){
        if(!string.equalsIgnoreCase("suite") & !string.equalsIgnoreCase("triple")  & !string.equalsIgnoreCase("doble") & !string.equalsIgnoreCase("simple")){
            return false;
        }
        return true;
    }
    
    public static boolean isValidphone(String string) {
        if(string.contains("(") & string.contains(")")){
            String[] aux = string.split(" ");
            if(aux[0].length() == 5 & aux[0].contains("(") & aux[0].contains(")") & aux[1].length() == 7 & isNum(aux[1])){
                String[] check = aux[0].split("");
                if(check[0].equals("(") & check[4].equals(")") & isNum(check[1]) & isNum(check[2]) & isNum(check[3])){
                    return true;
               }
            }
        }
        return false;
    }
}
