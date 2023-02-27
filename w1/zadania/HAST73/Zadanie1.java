package w1.zadania.HAST73;

public class Zadanie1 {
    public static void main(String[] args){
        int a=1,b=2,c=3,d=4;
        int ab=a+b,cd=c-d;
        double e=1.1,f=2.2,g=3.3,h=4.4;
        double ef=e*f,gh=g/h;
        System.out.println(ab%b);
        char i='A',j='a';
        System.out.println(i+j);
        String k="Ala",l="ma";
        System.out.println(k+l);
        boolean m=true,n=false;
        System.out.println(m && n);
        System.out.println("-----------------------");
        System.out.printf("%d %d %d %d %d %d ",a,b,c,d,ab,cd);
        System.out.printf("%.2f %.2f %.2f %.2f %.2f %.2f ",e,f,g,h,ef,gh);
        System.out.printf("%c %c ",i,j);
        System.out.printf("%s %s\n",k,l);
        System.out.println(m);
        System.out.println(n);
    }
}
