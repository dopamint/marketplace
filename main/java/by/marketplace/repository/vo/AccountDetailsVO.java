package by.marketplace.repository.vo;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetailsVO {

	@Id
	@Column(name = "acc_det_id")
	private int id;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "acc_det_id")
	private AccountVO account;

	@Column(name = "frozen")
	private boolean isFrozen = true;

	@ManyToOne
	@JoinColumn(name = "asset_id")
	private AssetVO asset;
	
	@Column(name = "asset_quantity")
	private int quantity;
	
	public AssetVO getAsset() {
		return asset;
	}

	public void setAsset(AssetVO asset) {
		this.asset = asset;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AccountVO getAccount() {
		return account;
	}

	public void setAccount(AccountVO account) {
		this.account = account;
	}

	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

}