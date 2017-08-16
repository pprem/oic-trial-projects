package com.yantriks.oic.inventory.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yantriks.oic.models.InventoryRecord;

@Service
public class InventorySerivce {

	public List<InventoryRecord> getAllRecords() {
		List invRecords = new ArrayList<InventoryRecord>();
		invRecords.add(new InventoryRecord());
		return invRecords;
		
	}

}
