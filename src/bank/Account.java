package bank;


//using packages in different file -> Inheritance
public class Account {
   public String name;  // this is accessible outside the package
   protected String email;  // this is accessible in the same package and in the subclass of different package
   private String password;  // this is accessible only in the same class

    // for private we use getter and setter method
   public String getPassword(){
       return this.password;
   }

   public void setPassword(String pwd){
       this.password = pwd;
   }


   // for random passowrd generator

//    public String getPassword(){
//       setPassword(randomPassword());
//        return this.password;
//    }

//    private void setPassword(String pass){
//       this.password = pass;
//    }


}
