package zuoye;

import zuoye.zuoye1.InvalidDateException;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) throws InvalidDateException {
        if(year<0||(month<0 && month>12)||(day<0&&day>31)){
            throw new InvalidDateException("输入不符合");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) throws InvalidDateException {
        if(month<0 && month>12){
            throw new InvalidDateException("输入不符合");
        }
        this.month = month;
    }

    public void setDay(int day) throws InvalidDateException {
        if(day<0&&day>31){
            throw new InvalidDateException("输入不符合");
        }
        this.day = day;
    }


}
