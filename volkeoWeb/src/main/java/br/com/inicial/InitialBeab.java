package br.com.inicial;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MB")
@ViewScoped
public class InitialBeab {

	private String t1;

	public String getT1() {
		t1 = "teste";
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

}
