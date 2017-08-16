package com.yantriks.oic.inventory;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yantriks.oic.AppConfig;
import com.yantriks.oic.inventory.services.InventorySerivce;
import com.yantriks.oic.models.InventoryRecord;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class IntentoryService {
@Autowired
InventorySerivce invService;

  @Test
  public void createInventoryRecord() {
	  InventoryRecord ir = new InventoryRecord();
	  assertNotNull(invService);
	  List<InventoryRecord> invRecordList = invService.getAllRecords();
  }

}
