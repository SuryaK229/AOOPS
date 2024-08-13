public class AuctionSystem {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder bidder1 = new ConcreteBidder("Bidder 1");
        Bidder bidder2 = new ConcreteBidder("Bidder 2");

        auction.addBidder(bidder1);
        auction.addBidder(bidder2);

        auction.setAuctionEvent("Item available for bidding");
        auction.setAuctionEvent("Bidding has started");
        
        auction.removeBidder(bidder2);

        auction.setAuctionEvent("Bidding has ended");
    }
}
