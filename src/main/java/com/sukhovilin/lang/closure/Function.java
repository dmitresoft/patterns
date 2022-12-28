package com.sukhovilin.lang.closure;

public interface Function<V, T> {
	
	T apply(V input);
	
}
