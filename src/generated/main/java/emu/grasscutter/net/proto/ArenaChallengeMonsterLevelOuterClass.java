// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArenaChallengeMonsterLevel.proto

package emu.grasscutter.net.proto;

public final class ArenaChallengeMonsterLevelOuterClass {
  private ArenaChallengeMonsterLevelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ArenaChallengeMonsterLevelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ArenaChallengeMonsterLevel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CCKGKFMEKKL = 7;</code>
     * @return The cCKGKFMEKKL.
     */
    int getCCKGKFMEKKL();

    /**
     * <code>uint32 OAHPACPBKJM = 9;</code>
     * @return The oAHPACPBKJM.
     */
    int getOAHPACPBKJM();
  }
  /**
   * <pre>
   * Obf: EABLJPHMFFJ
   * </pre>
   *
   * Protobuf type {@code ArenaChallengeMonsterLevel}
   */
  public static final class ArenaChallengeMonsterLevel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ArenaChallengeMonsterLevel)
      ArenaChallengeMonsterLevelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArenaChallengeMonsterLevel.newBuilder() to construct.
    private ArenaChallengeMonsterLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArenaChallengeMonsterLevel() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ArenaChallengeMonsterLevel();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ArenaChallengeMonsterLevel(
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
            case 56: {

              cCKGKFMEKKL_ = input.readUInt32();
              break;
            }
            case 72: {

              oAHPACPBKJM_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.class, emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.Builder.class);
    }

    public static final int CCKGKFMEKKL_FIELD_NUMBER = 7;
    private int cCKGKFMEKKL_;
    /**
     * <code>uint32 CCKGKFMEKKL = 7;</code>
     * @return The cCKGKFMEKKL.
     */
    @java.lang.Override
    public int getCCKGKFMEKKL() {
      return cCKGKFMEKKL_;
    }

    public static final int OAHPACPBKJM_FIELD_NUMBER = 9;
    private int oAHPACPBKJM_;
    /**
     * <code>uint32 OAHPACPBKJM = 9;</code>
     * @return The oAHPACPBKJM.
     */
    @java.lang.Override
    public int getOAHPACPBKJM() {
      return oAHPACPBKJM_;
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
      if (cCKGKFMEKKL_ != 0) {
        output.writeUInt32(7, cCKGKFMEKKL_);
      }
      if (oAHPACPBKJM_ != 0) {
        output.writeUInt32(9, oAHPACPBKJM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cCKGKFMEKKL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cCKGKFMEKKL_);
      }
      if (oAHPACPBKJM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, oAHPACPBKJM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel other = (emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel) obj;

      if (getCCKGKFMEKKL()
          != other.getCCKGKFMEKKL()) return false;
      if (getOAHPACPBKJM()
          != other.getOAHPACPBKJM()) return false;
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
      hash = (37 * hash) + CCKGKFMEKKL_FIELD_NUMBER;
      hash = (53 * hash) + getCCKGKFMEKKL();
      hash = (37 * hash) + OAHPACPBKJM_FIELD_NUMBER;
      hash = (53 * hash) + getOAHPACPBKJM();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel prototype) {
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
     * Obf: EABLJPHMFFJ
     * </pre>
     *
     * Protobuf type {@code ArenaChallengeMonsterLevel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ArenaChallengeMonsterLevel)
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.class, emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.newBuilder()
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
        cCKGKFMEKKL_ = 0;

        oAHPACPBKJM_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.internal_static_ArenaChallengeMonsterLevel_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel build() {
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel buildPartial() {
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel result = new emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel(this);
        result.cCKGKFMEKKL_ = cCKGKFMEKKL_;
        result.oAHPACPBKJM_ = oAHPACPBKJM_;
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
        if (other instanceof emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel) {
          return mergeFrom((emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel other) {
        if (other == emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel.getDefaultInstance()) return this;
        if (other.getCCKGKFMEKKL() != 0) {
          setCCKGKFMEKKL(other.getCCKGKFMEKKL());
        }
        if (other.getOAHPACPBKJM() != 0) {
          setOAHPACPBKJM(other.getOAHPACPBKJM());
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
        emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cCKGKFMEKKL_ ;
      /**
       * <code>uint32 CCKGKFMEKKL = 7;</code>
       * @return The cCKGKFMEKKL.
       */
      @java.lang.Override
      public int getCCKGKFMEKKL() {
        return cCKGKFMEKKL_;
      }
      /**
       * <code>uint32 CCKGKFMEKKL = 7;</code>
       * @param value The cCKGKFMEKKL to set.
       * @return This builder for chaining.
       */
      public Builder setCCKGKFMEKKL(int value) {
        
        cCKGKFMEKKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CCKGKFMEKKL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCCKGKFMEKKL() {
        
        cCKGKFMEKKL_ = 0;
        onChanged();
        return this;
      }

      private int oAHPACPBKJM_ ;
      /**
       * <code>uint32 OAHPACPBKJM = 9;</code>
       * @return The oAHPACPBKJM.
       */
      @java.lang.Override
      public int getOAHPACPBKJM() {
        return oAHPACPBKJM_;
      }
      /**
       * <code>uint32 OAHPACPBKJM = 9;</code>
       * @param value The oAHPACPBKJM to set.
       * @return This builder for chaining.
       */
      public Builder setOAHPACPBKJM(int value) {
        
        oAHPACPBKJM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OAHPACPBKJM = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOAHPACPBKJM() {
        
        oAHPACPBKJM_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ArenaChallengeMonsterLevel)
    }

    // @@protoc_insertion_point(class_scope:ArenaChallengeMonsterLevel)
    private static final emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel();
    }

    public static emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArenaChallengeMonsterLevel>
        PARSER = new com.google.protobuf.AbstractParser<ArenaChallengeMonsterLevel>() {
      @java.lang.Override
      public ArenaChallengeMonsterLevel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ArenaChallengeMonsterLevel(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ArenaChallengeMonsterLevel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ArenaChallengeMonsterLevel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ArenaChallengeMonsterLevelOuterClass.ArenaChallengeMonsterLevel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ArenaChallengeMonsterLevel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ArenaChallengeMonsterLevel.proto\"F\n\032Ar" +
      "enaChallengeMonsterLevel\022\023\n\013CCKGKFMEKKL\030" +
      "\007 \001(\r\022\023\n\013OAHPACPBKJM\030\t \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ArenaChallengeMonsterLevel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ArenaChallengeMonsterLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ArenaChallengeMonsterLevel_descriptor,
        new java.lang.String[] { "CCKGKFMEKKL", "OAHPACPBKJM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
