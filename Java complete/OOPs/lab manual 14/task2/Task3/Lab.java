public class Lab extends Assignment {
   private String specification;

   Lab(String name, int month, int day, int hour, int minute, String specification){
    super(name, month, day, hour, minute);
    this.specification = specification;
   }

   public String toString(){
    return super.toString() +"\nSpecifications : "+ this.specification;
   }
}
