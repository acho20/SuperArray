public class Demo{
  public static void removeDuplicates(SuperArray s){
    boolean looped = false;
    while(!looped){
      for(int i = 0; i < s.size() - 1; i++){
        if (i == s.size() - 2) looped = true;
        for(int j = i + 1; j < s.size(); j++){
          if(s.toArray()[i] == s.toArray()[j]){
            s.remove(j);
            break;
          }
        }
      }
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
