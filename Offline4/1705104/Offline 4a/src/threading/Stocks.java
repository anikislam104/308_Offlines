package threading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stocks {
    private  ArrayList<Stock> stocks=new ArrayList<>();
    File file=new File("F:\\HTML\\Offline 4a\\src\\threading\\stocks.txt");

    public Stocks() throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            //System.out.println(line);
            String str[]=new String[3];
            str=line.split(" ");
            //System.out.println(str[0]+"  "+str[1]+" "+str[2]);
            Stock s=new Stock();
            s.setStockName(str[0]);
            s.setStockPrice(Double.parseDouble(str[2]));
            s.setCount(Integer.parseInt(str[1]));
            //s.show();
            stocks.add(s);
            //stocks.get(stocks.size()-1).show();
        }

    }
    public ArrayList<Stock> getStocks(){
        return stocks;
    }
    public int getSize(){
        return stocks.size();
    }
    public Stock getStockatIndex(int index){
        return stocks.get(index);
    }

}
