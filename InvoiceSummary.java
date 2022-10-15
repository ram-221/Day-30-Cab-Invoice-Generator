package com.bridgelabz;

public class InvoiceSummary {

	private  final int noOfInvoice;
	private  final double totalFare;
	private final double averageFare;

	public InvoiceSummary(int noOfInvoice, double totalFare){
		this.noOfInvoice = noOfInvoice;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.noOfInvoice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		InvoiceSummary summary = (InvoiceSummary) o;
		return noOfInvoice == summary.noOfInvoice && Double.compare(summary.totalFare, totalFare) == 0 && Double.compare(summary.averageFare, averageFare) == 0;
	}
}
