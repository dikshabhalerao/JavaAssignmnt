package com.diksha.StreamApi.client;



import java.util.ArrayList;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.diksha.StreamApi.model.Trader;
import com.diksha.StreamApi.model.Transaction;



public class MyTransaction {
	public static void main(String[] args) {
		List<Transaction> transactions = new ArrayList<>();
		Collections.addAll(transactions, new Transaction(new Trader("Diksha", "Mumbai"), 2012, 9000),
				new Transaction(new Trader("sakshi", "vikroli"), 2003, 2000),
				new Transaction(new Trader("shilpa", "Thane"), 2011, 9000),
				new Transaction(new Trader("meena", "pune"), 2021, 3000));

				Consumer<Transaction> transact = (t) -> System.out.println(t);
				transactions.forEach(transact);

				Comparator<Transaction> sortingByTransactionValue = (transact1, transact2) -> {
					int result = Integer.compare(transact1.getTransactionValue(), transact2.getTransactionValue());
					if (result == 0)
						transact1.getTrader().getTraderName().compareTo(transact2.getTrader().getTraderName());
					return result;
				};
				// all transactions in the year 2011 and sort them by value (small to high).
				System.out.println("2011 transactions");
				List<Transaction> Transactions2011Insorted = transactions.stream().filter((t) -> t.getTransactionYear() == 2011)
						.sorted(sortingByTransactionValue).collect(Collectors.toList());
				Transactions2011Insorted.forEach((s) -> System.out.println(s));
				//---all the unique cities where the traders work
				Function<Transaction, String> cityNames=(t)->{
					return t.getTrader().getTraderCity();
				};

				List<String> uniqueCityNames=transactions.stream().map(cityNames).distinct().collect(Collectors.toList());


				uniqueCityNames.forEach((e)->System.out.println(e));
				//all traders from Pune and sort them by name
				Comparator<Transaction> traderNamesSorting=(trader1,trader2)->{
					return trader1.getTrader().getTraderName().compareTo(trader2.getTrader().getTraderName());
				};

				List<Transaction> listOfPuneTraders=transactions.stream().filter((trader)->trader.getTrader().getTraderCity().equals("Pune")).sorted(traderNamesSorting).collect(Collectors.toList());
				listOfPuneTraders.forEach((s)->System.out.println(s));

				//names sorted alphabetically.
				Function<Transaction, String> traderNames=(s)->s.getTrader().getTraderName();
				System.out.println(" names sorted alphabetically");
				List<String> traders=transactions.stream().sorted(traderNamesSorting).map(traderNames).collect(Collectors.toList());

				traders.forEach((s)->System.out.println(s));
				

				//Max value of transaction
				int maxValue=transactions.stream().mapToInt((e)->e.getTransactionValue()).max().getAsInt();
				System.out.println("Max value of transaction"+maxValue);
				//Min value of transaction
				int minValue=transactions.stream().mapToInt((e)->e.getTransactionValue()).min().getAsInt();
				System.out.println("Min value of transaction"+minValue);



	}
}
