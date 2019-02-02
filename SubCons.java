
package constructors;


public class SubCons {
    private String boyname;
    
    public SubCons(String name){
        boyname = name;
    }
    public String getname(){
        return boyname;
    }
    public void saying(){
        System.out.printf("My boyfriend is %s",getname());
    }
}
