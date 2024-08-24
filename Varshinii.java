import java.util.Scanner;

public class Varshinii{
    //throw and throws keyword:
      static void check( int age) throws UserDefined{
       if(age<18){
        //throw new UserDefined("age is invalid");
        }

        else{
           throw new ArithmeticException("age is valid");
        }
     }
     
           



    public static void main(String[] args) {

        //Main myObj = new Main();  
        //System.out.println(myObj instanceof Main); 




        level myVar = level.medium; 
    System.out.println(myVar); 

        outerLoop: // This is a labeled block
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (j == 2) {
                    break outerLoop; // Exits the outer loop when j == 2
                }
            }
        }
        System.out.println("Exited the loop.");





        boolean israin=true;
     boolean isfishtasty=false;

if(israin){
    System.out.println("u Take an umbrella");
}
else{
    System.out.println("Enjoy the sunshine");
}

if(isfishtasty){
    System.out.println("Enjoy the food");
}
else{
    System.out.println("i dont like");
}

        for( int i=1;i<=5;i++){
            if(i==4){
                continue;
            }

                System.out.println ("i is:"+ i);
            
            
        }
        foodshop fs=new foodshop();
        fs.items();
        


        //null keyword:
        String names = null;  

                    if (names == null) {
                        System.out.println("Name is not assigned yet.");
                    }
            
                   
                    names = "Alice";
            
                    if (names != null) {
                        System.out.println("Name: " + names);
                    }



                    int count = 1;
        
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);




          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter your Name:");
          String name=scanner.nextLine();
          System.out.println("Enter your age");
          int Age=scanner.nextInt();
          scanner.close();



        //Exception Handling:(try,catch,finally, throw):

        int a1=5;
        int b1=0;
        try {
            check(19);
            
        } 
        catch (UserDefined E) {
           
            System.out.println(E.getMessage());
        }
         
        catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        }
    
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                System.out.println("Breaking the loop at i = " + i);
                break;  
            } 
            operators op1=new operators();
            op1.oper();
    
    operr op=new operr();
    op.just();

    changes ch=new changes();
    ch.call();
    ch.talk();

     thisis is=new thisis(12);
     is.displays();


        //assert keyword:
        int age=10;
        assert age >= 18 : "Age is less than 18";

        System.out.println("Age is " + age);


returns re=new returns();
 int hello=re.sum(21,10);
System.out.println("the number is:"+ hello);
        }

//cakecount count=new cakecount();
//thread team1=new thread(new team(counter)
           int day = 3;
         String dayName;
         
            switch(day){

             case 1:
                 System.out.println( "Sunday");
                 break;
             case 2:
                System.out.println("Monday");
                 break;
             case 3:
              System.out.println("Tuesday");
                 break;
             case 4:
               System.out.println("Wednesday");
                 break;
             case 5:
                 System.out.println("Thursday");
                 break;
             case 6:
                 System.out.println("Friday");
                 break;
             case 7:
              System.out.println("Saturday");
                 break;
             default:
            System.out.println("Invalid day");
                 break; 
          }
        

 //create object for father class:
        father f=new father();
        System.out.println(f.Name);
        System.out.println(f.age);
        System.out.println(f.momos2+f.noodles2);
        System.out.println(f.total3);
        System.out.println(f.total4);
        f.feedback();
        f.call();

        Menucard2 menu=new Menucard2();
        System.out.println(menu.Briyani);
        menu.menu();
        menu.condition();
        foods2 varshini = new foods2();
        varshini.display1();


        Dog.varshu();
        System.out.println(Dog.count);
        e q1=new e();
        System.out.println(q1.Value);

    }
}





class UserDefined extends Exception{
    //super keyword:
public UserDefined(String str) {
        super(str);
    }
}
    






class father{

    String Name="Varshini";
    int age=24;
    int momos2=456;
    int noodles2=534;
    int pannerbuttor=45;
    int riseball=67;
    int chicken65=80;
    int curd=6;
    //Arithmatic operators:
    int total=momos2+noodles2;
    int total2=noodles2-pannerbuttor;
    int total3=riseball*curd;
    int total4=momos2/4;


    void feedback(){
        System.out.println("i like curd");
        System.out.println("this is very spicy and tasty & this is my fav food");
    }


    void call(){
        System.out.println("this is my name and age");
        
    }
}


