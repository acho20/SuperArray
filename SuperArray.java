public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size != 10){
      data[size] = element;
      size++;
      return true;
    }else{
      return false;
    }
  }

  public String get(int index){
    return data[index];
  }

}
