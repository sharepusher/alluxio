/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tachyon.thrift;

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

public class SearchStorePartitionInfo implements org.apache.thrift.TBase<SearchStorePartitionInfo, SearchStorePartitionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SearchStorePartitionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchStorePartitionInfo");

  private static final org.apache.thrift.protocol.TField STORE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storeId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SHARE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("shareIndex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SearchStorePartitionInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SearchStorePartitionInfoTupleSchemeFactory());
  }

  public int storeId; // required
  public int shareIndex; // required
  public NetAddress location; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORE_ID((short)1, "storeId"),
    SHARE_INDEX((short)2, "shareIndex"),
    LOCATION((short)3, "location");

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
        case 1: // STORE_ID
          return STORE_ID;
        case 2: // SHARE_INDEX
          return SHARE_INDEX;
        case 3: // LOCATION
          return LOCATION;
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
  private static final int __STOREID_ISSET_ID = 0;
  private static final int __SHAREINDEX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORE_ID, new org.apache.thrift.meta_data.FieldMetaData("storeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SHARE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("shareIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NetAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchStorePartitionInfo.class, metaDataMap);
  }

  public SearchStorePartitionInfo() {
  }

  public SearchStorePartitionInfo(
    int storeId,
    int shareIndex,
    NetAddress location)
  {
    this();
    this.storeId = storeId;
    setStoreIdIsSet(true);
    this.shareIndex = shareIndex;
    setShareIndexIsSet(true);
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchStorePartitionInfo(SearchStorePartitionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.storeId = other.storeId;
    this.shareIndex = other.shareIndex;
    if (other.isSetLocation()) {
      this.location = new NetAddress(other.location);
    }
  }

  public SearchStorePartitionInfo deepCopy() {
    return new SearchStorePartitionInfo(this);
  }

  @Override
  public void clear() {
    setStoreIdIsSet(false);
    this.storeId = 0;
    setShareIndexIsSet(false);
    this.shareIndex = 0;
    this.location = null;
  }

  public int getStoreId() {
    return this.storeId;
  }

  public SearchStorePartitionInfo setStoreId(int storeId) {
    this.storeId = storeId;
    setStoreIdIsSet(true);
    return this;
  }

  public void unsetStoreId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  /** Returns true if field storeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreId() {
    return EncodingUtils.testBit(__isset_bitfield, __STOREID_ISSET_ID);
  }

  public void setStoreIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STOREID_ISSET_ID, value);
  }

  public int getShareIndex() {
    return this.shareIndex;
  }

  public SearchStorePartitionInfo setShareIndex(int shareIndex) {
    this.shareIndex = shareIndex;
    setShareIndexIsSet(true);
    return this;
  }

  public void unsetShareIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHAREINDEX_ISSET_ID);
  }

  /** Returns true if field shareIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetShareIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __SHAREINDEX_ISSET_ID);
  }

  public void setShareIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHAREINDEX_ISSET_ID, value);
  }

  public NetAddress getLocation() {
    return this.location;
  }

  public SearchStorePartitionInfo setLocation(NetAddress location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STORE_ID:
      if (value == null) {
        unsetStoreId();
      } else {
        setStoreId((Integer)value);
      }
      break;

    case SHARE_INDEX:
      if (value == null) {
        unsetShareIndex();
      } else {
        setShareIndex((Integer)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((NetAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STORE_ID:
      return Integer.valueOf(getStoreId());

    case SHARE_INDEX:
      return Integer.valueOf(getShareIndex());

    case LOCATION:
      return getLocation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STORE_ID:
      return isSetStoreId();
    case SHARE_INDEX:
      return isSetShareIndex();
    case LOCATION:
      return isSetLocation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchStorePartitionInfo)
      return this.equals((SearchStorePartitionInfo)that);
    return false;
  }

  public boolean equals(SearchStorePartitionInfo that) {
    if (that == null)
      return false;

    boolean this_present_storeId = true;
    boolean that_present_storeId = true;
    if (this_present_storeId || that_present_storeId) {
      if (!(this_present_storeId && that_present_storeId))
        return false;
      if (this.storeId != that.storeId)
        return false;
    }

    boolean this_present_shareIndex = true;
    boolean that_present_shareIndex = true;
    if (this_present_shareIndex || that_present_shareIndex) {
      if (!(this_present_shareIndex && that_present_shareIndex))
        return false;
      if (this.shareIndex != that.shareIndex)
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SearchStorePartitionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStoreId()).compareTo(other.isSetStoreId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeId, other.storeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShareIndex()).compareTo(other.isSetShareIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shareIndex, other.shareIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
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
    StringBuilder sb = new StringBuilder("SearchStorePartitionInfo(");
    boolean first = true;

    sb.append("storeId:");
    sb.append(this.storeId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shareIndex:");
    sb.append(this.shareIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (location != null) {
      location.validate();
    }
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

  private static class SearchStorePartitionInfoStandardSchemeFactory implements SchemeFactory {
    public SearchStorePartitionInfoStandardScheme getScheme() {
      return new SearchStorePartitionInfoStandardScheme();
    }
  }

  private static class SearchStorePartitionInfoStandardScheme extends StandardScheme<SearchStorePartitionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchStorePartitionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.storeId = iprot.readI32();
              struct.setStoreIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHARE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.shareIndex = iprot.readI32();
              struct.setShareIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.location = new NetAddress();
              struct.location.read(iprot);
              struct.setLocationIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchStorePartitionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STORE_ID_FIELD_DESC);
      oprot.writeI32(struct.storeId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SHARE_INDEX_FIELD_DESC);
      oprot.writeI32(struct.shareIndex);
      oprot.writeFieldEnd();
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        struct.location.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchStorePartitionInfoTupleSchemeFactory implements SchemeFactory {
    public SearchStorePartitionInfoTupleScheme getScheme() {
      return new SearchStorePartitionInfoTupleScheme();
    }
  }

  private static class SearchStorePartitionInfoTupleScheme extends TupleScheme<SearchStorePartitionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchStorePartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStoreId()) {
        optionals.set(0);
      }
      if (struct.isSetShareIndex()) {
        optionals.set(1);
      }
      if (struct.isSetLocation()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStoreId()) {
        oprot.writeI32(struct.storeId);
      }
      if (struct.isSetShareIndex()) {
        oprot.writeI32(struct.shareIndex);
      }
      if (struct.isSetLocation()) {
        struct.location.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchStorePartitionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.storeId = iprot.readI32();
        struct.setStoreIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.shareIndex = iprot.readI32();
        struct.setShareIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.location = new NetAddress();
        struct.location.read(iprot);
        struct.setLocationIsSet(true);
      }
    }
  }

}
