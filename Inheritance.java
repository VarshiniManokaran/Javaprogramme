public class Inheritance {
    public static void main(String[] args) {
        chineseFood c1=new chineseFood();
        System.out.println(c1.momos);
       
    
        c1.like();
        c1.Noodles();
    }
}
        

    class chineseFood{
        int momos=4;
    
        public static void like()
        {
        
            System.out.println("I like Momos Very Much");
        }
        
        public static void Noodles(){
            System.out.println("I like Noodles and my fav one ");
        }
    
    
    }
    class  indianFood extends chineseFood{
        //boolean  ieatChicken=true;
        int mutton=6;
        
    }
     class Restaurant{
        
    
    }
    
    
        
    

