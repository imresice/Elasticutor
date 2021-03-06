/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-12")
public class SurveillanceService {

  public interface Iface {

    public void reportExecutorThroughput(String executorId, double value) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void reportExecutorThroughput(String executorId, double value, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void reportExecutorThroughput(String executorId, double value) throws org.apache.thrift.TException
    {
      send_reportExecutorThroughput(executorId, value);
      recv_reportExecutorThroughput();
    }

    public void send_reportExecutorThroughput(String executorId, double value) throws org.apache.thrift.TException
    {
      reportExecutorThroughput_args args = new reportExecutorThroughput_args();
      args.set_executorId(executorId);
      args.set_value(value);
      sendBase("reportExecutorThroughput", args);
    }

    public void recv_reportExecutorThroughput() throws org.apache.thrift.TException
    {
      reportExecutorThroughput_result result = new reportExecutorThroughput_result();
      receiveBase(result, "reportExecutorThroughput");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void reportExecutorThroughput(String executorId, double value, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      reportExecutorThroughput_call method_call = new reportExecutorThroughput_call(executorId, value, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class reportExecutorThroughput_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String executorId;
      private double value;
      public reportExecutorThroughput_call(String executorId, double value, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.executorId = executorId;
        this.value = value;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("reportExecutorThroughput", org.apache.thrift.protocol.TMessageType.CALL, 0));
        reportExecutorThroughput_args args = new reportExecutorThroughput_args();
        args.set_executorId(executorId);
        args.set_value(value);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_reportExecutorThroughput();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("reportExecutorThroughput", new reportExecutorThroughput());
      return processMap;
    }

    public static class reportExecutorThroughput<I extends Iface> extends org.apache.thrift.ProcessFunction<I, reportExecutorThroughput_args> {
      public reportExecutorThroughput() {
        super("reportExecutorThroughput");
      }

      public reportExecutorThroughput_args getEmptyArgsInstance() {
        return new reportExecutorThroughput_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public reportExecutorThroughput_result getResult(I iface, reportExecutorThroughput_args args) throws org.apache.thrift.TException {
        reportExecutorThroughput_result result = new reportExecutorThroughput_result();
        iface.reportExecutorThroughput(args.executorId, args.value);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("reportExecutorThroughput", new reportExecutorThroughput());
      return processMap;
    }

    public static class reportExecutorThroughput<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, reportExecutorThroughput_args, Void> {
      public reportExecutorThroughput() {
        super("reportExecutorThroughput");
      }

      public reportExecutorThroughput_args getEmptyArgsInstance() {
        return new reportExecutorThroughput_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            reportExecutorThroughput_result result = new reportExecutorThroughput_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            reportExecutorThroughput_result result = new reportExecutorThroughput_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, reportExecutorThroughput_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.reportExecutorThroughput(args.executorId, args.value,resultHandler);
      }
    }

  }

  public static class reportExecutorThroughput_args implements org.apache.thrift.TBase<reportExecutorThroughput_args, reportExecutorThroughput_args._Fields>, java.io.Serializable, Cloneable, Comparable<reportExecutorThroughput_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("reportExecutorThroughput_args");

    private static final org.apache.thrift.protocol.TField EXECUTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("executorId", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new reportExecutorThroughput_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new reportExecutorThroughput_argsTupleSchemeFactory());
    }

    private String executorId; // required
    private double value; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      EXECUTOR_ID((short)1, "executorId"),
      VALUE((short)2, "value");

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
          case 1: // EXECUTOR_ID
            return EXECUTOR_ID;
          case 2: // VALUE
            return VALUE;
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
    private static final int __VALUE_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.EXECUTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("executorId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(reportExecutorThroughput_args.class, metaDataMap);
    }

    public reportExecutorThroughput_args() {
    }

    public reportExecutorThroughput_args(
      String executorId,
      double value)
    {
      this();
      this.executorId = executorId;
      this.value = value;
      set_value_isSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public reportExecutorThroughput_args(reportExecutorThroughput_args other) {
      __isset_bitfield = other.__isset_bitfield;
      if (other.is_set_executorId()) {
        this.executorId = other.executorId;
      }
      this.value = other.value;
    }

    public reportExecutorThroughput_args deepCopy() {
      return new reportExecutorThroughput_args(this);
    }

    @Override
    public void clear() {
      this.executorId = null;
      set_value_isSet(false);
      this.value = 0.0;
    }

    public String get_executorId() {
      return this.executorId;
    }

    public void set_executorId(String executorId) {
      this.executorId = executorId;
    }

    public void unset_executorId() {
      this.executorId = null;
    }

    /** Returns true if field executorId is set (has been assigned a value) and false otherwise */
    public boolean is_set_executorId() {
      return this.executorId != null;
    }

    public void set_executorId_isSet(boolean value) {
      if (!value) {
        this.executorId = null;
      }
    }

    public double get_value() {
      return this.value;
    }

    public void set_value(double value) {
      this.value = value;
      set_value_isSet(true);
    }

    public void unset_value() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
    }

    /** Returns true if field value is set (has been assigned a value) and false otherwise */
    public boolean is_set_value() {
      return EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
    }

    public void set_value_isSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case EXECUTOR_ID:
        if (value == null) {
          unset_executorId();
        } else {
          set_executorId((String)value);
        }
        break;

      case VALUE:
        if (value == null) {
          unset_value();
        } else {
          set_value((Double)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case EXECUTOR_ID:
        return get_executorId();

      case VALUE:
        return get_value();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case EXECUTOR_ID:
        return is_set_executorId();
      case VALUE:
        return is_set_value();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof reportExecutorThroughput_args)
        return this.equals((reportExecutorThroughput_args)that);
      return false;
    }

    public boolean equals(reportExecutorThroughput_args that) {
      if (that == null)
        return false;

      boolean this_present_executorId = true && this.is_set_executorId();
      boolean that_present_executorId = true && that.is_set_executorId();
      if (this_present_executorId || that_present_executorId) {
        if (!(this_present_executorId && that_present_executorId))
          return false;
        if (!this.executorId.equals(that.executorId))
          return false;
      }

      boolean this_present_value = true;
      boolean that_present_value = true;
      if (this_present_value || that_present_value) {
        if (!(this_present_value && that_present_value))
          return false;
        if (this.value != that.value)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_executorId = true && (is_set_executorId());
      list.add(present_executorId);
      if (present_executorId)
        list.add(executorId);

      boolean present_value = true;
      list.add(present_value);
      if (present_value)
        list.add(value);

      return list.hashCode();
    }

    @Override
    public int compareTo(reportExecutorThroughput_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(is_set_executorId()).compareTo(other.is_set_executorId());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (is_set_executorId()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executorId, other.executorId);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(is_set_value()).compareTo(other.is_set_value());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (is_set_value()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
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
      StringBuilder sb = new StringBuilder("reportExecutorThroughput_args(");
      boolean first = true;

      sb.append("executorId:");
      if (this.executorId == null) {
        sb.append("null");
      } else {
        sb.append(this.executorId);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("value:");
      sb.append(this.value);
      first = false;
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

    private static class reportExecutorThroughput_argsStandardSchemeFactory implements SchemeFactory {
      public reportExecutorThroughput_argsStandardScheme getScheme() {
        return new reportExecutorThroughput_argsStandardScheme();
      }
    }

    private static class reportExecutorThroughput_argsStandardScheme extends StandardScheme<reportExecutorThroughput_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, reportExecutorThroughput_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // EXECUTOR_ID
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.executorId = iprot.readString();
                struct.set_executorId_isSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // VALUE
              if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                struct.value = iprot.readDouble();
                struct.set_value_isSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, reportExecutorThroughput_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.executorId != null) {
          oprot.writeFieldBegin(EXECUTOR_ID_FIELD_DESC);
          oprot.writeString(struct.executorId);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeDouble(struct.value);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class reportExecutorThroughput_argsTupleSchemeFactory implements SchemeFactory {
      public reportExecutorThroughput_argsTupleScheme getScheme() {
        return new reportExecutorThroughput_argsTupleScheme();
      }
    }

    private static class reportExecutorThroughput_argsTupleScheme extends TupleScheme<reportExecutorThroughput_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, reportExecutorThroughput_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.is_set_executorId()) {
          optionals.set(0);
        }
        if (struct.is_set_value()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.is_set_executorId()) {
          oprot.writeString(struct.executorId);
        }
        if (struct.is_set_value()) {
          oprot.writeDouble(struct.value);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, reportExecutorThroughput_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          struct.executorId = iprot.readString();
          struct.set_executorId_isSet(true);
        }
        if (incoming.get(1)) {
          struct.value = iprot.readDouble();
          struct.set_value_isSet(true);
        }
      }
    }

  }

  public static class reportExecutorThroughput_result implements org.apache.thrift.TBase<reportExecutorThroughput_result, reportExecutorThroughput_result._Fields>, java.io.Serializable, Cloneable, Comparable<reportExecutorThroughput_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("reportExecutorThroughput_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new reportExecutorThroughput_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new reportExecutorThroughput_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(reportExecutorThroughput_result.class, metaDataMap);
    }

    public reportExecutorThroughput_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public reportExecutorThroughput_result(reportExecutorThroughput_result other) {
    }

    public reportExecutorThroughput_result deepCopy() {
      return new reportExecutorThroughput_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof reportExecutorThroughput_result)
        return this.equals((reportExecutorThroughput_result)that);
      return false;
    }

    public boolean equals(reportExecutorThroughput_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      return list.hashCode();
    }

    @Override
    public int compareTo(reportExecutorThroughput_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

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
      StringBuilder sb = new StringBuilder("reportExecutorThroughput_result(");
      boolean first = true;

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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class reportExecutorThroughput_resultStandardSchemeFactory implements SchemeFactory {
      public reportExecutorThroughput_resultStandardScheme getScheme() {
        return new reportExecutorThroughput_resultStandardScheme();
      }
    }

    private static class reportExecutorThroughput_resultStandardScheme extends StandardScheme<reportExecutorThroughput_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, reportExecutorThroughput_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, reportExecutorThroughput_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class reportExecutorThroughput_resultTupleSchemeFactory implements SchemeFactory {
      public reportExecutorThroughput_resultTupleScheme getScheme() {
        return new reportExecutorThroughput_resultTupleScheme();
      }
    }

    private static class reportExecutorThroughput_resultTupleScheme extends TupleScheme<reportExecutorThroughput_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, reportExecutorThroughput_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, reportExecutorThroughput_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}
