public class Tester{
 public static void main(String[] args){
  try{
    SuperArray x = new SuperArray(-5);
  }catch (IllegalArgumentException e){
    System.out.println("negative numbers do not work for SuperArray");
  }
    SuperArray x = new SuperArray();
    x.add("apple");
    x.add("lime");
    x.add("grape");
    x.add("orange");
    x.add("lemon");
  try{
    x.get(7);
  } catch(IndexOutOfBoundsException e){
    System.out.println("index out of range for get");
  }

  try{
    x.set(-5, "watermelon");
  } catch(IndexOutOfBoundsException e){
    System.out.println("index out of range for set");
  }

  try{
    x.add(30, "melon");
  } catch(IndexOutOfBoundsException e){
    System.out.println("index out of range for add");
  }

  try{
    x.remove(5);
  } catch(IndexOutOfBoundsException e){
    System.out.println("index out of range for remove");
  }

 }

}
