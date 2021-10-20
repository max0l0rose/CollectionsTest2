package com.company;

public class Class0 {

	int val;

	public Class0(int val) {
		this.val = val;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		String cname = getClass().getName(); // norm
		String oname = o.getClass().getName();
		if (o == null || getClass() != o.getClass()) return false;

		Class0 class0 = (Class0) o;

		return val == class0.val;
	}

	@Override
	public int hashCode() {
		return 0;
	}
}