class  Menucard1 {
    int Briyani=110;
    int Dosa=70;
    int Vada=35;
    int Curdrise=60;
    int Meals=55;
    void menu(){
        System.out.println("This is Indian Food");
        System.out.println("You try This & This is reasonable price For Everyone ");
        System.out.println("And Enjoy the Food & Thank u");
    }


}
//class Extends from Menucard1:
class Menucard2 extends Menucard1{
    //method over riding:
int Briyani=100;

void condition(){
    //if else statements:
boolean ulike_IndianFoods=true;

if(ulike_IndianFoods)
{
    System.out.println("yes i like IndianFoods");
}
else{
    System.out.println("i dont like IndianFoods");
}
}


void menu(){
    System.err.println("Children Snacks also Available");
}

}

//i defined abstract class & abstract Method:
abstract class Food1{
    //This is abstract method:
    abstract  void display1();
    abstract void Food_Items();
    void momos(){
        System.out.println("i like momos but that is chinese food");
    }
}
class foods2 extends Food1{
    void Food_Items(){
        System.out.println("poori,Pongal,Vada,  i like this fooditems");
    }
    void display1(){
        System.out.println("hai");
    }
    // this is an void(keyword) method:
    void sri(){
        System.out.println("tharun");
    }
    

    }


    class Dog{
        // this  is static (keyword):
        static int count=30;
        static void varshu(){
            System.out.println("i love my dog");
}

        }

        class q{
            //this is an final keyword u can't overwrite one class from another class:
            
            final int Value=100;
             final void hello(){
                System.out.println("hiiii");
            }
        }

        class datatypes{
            int num=453;// integer
            double dou=455.0;// double
            float flo=2.0f;// float
            long log=46567668887l;//long
            char alb='M';//char
            byte by=56;
            short sht=67;

        }/* */

        class operators{
        int a=34;
        int c=45;
        int d=678;
        void oper(){
        System.out.println(a++);
        System.out.println(a-- + a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println("a == c: " + (a == c));  // Equal to
        System.out.println("a != c: " + (a != c));  // Not equal to
        System.out.println("a > c: " + (a > c));    // Greater than
        System.out.println("a < d: " + (a < d));    // Less than
        System.out.println("a >= c: " + (a >= c));  // Greater than or equal to
        System.out.println("a <= d: " + (a <= d));

        System.out.println("a & b = " + (a & c));  
        System.out.println("a | b = " + (a | d));   
        System.out.println("a ^ b = " + (a ^ c));   
        System.out.println("~a = " + (~a));         
        System.out.println("a << 1 = " + (a << 1)); 
        System.out.println("a >> 1 = " + (a >> 1)); 

        int e = (a > c) ? a : c;
        System.out.println("e = " + e);

        }

        }

        class operr{
            boolean v = true,z = false;
            

            void just(){
            System.out.println("x && y: " + (z && v)); 
            System.out.println("x || y: " + (v|| z)); 
            System.out.println("!x: " + (!z));

            
            }     
        }


        interface man{
           abstract void call();
           abstract void talk();
        }

        class changes implements man{
             public void call(){
                System.out.println("Hello guys");
            }
             public void talk(){
            System.out.println("I am Talking");
            }

        }
// final keyword: 

        class finaldemo{
               final void varshuu(){
                System.out.println("this is my home page");
             }
            
        }

        


        

        class thisis{
            
                private int x;
            
                public thisis(int x) {
                    this.x = x; 
                }
            
                public void displays() {
                    System.out.println("x = " + this.x);
                }
        }

        class returns{
            public int sum(int a, int b) {
                return a + b; 

            }
        }
            class foodshop{
            protected void items(){
                System.out.println("chickenrise,noodles,momos");
            }

           }

           enum level{
            low,
            medium, 
            heigh
           }



           
           




         /*class counts{
             int CakeCount=0;
              public synchronized void increment(){
                CakeCount++;

              }
            }

            class team implements Runnable{
                CakeCounter counter;
                public void run(){
                    for( int i=1;i<1000;i++){

                        counter.increment(){
                        }
                    }
                }
            }*/

                
               /*  cakecounter counter;
                team(cakecounter counter){
                    this.counter=counter;

                }
               
                public void run(){
                  
                        counter.increment(){

                        }



                        

                    }*/
                    


                    
            


                
            
        
