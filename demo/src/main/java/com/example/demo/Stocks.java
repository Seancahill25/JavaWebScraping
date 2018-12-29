package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity

@Table(name="stocks")
public class Stocks {
	
	@Id
	@Column(name="id")
    private int Id;
	
	@Column(name="symbol")
	private String Symbol;
	
	@Column(name="lastPrice")
	private String LastPrice;
	
	@Column(name="change")
	private String Change;
	
	@Column(name="percentChg")
	private String PercentChg;
	
	@Column(name="currency")
	private String Currency;
	
	@Column(name="marketTime")
	private String MarketTime;
	
	@Column(name="volume")
	private String Volume;
	
	@Column(name="avgVol")
	private String AvgVol;
	
	@Column(name="marketCap")
	private String MarketCap;
	
	public Stocks() {	
	}
	
	public Stocks(int id, String symbol, String lastPrice, String change,
			String percentChg, String currency, String marketTime, String volume,
			String avgVol, String marketCap) {
		super();
		Id = id;
		Symbol = symbol;
		LastPrice = lastPrice;
		Change = change;
		PercentChg = percentChg;
		Currency = currency;
		MarketTime = marketTime;
		Volume = volume;
		AvgVol = avgVol;
		MarketCap = marketCap;
	}
	@Override
	public String toString() {
		return "Stocks [Id=" + Id + ", Symbol=" + Symbol + ", LastPrice=" + LastPrice
				+ ", Change=" + Change + ", PercentChg=" + PercentChg + ", Currency=" + Currency
				+ ", MarketTime=" + MarketTime + ", Volume=" + Volume + ", AvgVol=" + AvgVol
				+ ", MarketCap=" + MarketCap + "]";
	}
}
