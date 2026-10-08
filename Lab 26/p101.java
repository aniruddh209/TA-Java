abstract class vegetable{

String color;
vegetable(String color){
this.color=color;
}

public abstract String toString();
}

class potato extends vegetable{

potato(String color){
super(color);
}
@Override
public String toString(){
	return "Color="+color;
}
}

class Bringle extends vegetable{

Bringle(String color){
super(color);
}

@Override
public String toString(){
return "Color="+color;
}
}

class Tomato extends vegetable{
Tomato(String color){
super(color);
}

@Override
public String toString(){
return "Color="+color;
}
}


public class p101{
public static void main(String[]args){
potato p=new potato("Brown");
Bringle b=new Bringle("Purple");
Tomato t=new Tomato("red");

System.out.println(p. toString());
System.out.println(b. toString());
System.out.println(t. toString());
}
}