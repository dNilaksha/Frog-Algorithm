import java.util.Scanner;
class Frog{

private int hopcount;
private int time;

public void setHopcount(int hopcount){
this.hopcount=hopcount;
}
public void setTime(int time){
this.time=time;
}
public String toString(){
return " hops "+hopcount+" Time "+time;
}
public static String calJump(int distance){

Frog f=new Frog();

int hop=0;
int time=0;
while(distance>0){

if(distance<5){
hop++;
distance--;
}

if(distance>=5){
hop++;
time+=2;
distance=distance-5;
    
if(distance>=3){
hop++;
time+=3;
distance=distance-3;

}
    
if(distance>=2){
hop++;
time+=5;
distance=distance-2;

}
    
}

}
f.hopcount=hop;
f.time=time;
return f.toString();

}

}
class Main{

public static void main(String[] args){

Scanner s=new Scanner(System.in);
System.out.println("please enter a distance");
int a=s.nextInt();
System.out.println( Frog.calJump(a));

}

}

