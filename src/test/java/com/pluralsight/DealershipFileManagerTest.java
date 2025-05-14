package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {

    @org.junit.jupiter.api.Test
    void getDealership() {
        // Dealership dealership = new Dealership("Din's Cars", "1717 E 18", "347-972-1430");

        DealershipFileManager fileManager = new DealershipFileManager();

        fileManager.getDealership();

    }
}