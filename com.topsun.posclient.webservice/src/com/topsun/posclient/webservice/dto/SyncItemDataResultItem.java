/**
 * SyncItemDataResultItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto;

import com.topsun.posclient.webservice.dto.imports.ExtensionMapper;

/**
 * SyncItemDataResultItem bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class SyncItemDataResultItem implements
		org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * syncItemDataResultItem Namespace URI = http://www.topsunit.com/rms
	 * Namespace Prefix = ns1
	 */

	/**
	 * field for Id
	 */

	protected int localId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIdTracker = false;

	public boolean isIdSpecified() {
		return localIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getId() {
		return localId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Id
	 */
	public void setId(int param) {

		// setting primitive attribute tracker to true
		localIdTracker = param != java.lang.Integer.MIN_VALUE;

		this.localId = param;

	}

	/**
	 * field for ItemCode
	 */

	protected java.lang.String localItemCode;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localItemCodeTracker = false;

	public boolean isItemCodeSpecified() {
		return localItemCodeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getItemCode() {
		return localItemCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ItemCode
	 */
	public void setItemCode(java.lang.String param) {
		localItemCodeTracker = true;

		this.localItemCode = param;

	}

	/**
	 * field for ItemName
	 */

	protected java.lang.String localItemName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localItemNameTracker = false;

	public boolean isItemNameSpecified() {
		return localItemNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getItemName() {
		return localItemName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ItemName
	 */
	public void setItemName(java.lang.String param) {
		localItemNameTracker = true;

		this.localItemName = param;

	}

	/**
	 * field for ClassId
	 */

	protected int localClassId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localClassIdTracker = false;

	public boolean isClassIdSpecified() {
		return localClassIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getClassId() {
		return localClassId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ClassId
	 */
	public void setClassId(int param) {
		localClassIdTracker = true;

		this.localClassId = param;

	}

	/**
	 * field for DivisionId
	 */

	protected int localDivisionId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDivisionIdTracker = false;

	public boolean isDivisionIdSpecified() {
		return localDivisionIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getDivisionId() {
		return localDivisionId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DivisionId
	 */
	public void setDivisionId(int param) {
		localDivisionIdTracker = true;

		this.localDivisionId = param;

	}

	/**
	 * field for SectionId
	 */

	protected int localSectionId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSectionIdTracker = false;

	public boolean isSectionIdSpecified() {
		return localSectionIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getSectionId() {
		return localSectionId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SectionId
	 */
	public void setSectionId(int param) {
		localSectionIdTracker = true;

		this.localSectionId = param;

	}

	/**
	 * field for UnitId
	 */

	protected int localUnitId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUnitIdTracker = false;

	public boolean isUnitIdSpecified() {
		return localUnitIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getUnitId() {
		return localUnitId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UnitId
	 */
	public void setUnitId(int param) {
		localUnitIdTracker = true;

		this.localUnitId = param;

	}

	/**
	 * field for StdId
	 */

	protected int localStdId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localStdIdTracker = false;

	public boolean isStdIdSpecified() {
		return localStdIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getStdId() {
		return localStdId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StdId
	 */
	public void setStdId(int param) {
		localStdIdTracker = true;

		this.localStdId = param;

	}

	/**
	 * field for SupplierId
	 */

	protected int localSupplierId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSupplierIdTracker = false;

	public boolean isSupplierIdSpecified() {
		return localSupplierIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getSupplierId() {
		return localSupplierId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SupplierId
	 */
	public void setSupplierId(int param) {
		localSupplierIdTracker = true;

		this.localSupplierId = param;

	}

	/**
	 * field for BrandId
	 */

	protected int localBrandId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localBrandIdTracker = false;

	public boolean isBrandIdSpecified() {
		return localBrandIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getBrandId() {
		return localBrandId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            BrandId
	 */
	public void setBrandId(int param) {
		localBrandIdTracker = true;

		this.localBrandId = param;

	}

	/**
	 * field for AreaId
	 */

	protected int localAreaId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAreaIdTracker = false;

	public boolean isAreaIdSpecified() {
		return localAreaIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getAreaId() {
		return localAreaId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AreaId
	 */
	public void setAreaId(int param) {
		localAreaIdTracker = true;

		this.localAreaId = param;

	}

	/**
	 * field for Description
	 */

	protected java.lang.String localDescription;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDescriptionTracker = false;

	public boolean isDescriptionSpecified() {
		return localDescriptionTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDescription() {
		return localDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Description
	 */
	public void setDescription(java.lang.String param) {
		localDescriptionTracker = true;

		this.localDescription = param;

	}

	/**
	 * field for WholesalePrice
	 */

	protected java.math.BigDecimal localWholesalePrice;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localWholesalePriceTracker = false;

	public boolean isWholesalePriceSpecified() {
		return localWholesalePriceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getWholesalePrice() {
		return localWholesalePrice;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            WholesalePrice
	 */
	public void setWholesalePrice(java.math.BigDecimal param) {
		localWholesalePriceTracker = true;

		this.localWholesalePrice = param;

	}

	/**
	 * field for RetailPrice
	 */

	protected java.math.BigDecimal localRetailPrice;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localRetailPriceTracker = false;

	public boolean isRetailPriceSpecified() {
		return localRetailPriceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getRetailPrice() {
		return localRetailPrice;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            RetailPrice
	 */
	public void setRetailPrice(java.math.BigDecimal param) {
		localRetailPriceTracker = true;

		this.localRetailPrice = param;

	}

	/**
	 * field for PurchasePrice
	 */

	protected java.math.BigDecimal localPurchasePrice;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPurchasePriceTracker = false;

	public boolean isPurchasePriceSpecified() {
		return localPurchasePriceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getPurchasePrice() {
		return localPurchasePrice;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PurchasePrice
	 */
	public void setPurchasePrice(java.math.BigDecimal param) {
		localPurchasePriceTracker = true;

		this.localPurchasePrice = param;

	}

	/**
	 * field for ChannelPrice
	 */

	protected java.math.BigDecimal localChannelPrice;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localChannelPriceTracker = false;

	public boolean isChannelPriceSpecified() {
		return localChannelPriceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getChannelPrice() {
		return localChannelPrice;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ChannelPrice
	 */
	public void setChannelPrice(java.math.BigDecimal param) {
		localChannelPriceTracker = true;

		this.localChannelPrice = param;

	}

	/**
	 * field for GuidePrice
	 */

	protected java.math.BigDecimal localGuidePrice;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localGuidePriceTracker = false;

	public boolean isGuidePriceSpecified() {
		return localGuidePriceTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getGuidePrice() {
		return localGuidePrice;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            GuidePrice
	 */
	public void setGuidePrice(java.math.BigDecimal param) {
		localGuidePriceTracker = true;

		this.localGuidePrice = param;

	}

	/**
	 * field for Delflg
	 */

	protected int localDelflg;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDelflgTracker = false;

	public boolean isDelflgSpecified() {
		return localDelflgTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getDelflg() {
		return localDelflg;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Delflg
	 */
	public void setDelflg(int param) {

		// setting primitive attribute tracker to true
		localDelflgTracker = param != java.lang.Integer.MIN_VALUE;

		this.localDelflg = param;

	}

	/**
	 * field for Creater
	 */

	protected int localCreater;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCreaterTracker = false;

	public boolean isCreaterSpecified() {
		return localCreaterTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getCreater() {
		return localCreater;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Creater
	 */
	public void setCreater(int param) {

		// setting primitive attribute tracker to true
		localCreaterTracker = param != java.lang.Integer.MIN_VALUE;

		this.localCreater = param;

	}

	/**
	 * field for CreatedTime
	 */

	protected java.util.Calendar localCreatedTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCreatedTimeTracker = false;

	public boolean isCreatedTimeSpecified() {
		return localCreatedTimeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getCreatedTime() {
		return localCreatedTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CreatedTime
	 */
	public void setCreatedTime(java.util.Calendar param) {
		localCreatedTimeTracker = param != null;

		this.localCreatedTime = param;

	}

	/**
	 * field for Updater
	 */

	protected int localUpdater;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUpdaterTracker = false;

	public boolean isUpdaterSpecified() {
		return localUpdaterTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getUpdater() {
		return localUpdater;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Updater
	 */
	public void setUpdater(int param) {
		localUpdaterTracker = true;

		this.localUpdater = param;

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
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://www.topsunit.com/rms");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":syncItemDataResultItem", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"syncItemDataResultItem", xmlWriter);
			}

		}
		if (localIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "id", xmlWriter);

			if (localId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"id cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localId));
			}

			xmlWriter.writeEndElement();
		}
		if (localItemCodeTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "itemCode", xmlWriter);

			if (localItemCode == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localItemCode);

			}

			xmlWriter.writeEndElement();
		}
		if (localItemNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "itemName", xmlWriter);

			if (localItemName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localItemName);

			}

			xmlWriter.writeEndElement();
		}
		if (localClassIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "classId", xmlWriter);

			if (localClassId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localClassId));
			}

			xmlWriter.writeEndElement();
		}
		if (localDivisionIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "divisionId", xmlWriter);

			if (localDivisionId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localDivisionId));
			}

			xmlWriter.writeEndElement();
		}
		if (localSectionIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "sectionId", xmlWriter);

			if (localSectionId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSectionId));
			}

			xmlWriter.writeEndElement();
		}
		if (localUnitIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "unitId", xmlWriter);

			if (localUnitId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localUnitId));
			}

			xmlWriter.writeEndElement();
		}
		if (localStdIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "stdId", xmlWriter);

			if (localStdId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localStdId));
			}

			xmlWriter.writeEndElement();
		}
		if (localSupplierIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "supplierId", xmlWriter);

			if (localSupplierId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSupplierId));
			}

			xmlWriter.writeEndElement();
		}
		if (localBrandIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "brandId", xmlWriter);

			if (localBrandId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localBrandId));
			}

			xmlWriter.writeEndElement();
		}
		if (localAreaIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "areaId", xmlWriter);

			if (localAreaId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAreaId));
			}

			xmlWriter.writeEndElement();
		}
		if (localDescriptionTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "description", xmlWriter);

			if (localDescription == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localDescription);

			}

			xmlWriter.writeEndElement();
		}
		if (localWholesalePriceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "wholesalePrice", xmlWriter);

			if (localWholesalePrice == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localWholesalePrice));

			}

			xmlWriter.writeEndElement();
		}
		if (localRetailPriceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "retailPrice", xmlWriter);

			if (localRetailPrice == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localRetailPrice));

			}

			xmlWriter.writeEndElement();
		}
		if (localPurchasePriceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "purchasePrice", xmlWriter);

			if (localPurchasePrice == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localPurchasePrice));

			}

			xmlWriter.writeEndElement();
		}
		if (localChannelPriceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "channelPrice", xmlWriter);

			if (localChannelPrice == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localChannelPrice));

			}

			xmlWriter.writeEndElement();
		}
		if (localGuidePriceTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "guidePrice", xmlWriter);

			if (localGuidePrice == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localGuidePrice));

			}

			xmlWriter.writeEndElement();
		}
		if (localDelflgTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "delflg", xmlWriter);

			if (localDelflg == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"delflg cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localDelflg));
			}

			xmlWriter.writeEndElement();
		}
		if (localCreaterTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "creater", xmlWriter);

			if (localCreater == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"creater cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCreater));
			}

			xmlWriter.writeEndElement();
		}
		if (localCreatedTimeTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "createdTime", xmlWriter);

			if (localCreatedTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"createdTime cannot be null!!");

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCreatedTime));

			}

			xmlWriter.writeEndElement();
		}
		if (localUpdaterTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "updater", xmlWriter);

			if (localUpdater == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localUpdater));
			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://www.topsunit.com/rms")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
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
	private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		xmlWriter.writeAttribute(namespace, attName, attValue);
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
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
	private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
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
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
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
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

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
	private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter
					.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
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
	public javax.xml.stream.XMLStreamReader getPullParser(
			javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		if (localIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "id"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localId));
		}
		if (localItemCodeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "itemCode"));

			elementList.add(localItemCode == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localItemCode));
		}
		if (localItemNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "itemName"));

			elementList.add(localItemName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localItemName));
		}
		if (localClassIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "classId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localClassId));
		}
		if (localDivisionIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "divisionId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localDivisionId));
		}
		if (localSectionIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "sectionId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localSectionId));
		}
		if (localUnitIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "unitId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localUnitId));
		}
		if (localStdIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "stdId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localStdId));
		}
		if (localSupplierIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "supplierId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localSupplierId));
		}
		if (localBrandIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "brandId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localBrandId));
		}
		if (localAreaIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "areaId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAreaId));
		}
		if (localDescriptionTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "description"));

			elementList.add(localDescription == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDescription));
		}
		if (localWholesalePriceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "wholesalePrice"));

			elementList.add(localWholesalePrice == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localWholesalePrice));
		}
		if (localRetailPriceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "retailPrice"));

			elementList.add(localRetailPrice == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localRetailPrice));
		}
		if (localPurchasePriceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "purchasePrice"));

			elementList.add(localPurchasePrice == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localPurchasePrice));
		}
		if (localChannelPriceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "channelPrice"));

			elementList.add(localChannelPrice == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localChannelPrice));
		}
		if (localGuidePriceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "guidePrice"));

			elementList.add(localGuidePrice == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localGuidePrice));
		}
		if (localDelflgTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "delflg"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localDelflg));
		}
		if (localCreaterTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "creater"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localCreater));
		}
		if (localCreatedTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "createdTime"));

			if (localCreatedTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localCreatedTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"createdTime cannot be null!!");
			}
		}
		if (localUpdaterTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "updater"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localUpdater));
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
		public static SyncItemDataResultItem parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			SyncItemDataResultItem object = new SyncItemDataResultItem();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName
								.substring(fullTypeName.indexOf(":") + 1);

						if (!"syncItemDataResultItem".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (SyncItemDataResultItem) ExtensionMapper
									.getTypeObject(nsUri, type, reader);
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
								"http://www.topsunit.com/rms", "id")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "id" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setId(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "itemCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setItemCode(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "itemName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setItemName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "classId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setClassId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setClassId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setClassId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "divisionId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setDivisionId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setDivisionId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setDivisionId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "sectionId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSectionId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setSectionId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setSectionId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "unitId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setUnitId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setUnitId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setUnitId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "stdId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setStdId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setStdId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setStdId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "supplierId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSupplierId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setSupplierId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setSupplierId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "brandId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setBrandId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setBrandId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setBrandId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "areaId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setAreaId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setAreaId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setAreaId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "description")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "wholesalePrice")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setWholesalePrice(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "retailPrice")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setRetailPrice(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "purchasePrice")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setPurchasePrice(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "channelPrice")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setChannelPrice(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "guidePrice")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setGuidePrice(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "delflg")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "delflg" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setDelflg(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setDelflg(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "creater")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "creater"
										+ "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCreater(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setCreater(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "createdTime")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "createdTime"
										+ "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setCreatedTime(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToDateTime(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "updater")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setUpdater(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setUpdater(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setUpdater(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
