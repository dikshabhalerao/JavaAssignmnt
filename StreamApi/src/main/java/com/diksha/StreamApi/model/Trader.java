package com.diksha.StreamApi.model;



import java.util.Objects;

public class Trader {
private String traderName;
private String traderCity;


public Trader() {}


public Trader(String traderName, String traderCity) {
	super();
	this.traderName = traderName;
	this.traderCity = traderCity;
}
public String getTraderName() {
	return traderName;
}
public void setTraderName(String traderName) {
	this.traderName = traderName;
}
public String getTraderCity() {
	return traderCity;
}
public void setTraderCity(String traderCity) {
	this.traderCity = traderCity;
}
@Override
public String toString() {
	return "Trader [traderName=" + traderName + ", traderCity=" + traderCity + "]";
}

@Override
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Trader obj =  (Trader) o;
return
Objects.equals(traderCity, obj.getTraderCity());
}
 
@Override
public int hashCode() {
return Objects.hash(traderCity);
}

}
