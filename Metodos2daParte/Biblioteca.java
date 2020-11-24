public class Biblioteca{
    private String l1, l2, l3, lb;
    public Biblioteca(){

    }
    public Biblioteca(String l1, String l2, String l3, String lb){
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
        this.lb=lb;
    }
    public String getl1(){
        return l1;
    }
    public void setl1(String l1){
        this.l1=l1;
    }
    public String getl2(){
        return l2;
    }
    public void setl2(String l2){
        this.l2=l2;
    }
    public String getl3(){
        return l3;
    }
    public void setl3(String l3){
        this.l3=l3;
    }
    public String getlb(){
        return lb;
    }
    public void setlb(String lb){
        this.lb=lb;
    }

}