/**
 * Auth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto;

import com.topsun.posclient.webservice.dto.imports.ExtensionMapper;

/**
 * Auth bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class Auth implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = auth
	 * Namespace URI = http://www.topsunit.com/rms Namespace Prefix = ns1
	 */

	/**
	 * field for AuthGroupId
	 */

	protected int localAuthGroupId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAuthGroupIdTracker = false;

	public boolean isAuthGroupIdSpecified() {
		return localAuthGroupIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getAuthGroupId() {
		return localAuthGroupId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AuthGroupId
	 */
	public void setAuthGroupId(int param) {

		// setting primitive attribute tracker to true
		localAuthGroupIdTracker = param != java.lang.Integer.MIN_VALUE;

		this.localAuthGroupId = param;

	}

	/**
	 * field for AuthGroupName
	 */

	protected java.lang.String localAuthGroupName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAuthGroupNameTracker = false;

	public boolean isAuthGroupNameSpecified() {
		return localAuthGroupNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAuthGroupName() {
		return localAuthGroupName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AuthGroupName
	 */
	public void setAuthGroupName(java.lang.String param) {
		localAuthGroupNameTracker = true;

		this.localAuthGroupName = param;

	}

	/**
	 * field for FunctionId
	 */

	protected int localFunctionId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFunctionIdTracker = false;

	public boolean isFunctionIdSpecified() {
		return localFunctionIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getFunctionId() {
		return localFunctionId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FunctionId
	 */
	public void setFunctionId(int param) {

		// setting primitive attribute tracker to true
		localFunctionIdTracker = param != java.lang.Integer.MIN_VALUE;

		this.localFunctionId = param;

	}

	/**
	 * field for FunctionName
	 */

	protected java.lang.String localFunctionName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFunctionNameTracker = false;

	public boolean isFunctionNameSpecified() {
		return localFunctionNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getFunctionName() {
		return localFunctionName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FunctionName
	 */
	public void setFunctionName(java.lang.String param) {
		localFunctionNameTracker = true;

		this.localFunctionName = param;

	}

	/**
	 * field for OperationId
	 */

	protected int localOperationId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOperationIdTracker = false;

	public boolean isOperationIdSpecified() {
		return localOperationIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getOperationId() {
		return localOperationId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OperationId
	 */
	public void setOperationId(int param) {

		// setting primitive attribute tracker to true
		localOperationIdTracker = param != java.lang.Integer.MIN_VALUE;

		this.localOperationId = param;

	}

	/**
	 * field for OperationName
	 */

	protected java.lang.String localOperationName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOperationNameTracker = false;

	public boolean isOperationNameSpecified() {
		return localOperationNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getOperationName() {
		return localOperationName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OperationName
	 */
	public void setOperationName(java.lang.String param) {
		localOperationNameTracker = true;

		this.localOperationName = param;

	}

	/**
	 * field for IsAuth
	 */

	protected java.lang.String localIsAuth;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localIsAuthTracker = false;

	public boolean isIsAuthSpecified() {
		return localIsAuthTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getIsAuth() {
		return localIsAuth;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IsAuth
	 */
	public void setIsAuth(java.lang.String param) {
		localIsAuthTracker = true;

		this.localIsAuth = param;

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
						namespacePrefix + ":auth", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"auth", xmlWriter);
			}

		}
		if (localAuthGroupIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "authGroupId", xmlWriter);

			if (localAuthGroupId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"authGroupId cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAuthGroupId));
			}

			xmlWriter.writeEndElement();
		}
		if (localAuthGroupNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "authGroupName", xmlWriter);

			if (localAuthGroupName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localAuthGroupName);

			}

			xmlWriter.writeEndElement();
		}
		if (localFunctionIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "functionId", xmlWriter);

			if (localFunctionId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"functionId cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localFunctionId));
			}

			xmlWriter.writeEndElement();
		}
		if (localFunctionNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "functionName", xmlWriter);

			if (localFunctionName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localFunctionName);

			}

			xmlWriter.writeEndElement();
		}
		if (localOperationIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "operationId", xmlWriter);

			if (localOperationId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"operationId cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localOperationId));
			}

			xmlWriter.writeEndElement();
		}
		if (localOperationNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "operationName", xmlWriter);

			if (localOperationName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localOperationName);

			}

			xmlWriter.writeEndElement();
		}
		if (localIsAuthTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "isAuth", xmlWriter);

			if (localIsAuth == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localIsAuth);

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

		if (localAuthGroupIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "authGroupId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAuthGroupId));
		}
		if (localAuthGroupNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "authGroupName"));

			elementList.add(localAuthGroupName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localAuthGroupName));
		}
		if (localFunctionIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "functionId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localFunctionId));
		}
		if (localFunctionNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "functionName"));

			elementList.add(localFunctionName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localFunctionName));
		}
		if (localOperationIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "operationId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localOperationId));
		}
		if (localOperationNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "operationName"));

			elementList.add(localOperationName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localOperationName));
		}
		if (localIsAuthTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "isAuth"));

			elementList.add(localIsAuth == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localIsAuth));
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
		public static Auth parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			Auth object = new Auth();

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

						if (!"auth".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (Auth) ExtensionMapper
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
								"http://www.topsunit.com/rms", "authGroupId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "authGroupId"
										+ "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setAuthGroupId(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setAuthGroupId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "authGroupName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setAuthGroupName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "functionId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "functionId"
										+ "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setFunctionId(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setFunctionId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "functionName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setFunctionName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "operationId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "operationId"
										+ "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setOperationId(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setOperationId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "operationName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setOperationName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "isAuth")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setIsAuth(org.apache.axis2.databinding.utils.ConverterUtil
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
