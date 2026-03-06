public class HazardousCollector extends WasteCollector {
    
    @Override
    protected boolean canHandle(WasteType type) {
        return type == WasteType.HAZARDOUS;
    }

    @Override
    protected void handle(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Hazardous Collector: Safely disposed of hazardous waste. Capacity processed: " + container.getCapacity() + " units.");
        } else {
            System.out.println("Hazardous Collector: Container is not full yet. No action taken.");
        }
    }
}