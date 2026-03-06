public class MainSystem {
    public static void main(String[] args) {
        
        // 1. Initialize the chain of waste collectors
        WasteCollector organicCollector = new OrganicCollector();
        WasteCollector recyclableCollector = new RecyclableCollector();
        WasteCollector hazardousCollector = new HazardousCollector();

        // Build the chain: Organic -> Recyclable -> Hazardous
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // 2. Sample waste containers for validation
        WasteContainer fullOrganic = new WasteContainer(WasteType.ORGANIC, 50, true);
        WasteContainer fullRecyclable = new WasteContainer(WasteType.RECYCLABLE, 30, true);
        WasteContainer fullHazardous = new WasteContainer(WasteType.HAZARDOUS, 10, true);
        WasteContainer halfFullOrganic = new WasteContainer(WasteType.ORGANIC, 50, false);
        WasteContainer alienWaste = new WasteContainer(WasteType.UNREGISTERED, 100, true);

        // 3. Process the containers starting from the head of the chain
        System.out.println("--- Starting Waste Collection Process ---");
        
        System.out.print("Test 1 (Full Organic): ");
        organicCollector.processWaste(fullOrganic);

        System.out.print("Test 2 (Full Recyclable): ");
        organicCollector.processWaste(fullRecyclable);

        System.out.print("Test 3 (Full Hazardous): ");
        organicCollector.processWaste(fullHazardous);

        System.out.print("Test 4 (Half-full Organic): ");
        organicCollector.processWaste(halfFullOrganic);

        System.out.print("Test 5 (Unregistered Waste): ");
        organicCollector.processWaste(alienWaste);
    }
}