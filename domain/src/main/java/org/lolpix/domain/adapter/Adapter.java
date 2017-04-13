package org.lolpix.domain.adapter;

interface Adapter<T, IDType> {

	T get(IDType id);
	T add(T element);
	void delete(T element);
	T update(T element);
}
