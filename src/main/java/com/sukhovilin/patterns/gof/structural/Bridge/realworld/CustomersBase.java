package com.sukhovilin.patterns.gof.structural.Bridge.realworld;

/**
 * The 'Abstraction' class
 */
class CustomersBase {
	private DataObject dataObject;
	protected String group;

	public CustomersBase(String group) {
		this.group = group;
	}

	// Property
	public DataObject getData() {
		return this.dataObject;
	}

	public void setData(DataObject dataObject) {
		this.dataObject = dataObject;
	}

	public void Next() {
		this.dataObject.nextRecord();
	}

	public void Prior() {
		this.dataObject.priorRecord();
	}

	public void Add(String customer) {
		this.dataObject.addRecord(customer);
	}

	public void Delete(String customer) {
		this.dataObject.deleteRecord(customer);
	}

	public void Show() {
		this.dataObject.showRecord();
	}

	public void ShowAll() {
		System.out.println("Customer Group: " + group);
		this.dataObject.showAllRecords();
	}
}