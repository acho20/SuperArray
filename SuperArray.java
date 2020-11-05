public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size == data.length - 1){
      data[size] = element;
      size++;
      return true;
    }else{
      resize();
      data[size] = element;
      size++;
      return true;
    }
  }

  public void add (int index, String element){
    if(size == data.length){
      resize();
    }
    String[] temp = new String[size - index];
    for(int i = index - 1; i < size; i++){
      temp[i - index + 1] = data[i];
    }
    data[index] = element;
    for (int i = 0; i < temp.length; i++){
      data[index + i + 1] = temp[i];
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
    String[] data2 = new String[data.length * 2];
    for(int i = 0; i < data.length; i++){
      data2[i] = data[i];
    }
    data = data2;
  }

  public boolean isEmpty(){
    return (size == 0);
  }

  public void clear(){
    data = new String[size];
    size = 0;
  }

  public String toString(){
    String x = "[";
    for(int i = 0; i < size; i++){
      x += data[i] + ", ";
      if (i == size - 1){
        x += data[i] + "]";
      }
    }
    return x;
  }

  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if (s == data[i]){
        return true;
      }
    }
    return false;
  }

  public String remove (int index){
    for(int i = index; i < size - 1; i++){
      data[i] = data[i + 1];
    }
    String x = data[size];
    data[size] = null;
    size--;
    return x;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i++){
      if (data[i] == s) return i;
    }
    return -1;
  }

  public String[] toArray(){
    String[] data2 = new String[size];
    for(int i = 0; i < size; i++){
      data2[i] = data[i];
    }
    return data2;
  }

}
