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
package org.apache.airavata.model.appcatalog;

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

@SuppressWarnings("all") public class SSHJobSubmission implements org.apache.thrift.TBase<SSHJobSubmission, SSHJobSubmission._Fields>, java.io.Serializable, Cloneable, Comparable<SSHJobSubmission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SSHJobSubmission");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_DATA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionDataID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_JOB_MANAGER_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceJobManager", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SSH_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("sshPort", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SSHJobSubmissionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SSHJobSubmissionTupleSchemeFactory());
  }

  private String jobSubmissionDataID; // required
  private ResourceJobManager resourceJobManager; // required
  private int sshPort; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_DATA_ID((short)1, "jobSubmissionDataID"),
    /**
     * 
     * @see ResourceJobManager
     */
    RESOURCE_JOB_MANAGER((short)2, "resourceJobManager"),
    SSH_PORT((short)3, "sshPort");

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
        case 1: // JOB_SUBMISSION_DATA_ID
          return JOB_SUBMISSION_DATA_ID;
        case 2: // RESOURCE_JOB_MANAGER
          return RESOURCE_JOB_MANAGER;
        case 3: // SSH_PORT
          return SSH_PORT;
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
  private static final int __SSHPORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.SSH_PORT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_SUBMISSION_DATA_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionDataID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_JOB_MANAGER, new org.apache.thrift.meta_data.FieldMetaData("resourceJobManager", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceJobManager.class)));
    tmpMap.put(_Fields.SSH_PORT, new org.apache.thrift.meta_data.FieldMetaData("sshPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SSHJobSubmission.class, metaDataMap);
  }

  public SSHJobSubmission() {
    this.jobSubmissionDataID = "DO_NOT_SET_AT_CLIENTS";

    this.sshPort = 22;

  }

  public SSHJobSubmission(
    String jobSubmissionDataID,
    ResourceJobManager resourceJobManager)
  {
    this();
    this.jobSubmissionDataID = jobSubmissionDataID;
    this.resourceJobManager = resourceJobManager;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SSHJobSubmission(SSHJobSubmission other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobSubmissionDataID()) {
      this.jobSubmissionDataID = other.jobSubmissionDataID;
    }
    if (other.isSetResourceJobManager()) {
      this.resourceJobManager = other.resourceJobManager;
    }
    this.sshPort = other.sshPort;
  }

  public SSHJobSubmission deepCopy() {
    return new SSHJobSubmission(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionDataID = "DO_NOT_SET_AT_CLIENTS";

    this.resourceJobManager = null;
    this.sshPort = 22;

  }

  public String getJobSubmissionDataID() {
    return this.jobSubmissionDataID;
  }

  public void setJobSubmissionDataID(String jobSubmissionDataID) {
    this.jobSubmissionDataID = jobSubmissionDataID;
  }

  public void unsetJobSubmissionDataID() {
    this.jobSubmissionDataID = null;
  }

  /** Returns true if field jobSubmissionDataID is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionDataID() {
    return this.jobSubmissionDataID != null;
  }

  public void setJobSubmissionDataIDIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionDataID = null;
    }
  }

  /**
   * 
   * @see ResourceJobManager
   */
  public ResourceJobManager getResourceJobManager() {
    return this.resourceJobManager;
  }

  /**
   * 
   * @see ResourceJobManager
   */
  public void setResourceJobManager(ResourceJobManager resourceJobManager) {
    this.resourceJobManager = resourceJobManager;
  }

  public void unsetResourceJobManager() {
    this.resourceJobManager = null;
  }

  /** Returns true if field resourceJobManager is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceJobManager() {
    return this.resourceJobManager != null;
  }

  public void setResourceJobManagerIsSet(boolean value) {
    if (!value) {
      this.resourceJobManager = null;
    }
  }

  public int getSshPort() {
    return this.sshPort;
  }

  public void setSshPort(int sshPort) {
    this.sshPort = sshPort;
    setSshPortIsSet(true);
  }

  public void unsetSshPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  /** Returns true if field sshPort is set (has been assigned a value) and false otherwise */
  public boolean isSetSshPort() {
    return EncodingUtils.testBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  public void setSshPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SSHPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      if (value == null) {
        unsetJobSubmissionDataID();
      } else {
        setJobSubmissionDataID((String)value);
      }
      break;

    case RESOURCE_JOB_MANAGER:
      if (value == null) {
        unsetResourceJobManager();
      } else {
        setResourceJobManager((ResourceJobManager)value);
      }
      break;

    case SSH_PORT:
      if (value == null) {
        unsetSshPort();
      } else {
        setSshPort((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      return getJobSubmissionDataID();

    case RESOURCE_JOB_MANAGER:
      return getResourceJobManager();

    case SSH_PORT:
      return Integer.valueOf(getSshPort());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_SUBMISSION_DATA_ID:
      return isSetJobSubmissionDataID();
    case RESOURCE_JOB_MANAGER:
      return isSetResourceJobManager();
    case SSH_PORT:
      return isSetSshPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SSHJobSubmission)
      return this.equals((SSHJobSubmission)that);
    return false;
  }

  public boolean equals(SSHJobSubmission that) {
    if (that == null)
      return false;

    boolean this_present_jobSubmissionDataID = true && this.isSetJobSubmissionDataID();
    boolean that_present_jobSubmissionDataID = true && that.isSetJobSubmissionDataID();
    if (this_present_jobSubmissionDataID || that_present_jobSubmissionDataID) {
      if (!(this_present_jobSubmissionDataID && that_present_jobSubmissionDataID))
        return false;
      if (!this.jobSubmissionDataID.equals(that.jobSubmissionDataID))
        return false;
    }

    boolean this_present_resourceJobManager = true && this.isSetResourceJobManager();
    boolean that_present_resourceJobManager = true && that.isSetResourceJobManager();
    if (this_present_resourceJobManager || that_present_resourceJobManager) {
      if (!(this_present_resourceJobManager && that_present_resourceJobManager))
        return false;
      if (!this.resourceJobManager.equals(that.resourceJobManager))
        return false;
    }

    boolean this_present_sshPort = true && this.isSetSshPort();
    boolean that_present_sshPort = true && that.isSetSshPort();
    if (this_present_sshPort || that_present_sshPort) {
      if (!(this_present_sshPort && that_present_sshPort))
        return false;
      if (this.sshPort != that.sshPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SSHJobSubmission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobSubmissionDataID()).compareTo(other.isSetJobSubmissionDataID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionDataID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionDataID, other.jobSubmissionDataID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceJobManager()).compareTo(other.isSetResourceJobManager());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceJobManager()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceJobManager, other.resourceJobManager);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSshPort()).compareTo(other.isSetSshPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSshPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sshPort, other.sshPort);
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
    StringBuilder sb = new StringBuilder("SSHJobSubmission(");
    boolean first = true;

    sb.append("jobSubmissionDataID:");
    if (this.jobSubmissionDataID == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionDataID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resourceJobManager:");
    if (this.resourceJobManager == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceJobManager);
    }
    first = false;
    if (isSetSshPort()) {
      if (!first) sb.append(", ");
      sb.append("sshPort:");
      sb.append(this.sshPort);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionDataID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionDataID' is unset! Struct:" + toString());
    }

    if (!isSetResourceJobManager()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceJobManager' is unset! Struct:" + toString());
    }

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

  private static class SSHJobSubmissionStandardSchemeFactory implements SchemeFactory {
    public SSHJobSubmissionStandardScheme getScheme() {
      return new SSHJobSubmissionStandardScheme();
    }
  }

  private static class SSHJobSubmissionStandardScheme extends StandardScheme<SSHJobSubmission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_DATA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobSubmissionDataID = iprot.readString();
              struct.setJobSubmissionDataIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_JOB_MANAGER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resourceJobManager = ResourceJobManager.findByValue(iprot.readI32());
              struct.setResourceJobManagerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SSH_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sshPort = iprot.readI32();
              struct.setSshPortIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionDataID != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_DATA_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionDataID);
        oprot.writeFieldEnd();
      }
      if (struct.resourceJobManager != null) {
        oprot.writeFieldBegin(RESOURCE_JOB_MANAGER_FIELD_DESC);
        oprot.writeI32(struct.resourceJobManager.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetSshPort()) {
        oprot.writeFieldBegin(SSH_PORT_FIELD_DESC);
        oprot.writeI32(struct.sshPort);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SSHJobSubmissionTupleSchemeFactory implements SchemeFactory {
    public SSHJobSubmissionTupleScheme getScheme() {
      return new SSHJobSubmissionTupleScheme();
    }
  }

  private static class SSHJobSubmissionTupleScheme extends TupleScheme<SSHJobSubmission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionDataID);
      oprot.writeI32(struct.resourceJobManager.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetSshPort()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSshPort()) {
        oprot.writeI32(struct.sshPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SSHJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionDataID = iprot.readString();
      struct.setJobSubmissionDataIDIsSet(true);
      struct.resourceJobManager = ResourceJobManager.findByValue(iprot.readI32());
      struct.setResourceJobManagerIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.sshPort = iprot.readI32();
        struct.setSshPortIsSet(true);
      }
    }
  }

}
