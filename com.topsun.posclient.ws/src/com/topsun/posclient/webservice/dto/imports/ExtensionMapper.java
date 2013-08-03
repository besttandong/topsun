/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto.imports;

import com.topsun.posclient.webservice.dto.ArrayOfRetail;
import com.topsun.posclient.webservice.dto.ArrayOfRetail_M;
import com.topsun.posclient.webservice.dto.ArrayOfRetail_P;
import com.topsun.posclient.webservice.dto.ArrayOfauth;
import com.topsun.posclient.webservice.dto.ArrayOfbackWarehouse;
import com.topsun.posclient.webservice.dto.ArrayOfbackWarehouseItem;
import com.topsun.posclient.webservice.dto.ArrayOfitem;
import com.topsun.posclient.webservice.dto.ArrayOfresultBackWarehouse;
import com.topsun.posclient.webservice.dto.ArrayOfshopAllot;
import com.topsun.posclient.webservice.dto.ArrayOfshopAllotNum;
import com.topsun.posclient.webservice.dto.ArrayOfsyncItemDataResultItem;
import com.topsun.posclient.webservice.dto.ArrayOfuser;
import com.topsun.posclient.webservice.dto.Auth;
import com.topsun.posclient.webservice.dto.BackWarehouse;
import com.topsun.posclient.webservice.dto.BackWarehouseItem;
import com.topsun.posclient.webservice.dto.GetUserInfoReq;
import com.topsun.posclient.webservice.dto.GetUserInfoResult;
import com.topsun.posclient.webservice.dto.Item;
import com.topsun.posclient.webservice.dto.ProcessResult;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryReq;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryReqCondition;
import com.topsun.posclient.webservice.dto.QueryReturnRepositoryResult;
import com.topsun.posclient.webservice.dto.QueryShopAllotReq;
import com.topsun.posclient.webservice.dto.QueryShopAllotReqCondition;
import com.topsun.posclient.webservice.dto.QueryShopAllotResult;
import com.topsun.posclient.webservice.dto.ResultBackWarehouse;
import com.topsun.posclient.webservice.dto.Retail;
import com.topsun.posclient.webservice.dto.Retail_M;
import com.topsun.posclient.webservice.dto.Retail_P;
import com.topsun.posclient.webservice.dto.SavePartSalesReq;
import com.topsun.posclient.webservice.dto.SavePartSalesResult;
import com.topsun.posclient.webservice.dto.SaveReturnRepositoryReq;
import com.topsun.posclient.webservice.dto.SaveReturnRepositoryResult;
import com.topsun.posclient.webservice.dto.SaveShopAllotReq;
import com.topsun.posclient.webservice.dto.SaveShopAllotResult;
import com.topsun.posclient.webservice.dto.ShopAllot;
import com.topsun.posclient.webservice.dto.ShopAllotNum;
import com.topsun.posclient.webservice.dto.SyncItemDataReq;
import com.topsun.posclient.webservice.dto.SyncItemDataReqCondition;
import com.topsun.posclient.webservice.dto.SyncItemDataResult;
import com.topsun.posclient.webservice.dto.SyncItemDataResultItem;
import com.topsun.posclient.webservice.dto.User;
import com.topsun.posclient.webservice.dto.UserCredential;
import com.topsun.posclient.webservice.schemas.Duration;
import com.topsun.posclient.webservice.schemas.Guid;
import com.topsun.posclient.webservice.schemas._char;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
			java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
			throws java.lang.Exception {

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "getUserInfoReq".equals(typeName)) {

			return GetUserInfoReq.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfitem".equals(typeName)) {

			return ArrayOfitem.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryReturnRepositoryResult".equals(typeName)) {

			return QueryReturnRepositoryResult.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "savePartSalesReq".equals(typeName)) {

			return SavePartSalesReq.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "syncItemDataReqCondition".equals(typeName)) {

			return SyncItemDataReqCondition.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryShopAllotResult".equals(typeName)) {

			return QueryShopAllotResult.Factory
					.parse(reader);

		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "char".equals(typeName)) {

			return _char.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "saveReturnRepositoryResult".equals(typeName)) {

			return SaveReturnRepositoryResult.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryReturnRepositoryReq".equals(typeName)) {

			return QueryReturnRepositoryReq.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryReturnRepositoryReqCondition".equals(typeName)) {

			return QueryReturnRepositoryReqCondition.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfRetail".equals(typeName)) {

			return ArrayOfRetail.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "saveShopAllotReq".equals(typeName)) {

			return SaveShopAllotReq.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "shopAllotNum".equals(typeName)) {

			return ShopAllotNum.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "backWarehouse".equals(typeName)) {

			return BackWarehouse.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "saveShopAllotResult".equals(typeName)) {

			return SaveShopAllotResult.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "processResult".equals(typeName)) {

			return ProcessResult.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "resultBackWarehouse".equals(typeName)) {

			return ResultBackWarehouse.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "userCredential".equals(typeName)) {

			return UserCredential.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "syncItemDataResultItem".equals(typeName)) {

			return SyncItemDataResultItem.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryShopAllotReqCondition".equals(typeName)) {

			return QueryShopAllotReqCondition.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "getUserInfoResult".equals(typeName)) {

			return GetUserInfoResult.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "shopAllot".equals(typeName)) {

			return ShopAllot.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "syncItemDataResult".equals(typeName)) {

			return SyncItemDataResult.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfresultBackWarehouse".equals(typeName)) {

			return ArrayOfresultBackWarehouse.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "item".equals(typeName)) {

			return Item.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "Retail".equals(typeName)) {

			return Retail.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "Retail_P".equals(typeName)) {

			return Retail_P.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "queryShopAllotReq".equals(typeName)) {

			return QueryShopAllotReq.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "user".equals(typeName)) {

			return User.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "backWarehouseItem".equals(typeName)) {

			return BackWarehouseItem.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "auth".equals(typeName)) {

			return Auth.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfsyncItemDataResultItem".equals(typeName)) {

			return ArrayOfsyncItemDataResultItem.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfbackWarehouse".equals(typeName)) {

			return ArrayOfbackWarehouse.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "Retail_M".equals(typeName)) {

			return Retail_M.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "saveReturnRepositoryReq".equals(typeName)) {

			return SaveReturnRepositoryReq.Factory
					.parse(reader);

		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "guid".equals(typeName)) {

			return Guid.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "syncItemDataReq".equals(typeName)) {

			return SyncItemDataReq.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfauth".equals(typeName)) {

			return ArrayOfauth.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfbackWarehouseItem".equals(typeName)) {

			return ArrayOfbackWarehouseItem.Factory
					.parse(reader);

		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/"
				.equals(namespaceURI) && "duration".equals(typeName)) {

			return Duration.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfshopAllotNum".equals(typeName)) {

			return ArrayOfshopAllotNum.Factory
					.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfRetail_M".equals(typeName)) {

			return ArrayOfRetail_M.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfshopAllot".equals(typeName)) {

			return ArrayOfshopAllot.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfRetail_P".equals(typeName)) {

			return ArrayOfRetail_P.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "ArrayOfuser".equals(typeName)) {

			return ArrayOfuser.Factory.parse(reader);

		}

		if ("http://www.topsunit.com/rms".equals(namespaceURI)
				&& "savePartSalesResult".equals(typeName)) {

			return SavePartSalesResult.Factory
					.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type "
				+ namespaceURI + " " + typeName);
	}

}
