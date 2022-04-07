package AdvancedConcepts.Collections;

public class Main {
    public static void main(String[] args) {
      var list = new Generics<String>();
      var iterator = list.iterator();
      while(iterator.hasNext()){
          var current = iterator.next();
          System.out.println(current);
      }

      // CollectionsDemo parts
        CollectionsDemo.show();
    }
}
