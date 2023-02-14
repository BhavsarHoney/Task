public class Customer {
  private String name;
  private String address;
  private String  mobile ;
     public Customer(String Name, String Address,String Mobile ){
        this.name=Name;
        this.address=Address;
        this.mobile=Mobile;
    }
   public void SetName(String Name){
      this .name =Name;
   }
    public String getName(){
        return name;
    }
    public void SetAddress(String Address){
        this.address=Address;
    }
    public void SetMobile(String Mobile){
        this.mobile=Mobile;
    }
    public String getAddress(){
        return address;
    }
    public String getMobile(){
        return mobile;
    }
}
