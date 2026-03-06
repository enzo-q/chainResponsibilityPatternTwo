public class OrganicCollector extends WasteCollector {
    
    @Override
    protected boolean canHandle(WasteType type) {
        return type == WasteType.ORGANIC;
    }

    @Override
    protected void handle(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Organic Collector: Emptied organic waste. Capacity processed: " + container.getCapacity() + " units.");
        } else {
            System.out.println("Organic Collector: Container is not full yet. No action taken.");
        }
    }
}