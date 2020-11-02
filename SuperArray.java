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

  public String set(int index, String element){
    String x = data[index];
    data[index] = element;
    return x;
  }

  private void resize(){
    String[] data2 = new String[data.length + 1];
    for(int i = 0; i < data.length; i++){
      data2[i] = data[i];
    }
    data = data2;
  }

}
