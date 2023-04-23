/*----------------------------------------------------------------
	FILE		: IBinaryPredicate.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	IBinaryPredicate interface is a predicate that represent the predicate on functional interfaces but two parameter
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.functionalInterfaces;

@FunctionalInterface
public interface IBinaryPredicate<T>
{
    boolean test(T t1, T t2);
}
