package test.iterator;

public interface IMenu<T> {
	IMyIterator<T> createIterator();
}
