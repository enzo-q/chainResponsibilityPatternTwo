public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    // The parent handles the "chain" routing logic!
    public void processWaste(WasteContainer container) {
        if (canHandle(container.getType())) {
            handle(container); // Process it if it's a match
        } else if (nextCollector != null) {
            nextCollector.processWaste(container); // Pass it on
        } else {
            System.out.println("Error: No collector found for " + container.getType());
        }
    }

    // Child classes ONLY implement these two specific methods
    protected abstract boolean canHandle(WasteType type);
    protected abstract void handle(WasteContainer container);
}