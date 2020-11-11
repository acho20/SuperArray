public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("initialCapacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size < data.length){
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
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException ("index " + index + " is out of range.");
    }
    if(index > -1){
      if(size == data.length){
        resize();
      }
      for(int i = size; i > index; i--){
        data[i] = data[i-1];
      }
      data[index] = element;
      size++;
    }
  }

  public String get(int index){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException ("index " + index + " is out of range.");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0 || index >= size){
      throw new IndexOutOfBoundsException ("index " + index + " is out of range.");
    }
    String x = data[index];
    data[index] = element;
    return x;
  }

  private void resize(){
    String[] data2 = new String[data.length * 2];
    for(int i = 0; i < size; i++){
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
      if (i == size - 1){
        x += data[i];
      }else{
        x += data[i] + ", ";
      }
    }
    return x + "]";
  }

  public boolean contains(String s){
    if (s == null) return false;
    for(int i = 0; i < size; i++){
      if(s.equals(data[i])){
        return true;
      }
    }
    return false;
  }

  public String remove (int index){
    String x = data[index];
    for(int i = index; i < size - 1; i++){
      data[i] = data[i + 1];
    }
    data[size - 1] = null;
    size--;
    return x;
  }

  public int indexOf(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return i;
      }
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

  public int lastIndexOf(String value){
    int current = indexOf(value);
    if (current == -1) return -1;
    SuperArray x = new SuperArray();
    while(true){
      if(indexOf(value) == -1){
        for(int i = 0; i < x.size(); i++){
          this.set(Integer.parseInt(x.get(i)), value);
        }
        return current;
      }else{
        current = indexOf(value);
        x.add(Integer.toString(current));
        this.set(current, "counted; don't count again");
      }
    }
  }

  public boolean equals(SuperArray other){
    if(size() != other.size()) return false;
    for(int i = 0; i < size();i++){
      if(get(i) != other.get(i))return false;
    }
    return true;
  }

}
