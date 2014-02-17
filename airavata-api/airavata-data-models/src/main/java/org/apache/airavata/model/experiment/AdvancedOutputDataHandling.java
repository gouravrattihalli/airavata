    /*
     * Licensed to the Apache Software Foundation (ASF) under one or more
     * contributor license agreements.  See the NOTICE file distributed with
     * this work for additional information regarding copyright ownership.
     * The ASF licenses this file to You under the Apache License, Version 2.0
     * (the "License"); you may not use this file except in compliance with
     * the License.  You may obtain a copy of the License at
     *
     *     http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.experiment;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A structure holding specified output data handling.
 * 
 */
@SuppressWarnings("all") public class AdvancedOutputDataHandling implements org.apache.thrift.TBase<AdvancedOutputDataHandling, AdvancedOutputDataHandling._Fields>, java.io.Serializable, Cloneable, Comparable<AdvancedOutputDataHandling> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdvancedOutputDataHandling");

  private static final org.apache.thrift.protocol.TField OUTPUT_DATA_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("outputDataDir", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_REGISTRY_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("dataRegistryURL", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PERSIST_OUTPUT_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("persistOutputData", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdvancedOutputDataHandlingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdvancedOutputDataHandlingTupleSchemeFactory());
  }

  private String outputDataDir; // optional
  private String dataRegistryURL; // optional
  private boolean persistOutputData; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OUTPUT_DATA_DIR((short)2, "outputDataDir"),
    DATA_REGISTRY_URL((short)3, "dataRegistryURL"),
    PERSIST_OUTPUT_DATA((short)4, "persistOutputData");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // OUTPUT_DATA_DIR
          return OUTPUT_DATA_DIR;
        case 3: // DATA_REGISTRY_URL
          return DATA_REGISTRY_URL;
        case 4: // PERSIST_OUTPUT_DATA
          return PERSIST_OUTPUT_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PERSISTOUTPUTDATA_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.OUTPUT_DATA_DIR,_Fields.DATA_REGISTRY_URL,_Fields.PERSIST_OUTPUT_DATA};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OUTPUT_DATA_DIR, new org.apache.thrift.meta_data.FieldMetaData("outputDataDir", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA_REGISTRY_URL, new org.apache.thrift.meta_data.FieldMetaData("dataRegistryURL", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSIST_OUTPUT_DATA, new org.apache.thrift.meta_data.FieldMetaData("persistOutputData", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdvancedOutputDataHandling.class, metaDataMap);
  }

  public AdvancedOutputDataHandling() {
    this.persistOutputData = true;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdvancedOutputDataHandling(AdvancedOutputDataHandling other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOutputDataDir()) {
      this.outputDataDir = other.outputDataDir;
    }
    if (other.isSetDataRegistryURL()) {
      this.dataRegistryURL = other.dataRegistryURL;
    }
    this.persistOutputData = other.persistOutputData;
  }

  public AdvancedOutputDataHandling deepCopy() {
    return new AdvancedOutputDataHandling(this);
  }

  @Override
  public void clear() {
    this.outputDataDir = null;
    this.dataRegistryURL = null;
    this.persistOutputData = true;

  }

  public String getOutputDataDir() {
    return this.outputDataDir;
  }

  public void setOutputDataDir(String outputDataDir) {
    this.outputDataDir = outputDataDir;
  }

  public void unsetOutputDataDir() {
    this.outputDataDir = null;
  }

  /** Returns true if field outputDataDir is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputDataDir() {
    return this.outputDataDir != null;
  }

  public void setOutputDataDirIsSet(boolean value) {
    if (!value) {
      this.outputDataDir = null;
    }
  }

  public String getDataRegistryURL() {
    return this.dataRegistryURL;
  }

  public void setDataRegistryURL(String dataRegistryURL) {
    this.dataRegistryURL = dataRegistryURL;
  }

  public void unsetDataRegistryURL() {
    this.dataRegistryURL = null;
  }

  /** Returns true if field dataRegistryURL is set (has been assigned a value) and false otherwise */
  public boolean isSetDataRegistryURL() {
    return this.dataRegistryURL != null;
  }

  public void setDataRegistryURLIsSet(boolean value) {
    if (!value) {
      this.dataRegistryURL = null;
    }
  }

  public boolean isPersistOutputData() {
    return this.persistOutputData;
  }

  public void setPersistOutputData(boolean persistOutputData) {
    this.persistOutputData = persistOutputData;
    setPersistOutputDataIsSet(true);
  }

  public void unsetPersistOutputData() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERSISTOUTPUTDATA_ISSET_ID);
  }

  /** Returns true if field persistOutputData is set (has been assigned a value) and false otherwise */
  public boolean isSetPersistOutputData() {
    return EncodingUtils.testBit(__isset_bitfield, __PERSISTOUTPUTDATA_ISSET_ID);
  }

  public void setPersistOutputDataIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERSISTOUTPUTDATA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OUTPUT_DATA_DIR:
      if (value == null) {
        unsetOutputDataDir();
      } else {
        setOutputDataDir((String)value);
      }
      break;

    case DATA_REGISTRY_URL:
      if (value == null) {
        unsetDataRegistryURL();
      } else {
        setDataRegistryURL((String)value);
      }
      break;

    case PERSIST_OUTPUT_DATA:
      if (value == null) {
        unsetPersistOutputData();
      } else {
        setPersistOutputData((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OUTPUT_DATA_DIR:
      return getOutputDataDir();

    case DATA_REGISTRY_URL:
      return getDataRegistryURL();

    case PERSIST_OUTPUT_DATA:
      return Boolean.valueOf(isPersistOutputData());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OUTPUT_DATA_DIR:
      return isSetOutputDataDir();
    case DATA_REGISTRY_URL:
      return isSetDataRegistryURL();
    case PERSIST_OUTPUT_DATA:
      return isSetPersistOutputData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdvancedOutputDataHandling)
      return this.equals((AdvancedOutputDataHandling)that);
    return false;
  }

  public boolean equals(AdvancedOutputDataHandling that) {
    if (that == null)
      return false;

    boolean this_present_outputDataDir = true && this.isSetOutputDataDir();
    boolean that_present_outputDataDir = true && that.isSetOutputDataDir();
    if (this_present_outputDataDir || that_present_outputDataDir) {
      if (!(this_present_outputDataDir && that_present_outputDataDir))
        return false;
      if (!this.outputDataDir.equals(that.outputDataDir))
        return false;
    }

    boolean this_present_dataRegistryURL = true && this.isSetDataRegistryURL();
    boolean that_present_dataRegistryURL = true && that.isSetDataRegistryURL();
    if (this_present_dataRegistryURL || that_present_dataRegistryURL) {
      if (!(this_present_dataRegistryURL && that_present_dataRegistryURL))
        return false;
      if (!this.dataRegistryURL.equals(that.dataRegistryURL))
        return false;
    }

    boolean this_present_persistOutputData = true && this.isSetPersistOutputData();
    boolean that_present_persistOutputData = true && that.isSetPersistOutputData();
    if (this_present_persistOutputData || that_present_persistOutputData) {
      if (!(this_present_persistOutputData && that_present_persistOutputData))
        return false;
      if (this.persistOutputData != that.persistOutputData)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(AdvancedOutputDataHandling other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOutputDataDir()).compareTo(other.isSetOutputDataDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputDataDir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputDataDir, other.outputDataDir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataRegistryURL()).compareTo(other.isSetDataRegistryURL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataRegistryURL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataRegistryURL, other.dataRegistryURL);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersistOutputData()).compareTo(other.isSetPersistOutputData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersistOutputData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persistOutputData, other.persistOutputData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AdvancedOutputDataHandling(");
    boolean first = true;

    if (isSetOutputDataDir()) {
      sb.append("outputDataDir:");
      if (this.outputDataDir == null) {
        sb.append("null");
      } else {
        sb.append(this.outputDataDir);
      }
      first = false;
    }
    if (isSetDataRegistryURL()) {
      if (!first) sb.append(", ");
      sb.append("dataRegistryURL:");
      if (this.dataRegistryURL == null) {
        sb.append("null");
      } else {
        sb.append(this.dataRegistryURL);
      }
      first = false;
    }
    if (isSetPersistOutputData()) {
      if (!first) sb.append(", ");
      sb.append("persistOutputData:");
      sb.append(this.persistOutputData);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AdvancedOutputDataHandlingStandardSchemeFactory implements SchemeFactory {
    public AdvancedOutputDataHandlingStandardScheme getScheme() {
      return new AdvancedOutputDataHandlingStandardScheme();
    }
  }

  private static class AdvancedOutputDataHandlingStandardScheme extends StandardScheme<AdvancedOutputDataHandling> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdvancedOutputDataHandling struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // OUTPUT_DATA_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.outputDataDir = iprot.readString();
              struct.setOutputDataDirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA_REGISTRY_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataRegistryURL = iprot.readString();
              struct.setDataRegistryURLIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PERSIST_OUTPUT_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.persistOutputData = iprot.readBool();
              struct.setPersistOutputDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdvancedOutputDataHandling struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.outputDataDir != null) {
        if (struct.isSetOutputDataDir()) {
          oprot.writeFieldBegin(OUTPUT_DATA_DIR_FIELD_DESC);
          oprot.writeString(struct.outputDataDir);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dataRegistryURL != null) {
        if (struct.isSetDataRegistryURL()) {
          oprot.writeFieldBegin(DATA_REGISTRY_URL_FIELD_DESC);
          oprot.writeString(struct.dataRegistryURL);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPersistOutputData()) {
        oprot.writeFieldBegin(PERSIST_OUTPUT_DATA_FIELD_DESC);
        oprot.writeBool(struct.persistOutputData);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdvancedOutputDataHandlingTupleSchemeFactory implements SchemeFactory {
    public AdvancedOutputDataHandlingTupleScheme getScheme() {
      return new AdvancedOutputDataHandlingTupleScheme();
    }
  }

  private static class AdvancedOutputDataHandlingTupleScheme extends TupleScheme<AdvancedOutputDataHandling> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdvancedOutputDataHandling struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOutputDataDir()) {
        optionals.set(0);
      }
      if (struct.isSetDataRegistryURL()) {
        optionals.set(1);
      }
      if (struct.isSetPersistOutputData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOutputDataDir()) {
        oprot.writeString(struct.outputDataDir);
      }
      if (struct.isSetDataRegistryURL()) {
        oprot.writeString(struct.dataRegistryURL);
      }
      if (struct.isSetPersistOutputData()) {
        oprot.writeBool(struct.persistOutputData);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdvancedOutputDataHandling struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.outputDataDir = iprot.readString();
        struct.setOutputDataDirIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dataRegistryURL = iprot.readString();
        struct.setDataRegistryURLIsSet(true);
      }
      if (incoming.get(2)) {
        struct.persistOutputData = iprot.readBool();
        struct.setPersistOutputDataIsSet(true);
      }
    }
  }

}

