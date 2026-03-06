public class RecyclableCollector extends WasteCollector {
    
    @Override
    protected boolean canHandle(WasteType type) {
        return type == WasteType.RECYCLABLE;
    }

    @Override
    protected void handle(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Recyclable Collector: Processed recyclable waste. Capacity processed: " + container.getCapacity() + " units.");
        } else {
            System.out.println("Recyclable Collector: Container is not full yet. No action taken.");
        }
    }
}