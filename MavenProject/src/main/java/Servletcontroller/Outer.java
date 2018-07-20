package Servletcontroller;

public class Outer {
	
Inner inner;
String outerValue;

public String getOuterValue() {
	return outerValue;
}

public void setOuterValue(String outerValue) {
	this.outerValue = outerValue;
}

public Inner getInner() {
	return inner;
}

public void setInner(Inner inner) {
	this.inner = inner;
}

public Outer(Inner inner, String outerValue) {
	super();
	this.inner = inner;
	this.outerValue = outerValue;
}
public Outer()
{
	}



}
