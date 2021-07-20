package com.jp.design.patterns.creational.builder;

public class Customer {

	private Integer customerId;
	private String customerName;
	private String accountType;

	private Customer(Builder builder) {
		this.customerId = builder.customerId;
		this.customerName = builder.customerName;
		this.accountType = builder.accountType;
	}

	static class Builder {
		private Integer customerId;
		private String customerName;
		private String accountType;

		public Builder() {

		}

		public Builder customerId(Integer customerId) {
			this.customerId = customerId;
			return this;
		}

		public Builder customerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		public Builder accountType(String accountType) {
			this.accountType = accountType;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}

	}

	public static Builder builder() {
		return new Builder();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", accountType=" + accountType
				+ "]";
	}

}

class CustomerBuilderExecutor {
	public static void main(String[] args) {

		
		final Customer customer1 = Customer.builder().customerId(123).customerName("tom").accountType("saving").build();
		final Customer customer2 = Customer.builder().customerId(987).customerName("ravi").accountType("current")
				.build();

		System.out.println(customer1);
		System.out.println(customer2);

	}
}
