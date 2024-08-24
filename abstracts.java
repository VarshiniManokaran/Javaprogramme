public  class abstracts {
    public static void main(String[] args) {
        abst ab=new abst();
        ab.cat();
        
    
    }
    
}
 abstract class abstract1 {
    abstract void  sound();
    abstract void cat();
    abstract void dog();


}
class abst extends abstract1{
    void sound(){
        System.out.println("i am walking");
    }
    void dog(){
        System.out.println("i am barking");
    }

}
