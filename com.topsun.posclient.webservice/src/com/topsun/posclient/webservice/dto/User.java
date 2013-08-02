/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.topsun.posclient.webservice.dto;

import com.topsun.posclient.webservice.dto.imports.ExtensionMapper;

/**
 * User bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class User implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name = user
	 * Namespace URI = http://www.topsunit.com/rms Namespace Prefix = ns1
	 */

	/**
	 * field for UserId
	 */

	protected int localUserId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUserIdTracker = false;

	public boolean isUserIdSpecified() {
		return localUserIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getUserId() {
		return localUserId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UserId
	 */
	public void setUserId(int param) {

		// setting primitive attribute tracker to true
		localUserIdTracker = param != java.lang.Integer.MIN_VALUE;

		this.localUserId = param;

	}

	/**
	 * field for UserCode
	 */

	protected java.lang.String localUserCode;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUserCodeTracker = false;

	public boolean isUserCodeSpecified() {
		return localUserCodeTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getUserCode() {
		return localUserCode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UserCode
	 */
	public void setUserCode(java.lang.String param) {
		localUserCodeTracker = true;

		this.localUserCode = param;

	}

	/**
	 * field for UserName
	 */

	protected java.lang.String localUserName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUserNameTracker = false;

	public boolean isUserNameSpecified() {
		return localUserNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getUserName() {
		return localUserName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UserName
	 */
	public void setUserName(java.lang.String param) {
		localUserNameTracker = true;

		this.localUserName = param;

	}

	/**
	 * field for DeptId
	 */

	protected int localDeptId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDeptIdTracker = false;

	public boolean isDeptIdSpecified() {
		return localDeptIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getDeptId() {
		return localDeptId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DeptId
	 */
	public void setDeptId(int param) {
		localDeptIdTracker = true;

		this.localDeptId = param;

	}

	/**
	 * field for DeptName
	 */

	protected java.lang.String localDeptName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localDeptNameTracker = false;

	public boolean isDeptNameSpecified() {
		return localDeptNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getDeptName() {
		return localDeptName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            DeptName
	 */
	public void setDeptName(java.lang.String param) {
		localDeptNameTracker = true;

		this.localDeptName = param;

	}

	/**
	 * field for EmployeeId
	 */

	protected int localEmployeeId;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEmployeeIdTracker = false;

	public boolean isEmployeeIdSpecified() {
		return localEmployeeIdTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getEmployeeId() {
		return localEmployeeId;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EmployeeId
	 */
	public void setEmployeeId(int param) {
		localEmployeeIdTracker = true;

		this.localEmployeeId = param;

	}

	/**
	 * field for EmployeeName
	 */

	protected java.lang.String localEmployeeName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEmployeeNameTracker = false;

	public boolean isEmployeeNameSpecified() {
		return localEmployeeNameTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getEmployeeName() {
		return localEmployeeName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EmployeeName
	 */
	public void setEmployeeName(java.lang.String param) {
		localEmployeeNameTracker = true;

		this.localEmployeeName = param;

	}

	/**
	 * field for Auths
	 */

	protected ArrayOfauth localAuths;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAuthsTracker = false;

	public boolean isAuthsSpecified() {
		return localAuthsTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return ArrayOfauth
	 */
	public ArrayOfauth getAuths() {
		return localAuths;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Auths
	 */
	public void setAuths(ArrayOfauth param) {
		localAuthsTracker = true;

		this.localAuths = param;

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
						namespacePrefix + ":user", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"user", xmlWriter);
			}

		}
		if (localUserIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "userId", xmlWriter);

			if (localUserId == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"userId cannot be null!!");

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localUserId));
			}

			xmlWriter.writeEndElement();
		}
		if (localUserCodeTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "userCode", xmlWriter);

			if (localUserCode == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localUserCode);

			}

			xmlWriter.writeEndElement();
		}
		if (localUserNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "userName", xmlWriter);

			if (localUserName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localUserName);

			}

			xmlWriter.writeEndElement();
		}
		if (localDeptIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "deptId", xmlWriter);

			if (localDeptId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localDeptId));
			}

			xmlWriter.writeEndElement();
		}
		if (localDeptNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "deptName", xmlWriter);

			if (localDeptName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localDeptName);

			}

			xmlWriter.writeEndElement();
		}
		if (localEmployeeIdTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "employeeId", xmlWriter);

			if (localEmployeeId == java.lang.Integer.MIN_VALUE) {

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localEmployeeId));
			}

			xmlWriter.writeEndElement();
		}
		if (localEmployeeNameTracker) {
			namespace = "http://www.topsunit.com/rms";
			writeStartElement(null, namespace, "employeeName", xmlWriter);

			if (localEmployeeName == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localEmployeeName);

			}

			xmlWriter.writeEndElement();
		}
		if (localAuthsTracker) {
			if (localAuths == null) {

				writeStartElement(null, "http://www.topsunit.com/rms", "auths",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localAuths.serialize(new javax.xml.namespace.QName(
						"http://www.topsunit.com/rms", "auths"), xmlWriter);
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

		if (localUserIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "userId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localUserId));
		}
		if (localUserCodeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "userCode"));

			elementList.add(localUserCode == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localUserCode));
		}
		if (localUserNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "userName"));

			elementList.add(localUserName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localUserName));
		}
		if (localDeptIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "deptId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localDeptId));
		}
		if (localDeptNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "deptName"));

			elementList.add(localDeptName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDeptName));
		}
		if (localEmployeeIdTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "employeeId"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localEmployeeId));
		}
		if (localEmployeeNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "employeeName"));

			elementList.add(localEmployeeName == null ? null
					: org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localEmployeeName));
		}
		if (localAuthsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://www.topsunit.com/rms", "auths"));

			elementList.add(localAuths == null ? null : localAuths);
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
		public static User parse(javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			User object = new User();

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

						if (!"user".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (User) ExtensionMapper
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
								"http://www.topsunit.com/rms", "userId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						throw new org.apache.axis2.databinding.ADBException(
								"The element: " + "userId" + "  cannot be null");
					}

					java.lang.String content = reader.getElementText();

					object.setUserId(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {

					object.setUserId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "userCode")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setUserCode(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "userName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setUserName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "deptId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setDeptId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setDeptId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setDeptId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "deptName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setDeptName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "employeeId")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setEmployeeId(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

					} else {

						object.setEmployeeId(java.lang.Integer.MIN_VALUE);

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

					object.setEmployeeId(java.lang.Integer.MIN_VALUE);

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://www.topsunit.com/rms", "employeeName")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setEmployeeName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"http://www.topsunit.com/rms", "auths")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setAuths(null);
						reader.next();

						reader.next();

					} else {

						object.setAuths(ArrayOfauth.Factory
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
