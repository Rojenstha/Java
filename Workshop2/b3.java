class b3{
public static void main(String[] args){
boolean a = true && true;
boolean b = true&&false||true;
boolean c = false&&false||true;
//boolean d = false&&0; this is wrong 
boolean e = !(false)&&true;
boolean f = !(true&& !(false&&false));
//boolean g = (10>14)and(4==5); this is wrong
//boolean h = true && 5; this is wrong
boolean i = (3*4)!=(14-2)&&('C'>='D');
boolean j = (12*2)==(3*8);
boolean k = (14*2)!=(3*8);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(e);
System.out.println(f);
System.out.println(i);
System.out.println(j);
System.out.println(k);
}
}