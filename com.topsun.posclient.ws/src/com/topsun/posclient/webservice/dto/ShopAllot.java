/**
 * ShopAllot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto;

import com.topsun.posclient.webservice.dto.imports.ExtensionMapper;

/**
 * ShopAllot bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ShopAllot implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * shopAllot Namespace URI = http://www.topsunit.com/rms Namespace Prefix =
	 * ns1
	 */

	/**
	 * field for DocNumPOS
	 */

	protected java.lang.String localDocNumPOS;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDocNumPOSTracker = false;

	public boolean isDocNumPOSSpecified() {
		return localDocNumPOSTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDocNumPOS() {
		return localDocNumPOS;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DocNumPOS
	 */
	public void setDocNumPOS(java.lang.String param) {
		localDocNumPOSTracker = true;

		this.localDocNumPOS = param;

	}

	/**
	 * field for DocNum
	 */

	protected java.lang.String localDocNum;

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
	 * @return java.lang.String
	 */
	public java.lang.String getDocNum() {
		return localDocNum;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DocNum
	 */
	public void setDocNum(java.lang.String param) {
		localDocNumTracker = true;

		this.localDocNum = param;

	}

	/**
	 * field for OutShpId
	 */

	protected int localOutShpId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOutShpIdTracker = false;

	public boolean isOutShpIdSpecified() {
		return localOutShpIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getOutShpId() {
		return localOutShpId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OutShpId
	 */
	public void setOutShpId(int param) {
		localOutShpIdTracker = true;

		this.localOutShpId = param;

	}

	/**
	 * field for AllotTypeId
	 */

	protected int localAllotTypeId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAllotTypeIdTracker = false;

	public boolean isAllotTypeIdSpecified() {
		return localAllotTypeIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getAllotTypeId() {
		return localAllotTypeId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AllotTypeId
	 */
	public void setAllotTypeId(int param) {
		localAllotTypeIdTracker = true;

		this.localAllotTypeId = param;

	}

	/**
	 * field for InShpId
	 */

	protected int localInShpId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localInShpIdTracker = false;

	public boolean isInShpIdSpecified() {
		return localInShpIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getInShpId() {
		return localInShpId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            InShpId
	 */
	public void setInShpId(int param) {
		localInShpIdTracker = true;

		this.localInShpId = param;

	}

	/**
	 * field for AllotDate
	 */

	protected java.util.Calendar localAllotDate;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAllotDateTracker = false;

	public boolean isAllotDateSpecified() {
		return localAllotDateTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.util.Calendar
	 */
	public java.util.Calendar getAllotDate() {
		return localAllotDate;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AllotDate
	 */
	public void setAllotDate(java.util.Calendar param) {
		localAllotDateTracker = true;

		this.localAllotDate = param;

	}

	/**
	 * field for MakerID
	 */

	protected int localMakerID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMakerIDTracker = false;

	public boolean isMakerIDSpecified() {
		return localMakerIDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getMakerID() {
		return localMakerID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MakerID
	 */
	public void setMakerID(int param) {
		localMakerIDTracker = true;

		this.localMakerID = param;

	}

	/**
	 * field for Memo
	 */

	protected java.lang.String localMemo;

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
	 * @return java.lang.String
	 */
	public java.lang.String getMemo() {
		return localMemo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Memo
	 */
	public void setMemo(java.lang.String param) {
		localMemoTracker = true;

		this.localMemo = param;

	}

	/**
	 * field for Items
	 */

	protected ArrayOfitem localItems;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localItemsTracker = false;

	public boolean isItemsSpecified() {
		return localItemsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return ArrayOfitem
	 */
	public ArrayOfitem getItems() {
		return localItems;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Items
	 */
	public void setItems(ArrayOfitem param) {
		localItemsTracker = true;

		this.localItems = param;

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
						namespacePrefix + ":shopAllot", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"shopAllot", xmlWriter);
			}

		}
		if (localDocNumPOSTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "docNumPOS", xmlWriter);

			if (localDocNumPOS == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localDocNumPOS);

			}

			xmlWriter.writeEndElement();
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
		if (localOutShpIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "outShpId", xmlWriter);

			if (localOutShpId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localOutShpId));
			}

			xmlWriter.writeEndElement();
		}
		if (localAllotTypeIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "allotTypeId", xmlWriter);

			if (localAllotTypeId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAllotTypeId));
			}

			xmlWriter.writeEndElement();
		}
		if (localInShpIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "inShpId", xmlWriter);

			if (localInShpId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localInShpId));
			}

			xmlWriter.writeEndElement();
		}
		if (localAllotDateTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "allotDate", xmlWriter);

			if (localAllotDate == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAllotDate));

			}

			xmlWriter.writeEndElement();
		}
		if (localMakerIDTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "makerID", xmlWriter);

			if (localMakerID == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localMakerID));
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
		if (localItemsTracker) {
			if (localItems == null) {

				writeStartElement(null, "http://www.topsunit.com/rms", "items",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localItems.serialize(new javax.xml.namespace.QName(
						"http://www.topsunit.com/rms", "items"), xmlWriter);
			}
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

		if (localDocNumPOSTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "docNumPOS"));

			elementList.add(localDocNumPOS == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDocNumPOS));
		}
		if (localDocNumTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "docNum"));

			elementList.add(localDocNum == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDocNum));
		}
		if (localOutShpIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "outShpId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localOutShpId));
		}
		if (localAllotTypeIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "allotTypeId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAllotTypeId));
		}
		if (localInShpIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "inShpId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localInShpId));
		}
		if (localAllotDateTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "allotDate"));

			elementList.add(localAllotDate == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localAllotDate));
		}
		if (localMakerIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "makerID"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localMakerID));
		}
		if (localMemoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "memo"));

			elementList.add(localMemo == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localMemo));
		}
		if (localItemsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "items"));

			elementList.add(localItems == null ? null : localItems);
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
		public static ShopAllot parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			ShopAllot object = new ShopAllot();

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

						if (!"shopAllot".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (ShopAllot) ExtensionMapper
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
								"http://www.topsunit.com/rms", "docNumPOS")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setDocNumPOS(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "docNum")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

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
								"http://www.topsunit.com/rms", "outShpId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setOutShpId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setOutShpId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setOutShpId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "allotTypeId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setAllotTypeId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setAllotTypeId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setAllotTypeId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "inShpId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setInShpId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setInShpId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setInShpId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "allotDate")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setAllotDate(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "makerID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setMakerID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setMakerID(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setMakerID(java.lang.Integer.MIN_VALUE);

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

						java.lang.String content = reader.getElementText();

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
								"http://www.topsunit.com/rms", "items")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setItems(null);
						reader.next();

						reader.next();

					} else {

						object.setItems(ArrayOfitem.Factory
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

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
