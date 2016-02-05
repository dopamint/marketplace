package by.marketplace.misc;

/**
 * Taxpayer Identification Number
 * @author A.Lagunov
 *
 */

public class TIN implements Identifier {

	private String unn;

	@Override
	public boolean equals(Identifier id) {
		if (id.equals(this)) return true;
		try {
			TIN tin = (TIN) id;
			if (tin.unn.equals(this.unn)) return true;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
