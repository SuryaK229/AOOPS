import java.util.ArrayList;
import java.util.List;

// Subject Interface
class Auction {
    private List<Bidder> bidders = new ArrayList<>();
    private String auctionEvent;

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void setAuctionEvent(String auctionEvent) {
        this.auctionEvent = auctionEvent;
        notifyBidders();
    }

    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(auctionEvent);
        }
    }
}
