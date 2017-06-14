package Specification;

public interface ISpecification<T> {
	public boolean isSatisfiedBy(T member);
}
