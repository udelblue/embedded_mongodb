package br.com.udelblue.spring.boot.data.embedded.mongodb.domain;

public class Thumbdrive extends Product {

	Integer gigabytes;

	public Thumbdrive(Integer id, String company, String name, Integer gigabytes) {
		super(id, company, name, Type.THUMBDRIVE);
		this.gigabytes = gigabytes;
	}

	public Integer getGigabytes() {
		return gigabytes;
	}

}
