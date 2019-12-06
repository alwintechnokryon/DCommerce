package com.technokryon.ecommerce.dao;

import java.util.List;

import com.technokryon.ecommerce.model.TKECMCATEGORY;
import com.technokryon.ecommerce.pojo.PJ_TKECMCATEGORY;

public interface CategoryDao {

	String addCategory(PJ_TKECMCATEGORY rO_PJ_TKECMCATEGORY);

	List<PJ_TKECMCATEGORY> categoryList();

	List<PJ_TKECMCATEGORY> categoryListById(PJ_TKECMCATEGORY rO_PJ_TKECMCATEGORY);

}
