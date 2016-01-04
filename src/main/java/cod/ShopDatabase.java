package cod;

import cod.tcf.Shop;
import java.util.Optional;

/**
 * The Shop database allows one to access to TCF's Shops.
 */
public interface ShopDatabase {

	/**
	 * Add a given Shop in the database
	 * @param c the Shop to be added
	 */
	void add(Shop c);

	/**
	 * Looks for a Shop based on a given first name
	 * @param firstName the key used for user retrieval search in the database
	 * @return An optional that contains the Shop if found, Empty is no one was found.
	 */
	Optional<Shop> findByFirstName(String firstName);

}
