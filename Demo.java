public class Demo{
  public static void removeDuplicates(SuperArray s){
    boolean removed = true;
    while(removed){
      removed = false;
      for(int i = 0; i < s.size() - 1; i++){
        for(int j = i + 1; j < s.size(); j++){
          if(s.toArray()[i].equals(s.toArray()[j])){
            s.remove(j);
            removed = true;
            break;
          }
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray x = new SuperArray();
    for(int i = 0; i < a.size();i++){
      for(int j = 0; j < b.size();j++){
        if (a.toArray()[i] == b.toArray()[j] && x.indexOf(a.toArray()[i]) == -1){
          x.add(a.toArray()[i]);
        }
      }
    }
    return x;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray(a.size() + b.size());
    for (int i = 0; i < Math.max(a.size(),b.size()); i++){
      if(i < a.size()){
        c.add(a.get(i));
      }
      if(i < b.size()){
        c.add(b.get(i));
      }
    }
    return c;
  }



  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);}
}
