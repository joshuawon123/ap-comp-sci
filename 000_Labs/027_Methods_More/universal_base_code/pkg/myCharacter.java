/*
 *	Author:  Joshua Won
 *  Date: 10/25/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
		int strength;
        int dexterity;
        int intelligence;
        int charisma;
        String role;

        public myCharacter(String a){
        role = a;
        strength = 0;
        dexterity= 0;
        intelligence = 0;
        charisma = 0;
        }

        public myCharacter(String role,int s, int d, int i, int ch){
        role = role;
        strength =s;
        dexterity= d;
        intelligence = i;
        charisma = ch;
        }

        public String setRole(String a){
            if(a.equals("warrior") || (a.equals("Wizard") || (a.equals("Rogue")))){
            return a;
            }
            else{
            System.out.print("there is no role. redo. ");
        return a;
            }
     }
		public int setStr(int s){
            return strength;
        }
        public int setDex(int d){
            return dexterity;
        }
        public int setInt(int i){
            return intelligence;
        }
        public int setChar(int ch){
            return charisma;
       
        }
        public boolean setAll(String role, int s, int d, int i, int ch){
            this.role = role;
            strength = s;
            dexterity = d;
            intelligence = i;
            charisma = ch;
            if(role.equals("warrior") || (role.equals("Wizard") || (role.equals("Rouge"))) && strength > 0 && dexterity > 0 && intelligence > 0 && charisma > 0){
                return true;
            }
            else{
                return false;
            }
        }
        public void myToString(){
        System.out.println("------------------------------");
        System.out.println("Your role is: " + role);
        System.out.println("Strength: "  + strength);
        System.out.println("Dexterity: "  + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
        System.out.println("------------------------------");
        System.out.println("");
        }
		
	}



