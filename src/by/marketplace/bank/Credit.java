package by.marketplace.bank;

import by.marketplace.assets.Assets;

/**
 * Credit is a type of transaction when targeted account
 * is acting as the source of assets being transfered.
 * 
 * Every 'credite' operation has destination account
 * to which assets is to be transfered
 * 
 * @author A.Lagunov
 *
 */

public class Credit extends Transaction {
	
	private Account destination;
	
	private Assets asset;
	
	public Credit(Assets asset, Account destination) {
		super(asset);
		this.destination = destination;
	}

	public Account getDestination() {
		return destination;
	}

	public void setDestination(Account destination) {
		this.destination = destination;
	}

	public Assets getAsset() {
		return asset;
	}

	public void setAsset(Assets asset) {
		this.asset = asset;
	}

}
