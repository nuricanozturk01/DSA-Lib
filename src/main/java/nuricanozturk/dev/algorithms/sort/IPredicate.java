package nuricanozturk.dev.algorithms.sort;

@FunctionalInterface
public interface IPredicate <T>
{
    boolean test(T t1, T t2);
}
