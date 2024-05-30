package com.inventoryservice.Services;

import com.inventoryservice.DTO.Request.Inventory.InventoryCreateRequest;
import com.inventoryservice.DTO.Request.Inventory.InventoryUpdateRequest;
import com.inventoryservice.Exception.InventoryNotFoundException;
import com.inventoryservice.Models.Inventory;

import java.util.List;
import java.util.UUID;

public interface InventoryService {

    Inventory saveInventory(InventoryCreateRequest inventoryCreateRequest);

   // Inventory getInventory(UUID id) throws InventoryNotFoundException;

    Inventory findById(UUID id);

    List<Inventory> getAllInventory();

    Inventory updateInventory(UUID id, InventoryUpdateRequest inventoryUpdateRequest) throws InventoryNotFoundException;


//    List<Inventory> getAllInventories();
//    Inventory getInventoryById(long id);
//    Inventory updateInventory(Inventory inventory, long id);
//    void deleteInventory(long id);
}
