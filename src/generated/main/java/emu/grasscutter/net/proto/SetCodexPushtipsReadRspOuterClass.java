// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetCodexPushtipsReadRsp.proto

package emu.grasscutter.net.proto;

public final class SetCodexPushtipsReadRspOuterClass {
  private SetCodexPushtipsReadRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetCodexPushtipsReadRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetCodexPushtipsReadRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JKLHOJOCLJD = 3;</code>
     * @return The jKLHOJOCLJD.
     */
    int getJKLHOJOCLJD();

    /**
     * <code>uint32 CFNJIOIOLPG = 8;</code>
     * @return The cFNJIOIOLPG.
     */
    int getCFNJIOIOLPG();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 20900
   * Obf: BOOFNCELDCM
   * </pre>
   *
   * Protobuf type {@code SetCodexPushtipsReadRsp}
   */
  public static final class SetCodexPushtipsReadRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetCodexPushtipsReadRsp)
      SetCodexPushtipsReadRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetCodexPushtipsReadRsp.newBuilder() to construct.
    private SetCodexPushtipsReadRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetCodexPushtipsReadRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetCodexPushtipsReadRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetCodexPushtipsReadRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              jKLHOJOCLJD_ = input.readUInt32();
              break;
            }
            case 64: {

              cFNJIOIOLPG_ = input.readUInt32();
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.class, emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.Builder.class);
    }

    public static final int JKLHOJOCLJD_FIELD_NUMBER = 3;
    private int jKLHOJOCLJD_;
    /**
     * <code>uint32 JKLHOJOCLJD = 3;</code>
     * @return The jKLHOJOCLJD.
     */
    @java.lang.Override
    public int getJKLHOJOCLJD() {
      return jKLHOJOCLJD_;
    }

    public static final int CFNJIOIOLPG_FIELD_NUMBER = 8;
    private int cFNJIOIOLPG_;
    /**
     * <code>uint32 CFNJIOIOLPG = 8;</code>
     * @return The cFNJIOIOLPG.
     */
    @java.lang.Override
    public int getCFNJIOIOLPG() {
      return cFNJIOIOLPG_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (jKLHOJOCLJD_ != 0) {
        output.writeUInt32(3, jKLHOJOCLJD_);
      }
      if (cFNJIOIOLPG_ != 0) {
        output.writeUInt32(8, cFNJIOIOLPG_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jKLHOJOCLJD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, jKLHOJOCLJD_);
      }
      if (cFNJIOIOLPG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cFNJIOIOLPG_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp other = (emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) obj;

      if (getJKLHOJOCLJD()
          != other.getJKLHOJOCLJD()) return false;
      if (getCFNJIOIOLPG()
          != other.getCFNJIOIOLPG()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + JKLHOJOCLJD_FIELD_NUMBER;
      hash = (53 * hash) + getJKLHOJOCLJD();
      hash = (37 * hash) + CFNJIOIOLPG_FIELD_NUMBER;
      hash = (53 * hash) + getCFNJIOIOLPG();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 20900
     * Obf: BOOFNCELDCM
     * </pre>
     *
     * Protobuf type {@code SetCodexPushtipsReadRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetCodexPushtipsReadRsp)
        emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.class, emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        jKLHOJOCLJD_ = 0;

        cFNJIOIOLPG_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.internal_static_SetCodexPushtipsReadRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp build() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp buildPartial() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp result = new emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp(this);
        result.jKLHOJOCLJD_ = jKLHOJOCLJD_;
        result.cFNJIOIOLPG_ = cFNJIOIOLPG_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp other) {
        if (other == emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp.getDefaultInstance()) return this;
        if (other.getJKLHOJOCLJD() != 0) {
          setJKLHOJOCLJD(other.getJKLHOJOCLJD());
        }
        if (other.getCFNJIOIOLPG() != 0) {
          setCFNJIOIOLPG(other.getCFNJIOIOLPG());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int jKLHOJOCLJD_ ;
      /**
       * <code>uint32 JKLHOJOCLJD = 3;</code>
       * @return The jKLHOJOCLJD.
       */
      @java.lang.Override
      public int getJKLHOJOCLJD() {
        return jKLHOJOCLJD_;
      }
      /**
       * <code>uint32 JKLHOJOCLJD = 3;</code>
       * @param value The jKLHOJOCLJD to set.
       * @return This builder for chaining.
       */
      public Builder setJKLHOJOCLJD(int value) {
        
        jKLHOJOCLJD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKLHOJOCLJD = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKLHOJOCLJD() {
        
        jKLHOJOCLJD_ = 0;
        onChanged();
        return this;
      }

      private int cFNJIOIOLPG_ ;
      /**
       * <code>uint32 CFNJIOIOLPG = 8;</code>
       * @return The cFNJIOIOLPG.
       */
      @java.lang.Override
      public int getCFNJIOIOLPG() {
        return cFNJIOIOLPG_;
      }
      /**
       * <code>uint32 CFNJIOIOLPG = 8;</code>
       * @param value The cFNJIOIOLPG to set.
       * @return This builder for chaining.
       */
      public Builder setCFNJIOIOLPG(int value) {
        
        cFNJIOIOLPG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CFNJIOIOLPG = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCFNJIOIOLPG() {
        
        cFNJIOIOLPG_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetCodexPushtipsReadRsp)
    }

    // @@protoc_insertion_point(class_scope:SetCodexPushtipsReadRsp)
    private static final emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp();
    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetCodexPushtipsReadRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetCodexPushtipsReadRsp>() {
      @java.lang.Override
      public SetCodexPushtipsReadRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetCodexPushtipsReadRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetCodexPushtipsReadRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetCodexPushtipsReadRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetCodexPushtipsReadRspOuterClass.SetCodexPushtipsReadRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetCodexPushtipsReadRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SetCodexPushtipsReadRsp.proto\"T\n\027SetCo" +
      "dexPushtipsReadRsp\022\023\n\013JKLHOJOCLJD\030\003 \001(\r\022" +
      "\023\n\013CFNJIOIOLPG\030\010 \001(\r\022\017\n\007retcode\030\017 \001(\005B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetCodexPushtipsReadRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetCodexPushtipsReadRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetCodexPushtipsReadRsp_descriptor,
        new java.lang.String[] { "JKLHOJOCLJD", "CFNJIOIOLPG", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
