package assignment1;

public class Date4 {
	private int year;
	private int month;
	private int date;
	
	public Date4(int y, int m, int d)
	{
		setDate(2000,01,01);
	}

	public void setDate(int yy, int mm, int dd) {
		setDate(yy,mm,dd);
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}


	public static void main(String[] args) {
		
	}

}
