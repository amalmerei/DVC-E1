/*
Statische Methoden und Verzweigungen
Amal Merei 
31.10.2025
*/

public class Verzweigungen {
  public static void main(String args[]) {
    System.out.println("Ist Schaltjahr (2000): " + istSchaltjahr(2000));
    System.out.println("Ist Schaltjahr (1900): " + istSchaltjahr(1900));
    System.out.println("Ist Schaltjahr (2024): " + istSchaltjahr(2024));
    System.out.println("Ist Schaltjahr (2023): " + istSchaltjahr(2023));
    System.out.println("note als Text (90): " + noteAlsText(90));
    System.out.println("note als Text (75): " + noteAlsText(75));
    System.out.println("note als Text (60): " + noteAlsText(60));
    System.out.println("note als Text (50): " + noteAlsText(50));
    System.out.println("note als Text (12): " + noteAlsText(12));
    System.out.println("wochentag Kategorie (1): " + wochentagKategorie(1));
    System.out.println("wochentag Kategorie (6): " + wochentagKategorie(6));
    System.out.println("wochentag Kategorie (12): " + wochentagKategorie(12));
    System.out.println("tarif Preis (basic): " + tarifPreis("basic"));
    System.out.println("tarif Preis (pro): " + tarifPreis("pro"));
    System.out.println("tarif Preis (enterprise): " + tarifPreis("enterprise"));
    System.out.println("tarif Preis (clown): " + tarifPreis("clown"));
  }
  
  public static boolean istSchaltjahr(int jahr) {
      if (jahr % 400 == 0) return true;
      else if (jahr % 100 == 0) return false;
      else if (jahr % 4 == 0) return true;
      else return false;
  }
  
  public static String noteAlsText(int punkte) {
      if (punkte >= 90) return "Sehr gut";
      else if (punkte >= 75) return "Gut";
      else if (punkte >= 60) return "Befriedigend";
      else if (punkte >= 50) return "Bestanden";
      else return "Nicht bestanden";
  }
  
  public static String wochentagKategorie(int tagNr) {
    switch (tagNr) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return "Werktag";
      case 6:
      case 7:
        return "Wochenende";
      default:
        return "Ungueltig";
    }
  }
  public static int tarifPreis(String tarif) {
      return switch (tarif) {
          case "basic" -> 10;
          case "pro" -> 20;
          case "enterprise" -> 50;
          default -> -1;
      };
  }
  
}