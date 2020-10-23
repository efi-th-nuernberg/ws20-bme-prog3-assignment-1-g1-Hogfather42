class Zahlenfilter{
  public static void main(String[] args) {
    countUp();
  }

// zählt von 1 bis 200 durch und ruft die Überprüfung der Spezialfälle auf
  public static void countUp(){
    int counter = 0;
    for(int i=0; i<200; i++){
      counter++;
      checkNumber(counter);
    }
  }

// Überprüft auf die drei Ereignisse mithilfe des Modulo-Operators und gibt das Ergebnis aus.
  public static void checkNumber(int number){
    if(number % 5 == 0){
      System.out.println(number + " ist durch 5 teilbar!");
    }
    else if(number % 10 == 9){
      System.out.println(number + " endet auf 9!");
    }
    else if(number % 3 == 2){
      int predecessor = number - 1;
      int result = number + predecessor;
      System.out.println(number + " und " + predecessor + " addiert ergeben " + result + " und " + result + " ist durch 3 teilbar." );
    }
  }

}