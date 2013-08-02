/**
 * Retail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import com.topsun.posclient.webservice.dto.imports.ExtensionMapper;

/**
 * Retail bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class Retail implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = Retail
	 * Namespace URI = http://www.topsunit.com/rms Namespace Prefix = ns1
	 */

	/**
	 * field for DocNum
	 */

	protected String localDocNum;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDocNumTracker = false;

	public boolean isDocNumSpecified() {
		return localDocNumTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return String
	 */
	public String getDocNum() {
		return localDocNum;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DocNum
	 */
	public void setDocNum(String param) {
		localDocNumTracker = true;

		this.localDocNum = param;

	}

	/**
	 * field for BillNo
	 */

	protected String localBillNo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localBillNoTracker = false;

	public boolean isBillNoSpecified() {
		return localBillNoTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return String
	 */
	public String getBillNo() {
		return localBillNo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            BillNo
	 */
	public void setBillNo(String param) {
		localBillNoTracker = true;

		this.localBillNo = param;

	}

	/**
	 * field for ShopID
	 */

	protected int localShopID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localShopIDTracker = false;

	public boolean isShopIDSpecified() {
		return localShopIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getShopID() {
		return localShopID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ShopID
	 */
	public void setShopID(int param) {
		localShopIDTracker = true;

		this.localShopID = param;

	}

	/**
	 * field for EmployeeID
	 */

	protected int localEmployeeID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEmployeeIDTracker = false;

	public boolean isEmployeeIDSpecified() {
		return localEmployeeIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getEmployeeID() {
		return localEmployeeID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EmployeeID
	 */
	public void setEmployeeID(int param) {
		localEmployeeIDTracker = true;

		this.localEmployeeID = param;

	}

	/**
	 * field for CashierID
	 */

	protected int localCashierID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCashierIDTracker = false;

	public boolean isCashierIDSpecified() {
		return localCashierIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getCashierID() {
		return localCashierID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CashierID
	 */
	public void setCashierID(int param) {
		localCashierIDTracker = true;

		this.localCashierID = param;

	}

	/**
	 * field for CardID
	 */

	protected int localCardID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCardIDTracker = false;

	public boolean isCardIDSpecified() {
		return localCardIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getCardID() {
		return localCardID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CardID
	 */
	public void setCardID(int param) {
		localCardIDTracker = true;

		this.localCardID = param;

	}

	/**
	 * field for EnableBalance
	 */

	protected java.math.BigDecimal localEnableBalance;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEnableBalanceTracker = false;

	public boolean isEnableBalanceSpecified() {
		return localEnableBalanceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getEnableBalance() {
		return localEnableBalance;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EnableBalance
	 */
	public void setEnableBalance(java.math.BigDecimal param) {
		localEnableBalanceTracker = true;

		this.localEnableBalance = param;

	}

	/**
	 * field for EnablePoint
	 */

	protected int localEnablePoint;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEnablePointTracker = false;

	public boolean isEnablePointSpecified() {
		return localEnablePointTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getEnablePoint() {
		return localEnablePoint;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EnablePoint
	 */
	public void setEnablePoint(int param) {
		localEnablePointTracker = true;

		this.localEnablePoint = param;

	}

	/**
	 * field for UseBalance
	 */

	protected java.math.BigDecimal localUseBalance;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUseBalanceTracker = false;

	public boolean isUseBalanceSpecified() {
		return localUseBalanceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getUseBalance() {
		return localUseBalance;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UseBalance
	 */
	public void setUseBalance(java.math.BigDecimal param) {
		localUseBalanceTracker = true;

		this.localUseBalance = param;

	}

	/**
	 * field for UsePoint
	 */

	protected int localUsePoint;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUsePointTracker = false;

	public boolean isUsePointSpecified() {
		return localUsePointTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getUsePoint() {
		return localUsePoint;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UsePoint
	 */
	public void setUsePoint(int param) {
		localUsePointTracker = true;

		this.localUsePoint = param;

	}

	/**
	 * field for AddPoint
	 */

	protected int localAddPoint;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAddPointTracker = false;

	public boolean isAddPointSpecified() {
		return localAddPointTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getAddPoint() {
		return localAddPoint;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AddPoint
	 */
	public void setAddPoint(int param) {
		localAddPointTracker = true;

		this.localAddPoint = param;

	}

	/**
	 * field for SalesDate
	 */

	protected java.util.Calendar localSalesDate;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSalesDateTracker = false;

	public boolean isSalesDateSpecified() {
		return localSalesDateTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getSalesDate() {
		return localSalesDate;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SalesDate
	 */
	public void setSalesDate(java.util.Calendar param) {
		localSalesDateTracker = true;

		this.localSalesDate = param;

	}

	/**
	 * field for Receivable
	 */

	protected java.math.BigDecimal localReceivable;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localReceivableTracker = false;

	public boolean isReceivableSpecified() {
		return localReceivableTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getReceivable() {
		return localReceivable;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Receivable
	 */
	public void setReceivable(java.math.BigDecimal param) {
		localReceivableTracker = true;

		this.localReceivable = param;

	}

	/**
	 * field for Discount
	 */

	protected java.math.BigDecimal localDiscount;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDiscountTracker = false;

	public boolean isDiscountSpecified() {
		return localDiscountTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getDiscount() {
		return localDiscount;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Discount
	 */
	public void setDiscount(java.math.BigDecimal param) {
		localDiscountTracker = true;

		this.localDiscount = param;

	}

	/**
	 * field for Totals
	 */

	protected java.math.BigDecimal localTotals;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localTotalsTracker = false;

	public boolean isTotalsSpecified() {
		return localTotalsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getTotals() {
		return localTotals;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Totals
	 */
	public void setTotals(java.math.BigDecimal param) {
		localTotalsTracker = true;

		this.localTotals = param;

	}

	/**
	 * field for IsReturn
	 */

	protected int localIsReturn;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIsReturnTracker = false;

	public boolean isIsReturnSpecified() {
		return localIsReturnTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getIsReturn() {
		return localIsReturn;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IsReturn
	 */
	public void setIsReturn(int param) {
		localIsReturnTracker = true;

		this.localIsReturn = param;

	}

	/**
	 * field for Memo
	 */

	protected String localMemo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMemoTracker = false;

	public boolean isMemoSpecified() {
		return localMemoTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return String
	 */
	public String getMemo() {
		return localMemo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Memo
	 */
	public void setMemo(String param) {
		localMemoTracker = true;

		this.localMemo = param;

	}

	/**
	 * field for AuditDate
	 */

	protected java.util.Calendar localAuditDate;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAuditDateTracker = false;

	public boolean isAuditDateSpecified() {
		return localAuditDateTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getAuditDate() {
		return localAuditDate;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AuditDate
	 */
	public void setAuditDate(java.util.Calendar param) {
		localAuditDateTracker = true;

		this.localAuditDate = param;

	}

	/**
	 * field for AuditID
	 */

	protected int localAuditID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAuditIDTracker = false;

	public boolean isAuditIDSpecified() {
		return localAuditIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getAuditID() {
		return localAuditID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AuditID
	 */
	public void setAuditID(int param) {
		localAuditIDTracker = true;

		this.localAuditID = param;

	}

	/**
	 * field for Retail_Ms
	 */

	protected ArrayOfRetail_M localRetail_Ms;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRetail_MsTracker = false;

	public boolean isRetail_MsSpecified() {
		return localRetail_MsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return ArrayOfRetail_M
	 */
	public ArrayOfRetail_M getRetail_Ms() {
		return localRetail_Ms;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Retail_Ms
	 */
	public void setRetail_Ms(ArrayOfRetail_M param) {
		localRetail_MsTracker = true;

		this.localRetail_Ms = param;

	}

	/**
	 * field for Retail_Ps
	 */

	protected ArrayOfRetail_P localRetail_Ps;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRetail_PsTracker = false;

	public boolean isRetail_PsSpecified() {
		return localRetail_PsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return ArrayOfRetail_P
	 */
	public ArrayOfRetail_P getRetail_Ps() {
		return localRetail_Ps;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Retail_Ps
	 */
	public void setRetail_Ps(ArrayOfRetail_P param) {
		localRetail_PsTracker = true;

		this.localRetail_Ps = param;

	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
				this, parentQName);
		return factory.createOMElement(dataSource, parentQName);

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			XMLStreamWriter xmlWriter, boolean serializeType)
			throws XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://www.topsunit.com/rms");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":Retail", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"Retail", xmlWriter);
			}

		}
		if (localDocNumTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "docNum", xmlWriter);

			if (localDocNum == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localDocNum);

			}

			xmlWriter.writeEndElement();
		}
		if (localBillNoTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "billNo", xmlWriter);

			if (localBillNo == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localBillNo);

			}

			xmlWriter.writeEndElement();
		}
		if (localShopIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "shopID", xmlWriter);

			if (localShopID == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localShopID));
			}

			xmlWriter.writeEndElement();
		}
		if (localEmployeeIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "employeeID", xmlWriter);

			if (localEmployeeID == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localEmployeeID));
			}

			xmlWriter.writeEndElement();
		}
		if (localCashierIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "cashierID", xmlWriter);

			if (localCashierID == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCashierID));
			}

			xmlWriter.writeEndElement();
		}
		if (localCardIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "cardID", xmlWriter);

			if (localCardID == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCardID));
			}

			xmlWriter.writeEndElement();
		}
		if (localEnableBalanceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "enableBalance", xmlWriter);

			if (localEnableBalance == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localEnableBalance));

			}

			xmlWriter.writeEndElement();
		}
		if (localEnablePointTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "enablePoint", xmlWriter);

			if (localEnablePoint == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localEnablePoint));
			}

			xmlWriter.writeEndElement();
		}
		if (localUseBalanceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "useBalance", xmlWriter);

			if (localUseBalance == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localUseBalance));

			}

			xmlWriter.writeEndElement();
		}
		if (localUsePointTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "usePoint", xmlWriter);

			if (localUsePoint == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localUsePoint));
			}

			xmlWriter.writeEndElement();
		}
		if (localAddPointTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "addPoint", xmlWriter);

			if (localAddPoint == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAddPoint));
			}

			xmlWriter.writeEndElement();
		}
		if (localSalesDateTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "salesDate", xmlWriter);

			if (localSalesDate == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSalesDate));

			}

			xmlWriter.writeEndElement();
		}
		if (localReceivableTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "receivable", xmlWriter);

			if (localReceivable == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localReceivable));

			}

			xmlWriter.writeEndElement();
		}
		if (localDiscountTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "discount", xmlWriter);

			if (localDiscount == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localDiscount));

			}

			xmlWriter.writeEndElement();
		}
		if (localTotalsTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "totals", xmlWriter);

			if (localTotals == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localTotals));

			}

			xmlWriter.writeEndElement();
		}
		if (localIsReturnTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "isReturn", xmlWriter);

			if (localIsReturn == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localIsReturn));
			}

			xmlWriter.writeEndElement();
		}
		if (localMemoTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "memo", xmlWriter);

			if (localMemo == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localMemo);

			}

			xmlWriter.writeEndElement();
		}
		if (localAuditDateTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "auditDate", xmlWriter);

			if (localAuditDate == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAuditDate));

			}

			xmlWriter.writeEndElement();
		}
		if (localAuditIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "auditID", xmlWriter);

			if (localAuditID == Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAuditID));
			}

			xmlWriter.writeEndElement();
		}
		if (localRetail_MsTracker) {
			if (localRetail_Ms == null) {

				writeStartElement(null, "http://www.topsunit.com/rms",
						"retail_Ms", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localRetail_Ms.serialize(new javax.xml.namespace.QName(
						"http://www.topsunit.com/rms", "retail_Ms"), xmlWriter);
			}
		}
		if (localRetail_PsTracker) {
			if (localRetail_Ps == null) {

				writeStartElement(null, "http://www.topsunit.com/rms",
						"retail_Ps", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localRetail_Ps.serialize(new javax.xml.namespace.QName(
						"http://www.topsunit.com/rms", "retail_Ps"), xmlWriter);
			}
		}
		xmlWriter.writeEndElement();

	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://www.topsunit.com/rms")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(String prefix,
			String namespace, String localPart,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(namespace, localPart);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(String prefix,
			String namespace, String attName,
			String attValue,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(String namespace,
			String attName, String attValue,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(String namespace,
			String attName, javax.xml.namespace.QName qname,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {

		String attributeNamespace = qname.getNamespaceURI();
		String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix
						+ ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			XMLStreamWriter xmlWriter)
			throws XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			StringBuffer stringToWrite = new StringBuffer();
			String namespaceURI = null;
			String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite
								.append(prefix)
								.append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				} else {
					stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private String registerPrefix(
			XMLStreamWriter xmlWriter,
			String namespace)
			throws XMLStreamException {
		String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter
					.getNamespaceContext();
			while (true) {
				String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil
						.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 * 
	 */
	public XMLStreamReader getPullParser(
			javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		if (localDocNumTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "docNum"));

			elementList.add(localDocNum == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDocNum));
		}
		if (localBillNoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "billNo"));

			elementList.add(localBillNo == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localBillNo));
		}
		if (localShopIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "shopID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localShopID));
		}
		if (localEmployeeIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "employeeID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localEmployeeID));
		}
		if (localCashierIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "cashierID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localCashierID));
		}
		if (localCardIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "cardID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localCardID));
		}
		if (localEnableBalanceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "enableBalance"));

			elementList.add(localEnableBalance == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localEnableBalance));
		}
		if (localEnablePointTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "enablePoint"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localEnablePoint));
		}
		if (localUseBalanceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "useBalance"));

			elementList.add(localUseBalance == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localUseBalance));
		}
		if (localUsePointTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "usePoint"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localUsePoint));
		}
		if (localAddPointTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "addPoint"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAddPoint));
		}
		if (localSalesDateTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "salesDate"));

			elementList.add(localSalesDate == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localSalesDate));
		}
		if (localReceivableTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "receivable"));

			elementList.add(localReceivable == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localReceivable));
		}
		if (localDiscountTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "discount"));

			elementList.add(localDiscount == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDiscount));
		}
		if (localTotalsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "totals"));

			elementList.add(localTotals == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localTotals));
		}
		if (localIsReturnTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "isReturn"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localIsReturn));
		}
		if (localMemoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "memo"));

			elementList.add(localMemo == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localMemo));
		}
		if (localAuditDateTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "auditDate"));

			elementList.add(localAuditDate == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localAuditDate));
		}
		if (localAuditIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "auditID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAuditID));
		}
		if (localRetail_MsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "retail_Ms"));

			elementList.add(localRetail_Ms == null ? null : localRetail_Ms);
		}
		if (localRetail_PsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "retail_Ps"));

			elementList.add(localRetail_Ps == null ? null : localRetail_Ps);
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
				qName, elementList.toArray(), attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static Retail parse(XMLStreamReader reader)
				throws Exception {
			Retail object = new Retail();

			int event;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					String fullTypeName = reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type");
					if (fullTypeName != null) {
						String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						String type = fullTypeName
								.substring(fullTypeName.indexOf(":") + 1);

						if (!"Retail".equals(type)) {
							// find namespace for the prefix
							String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (Retail) ExtensionMapper.getTypeObject(
									nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "docNum")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setDocNum(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "billNo")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setBillNo(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "shopID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setShopID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setShopID(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setShopID(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "employeeID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setEmployeeID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setEmployeeID(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setEmployeeID(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "cashierID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setCashierID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setCashierID(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setCashierID(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "cardID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setCardID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setCardID(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setCardID(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "enableBalance")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setEnableBalance(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDecimal(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "enablePoint")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setEnablePoint(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setEnablePoint(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setEnablePoint(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "useBalance")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setUseBalance(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDecimal(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "usePoint")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setUsePoint(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setUsePoint(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setUsePoint(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "addPoint")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setAddPoint(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setAddPoint(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setAddPoint(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "salesDate")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setSalesDate(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDateTime(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "receivable")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setReceivable(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDecimal(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "discount")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setDiscount(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDecimal(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "totals")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setTotals(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDecimal(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "isReturn")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setIsReturn(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setIsReturn(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setIsReturn(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "memo")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setMemo(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "auditDate")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setAuditDate(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToDateTime(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "auditID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						String content = reader.getElementText();

						object.setAuditID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setAuditID(Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setAuditID(Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "retail_Ms")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setRetail_Ms(null);
						reader.next();

						reader.next();

					} else {

						object.setRetail_Ms(ArrayOfRetail_M.Factory
								.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "retail_Ps")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setRetail_Ps(null);
						reader.next();

						reader.next();

					} else {

						object.setRetail_Ps(ArrayOfRetail_P.Factory
								.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());

			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}

	}// end of factory class

}
