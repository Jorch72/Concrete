package com.elytradev.concrete.reflect.invoker;

public interface Invoker {
	Object invoke(Object owner, Object... args);
}