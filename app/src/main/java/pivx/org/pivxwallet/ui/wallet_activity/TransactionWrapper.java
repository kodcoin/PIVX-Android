package pivx.org.pivxwallet.ui.wallet_activity;

import org.bitcoinj.core.Address;
import org.bitcoinj.core.Coin;
import org.bitcoinj.core.Transaction;

import pivx.org.pivxwallet.contacts.Contact;

/**
 * Created by furszy on 6/29/17.
 */
public class TransactionWrapper {

    public Address getAddress() {
        return address;
    }

    public static enum TransactionUse{
        SENT_SINGLE,
        RECEIVE
        ;

    }

    private Transaction transaction;
    private Contact contact;
    private Coin amount;
    private Address address;
    private TransactionUse transactionUse;

    public TransactionWrapper(Transaction transaction, Contact contact, Coin amount,Address address, TransactionUse transactionUse) {
        this.transaction = transaction;
        this.contact = contact;
        this.amount = amount;
        this.address = address;
        this.transactionUse = transactionUse;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Contact getContact() {
        return contact;
    }

    public Coin getAmount() {
        return amount;
    }

    public TransactionUse getTransactionUse() {
        return transactionUse;
    }

    public boolean isTxMine() {
        return transactionUse == TransactionUse.SENT_SINGLE;
    }
}
