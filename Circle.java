package laba2_1;

public class Circle {
    private double r,d,s,p;
    public Circle(double r){
        Set_r(r);
        Set_d();
        Set_p();
        Set_s();
    };
    public void Set_r(double r){  this.r=r;};
    public void Set_d(){ this.d=r*2; };
    public void Set_s(){ this.s=r*r*3.14;};
    public void Set_p(){ this.p=2*3.14*r;};
    public double Get_r(){return r;};
    public double Get_d(){return d;};
    public double Get_s(){return s;};
    public double Get_p(){return p;};
}
