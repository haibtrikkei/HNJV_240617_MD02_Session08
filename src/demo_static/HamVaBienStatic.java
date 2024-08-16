package demo_static;

public class HamVaBienStatic {
    public static int n;
    public int k;
    public static int m;
    public int p;


    public void method1(){
        System.out.println("Gia tri cua n: "+n);
        System.out.println("Gia tri cua k: "+k);
        System.out.println("Gia tri cua m: "+m);
        System.out.println("Gia tri cua p: "+p);
    }

    public static void method2(){
        System.out.println("Gia tri cua n: "+n);
//        System.out.println("Gia tri cua k: "+k);
        System.out.println("Gia tri cua m: "+m);
//        System.out.println("Gia tri cua p: "+p);
    }
}

/*
Các biens: n, m là các biến lớp,giá trị được đồng bộ qua các thể hiện của lớp, được
truy cập thẳng từ tên lớp

method1 muốn gọi được thì phải qua đối tưựng cua lớp (không gọi trực tiếp từ lớp được)
method2 có thể gọi được qua tên lớp (không nhất thiết phải gọi qua đối tượng)

 */