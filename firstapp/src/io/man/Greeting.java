package io.man;

public interface Greeting {

	void perform();
	default void add(){}
}
