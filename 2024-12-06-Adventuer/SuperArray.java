public class SuperArray{

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity < 0){
      System.out.println("invalid index");
      data = new String[10];
    }
    else{

    data = new String[initialCapacity];
  }
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    if(this.size() < this.data.length) {
      this.data[size] = value;
      this.size ++;
      return true;
    }
    this.resize();
    this.data[size] = value;
    this.size++;
    return true;
  }


  public String toString(){
    String sup = "[";

    for(int i =0; i < this.data.length - 1; i++){
      sup += this.data[i] + ", ";
    }
    sup += this.data[this.data.length - 1] + "]";
    return sup;
  }

  public String get(int index){
    if(index >= this.size() || index < 0){
      System.out.println("invalid index!!!!");
      return null;
    }
    return this.data[index];
  }

  public String set(int index, String newVal){
    if(index >= this.size() || index < 0){
      System.out.println("invalid index!!!!!!!!");
      return null;
    }
    String oldVal = this.data[index];
    this.data[index] = newVal;
    return oldVal;

  }

  public void resize(){
    String [] newArray = new String[this.data.length * 2 + 1];

    for (int i = 0; i < this.size(); i++){
      newArray[i] = this.data[i];
    }
    this.data = newArray;
  }

  public int indexOf(String target){
    for(int i = 0; i < this.size(); i++){
      if(this.data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for(int i = this.size() - 1; i >= 0; i--){
      if(this.data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String value){

  }
}
