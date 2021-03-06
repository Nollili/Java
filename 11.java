public class DNA {
  //DNA Sequencing
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
  
  String dna1 = "ATGCGATACGCTTGA";
  String dna2 = "ATGCGATACGTGA";
  String dna3 = "ATTAATATGTACTGA";

  String dna = dna1;

  //length of the dna
  int length = dna.length();
  System.out.println("Length: " + length);
  //start codon and stop codon
  int start = dna.indexOf("ATG");
  System.out.println("Start: " + start);
  // Find stop codon:
  int stop = dna.indexOf("TGA");
  System.out.println("Stop: " + stop);

  //Find the protein
  if (start != -1 &&
    stop != -1 &&
    (stop - start) % 3 == 0) {
 
  String protein = dna.substring(start, stop+3); 
  System.out.println("Protein: " + protein);
 
  }else {
 
    System.out.println("No protein.");
 
  }
  }
 
}